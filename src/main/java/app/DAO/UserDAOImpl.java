package app.DAO;

import app.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO{


    SessionFactory sessionFactory;

    @Autowired
    public UserDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        System.out.println("DAO" + user);
        session.saveOrUpdate(user);
    }

    @Override
    public List<User> getAllUsers() {

        Session session = sessionFactory.getCurrentSession();
        List<User> users = session.createQuery("from User").getResultList();
        return users;
    }

    @Override
    public void deleteUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(user);
    }

    @Override
    public void changeUser() {
        Session session = sessionFactory.getCurrentSession();


    }

    @Override
    public User getUser(int id) {
        Session session = sessionFactory.getCurrentSession();
        User user =  session.get(User.class, id);
        return  user;
    }
}
