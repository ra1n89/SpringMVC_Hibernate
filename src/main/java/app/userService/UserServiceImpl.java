package app.userService;

import app.DAO.UserDAO;
import app.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class UserServiceImpl implements UserService{
    //UserDAO userDAO = new UserDAOImpl();

    UserDAO userDAO;
    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Transactional
    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Transactional
    @Override
    public List<User> getAllUsers() {

        return userDAO.getAllUsers();
    }

    @Transactional
    @Override
    public void deleteUser(User user) {
        userDAO.deleteUser(user);
    }

    @Transactional
    @Override
    public void changeUser() {
        userDAO.changeUser();
    }

    @Transactional
    @Override
    public User getUser(int id) {

        return userDAO.getUser(id);
    }
}
