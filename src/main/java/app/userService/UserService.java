package app.userService;

import app.entity.User;

import java.util.List;

    public interface UserService {
        public void addUser(User user);
        public List<User> getAllUsers();
        public void deleteUser(User user);
        public void changeUser();

        public User getUser(int id);

    }


