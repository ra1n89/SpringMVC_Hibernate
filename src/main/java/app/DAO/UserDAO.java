package app.DAO;

import app.entity.User;

import java.util.List;

public interface UserDAO {
    public void addUser(User user);
    public List<User> getAllUsers();
    public void deleteUser(User user);
    public void changeUser();

    User getUser(int id);
}
