package app.userService;

import app.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserList {

    static List<User> usersList = new ArrayList<>();
    public static List<User> addUserToList(User user){
        usersList.add(user);
        return usersList;
    }
}
