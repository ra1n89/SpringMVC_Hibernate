package app.controller;

import app.entity.User;
import app.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserController {
    UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public String showUserPage(Model model){

//        User user1 = new User("Pete", "Smirnov", 23);
//        User user2 = new User("Mark", "Twen", 33);
//        User user3 = new User("John", "Smit", 22);
//        userService.addUser(user1);
//        userService.addUser(user2);
//        userService.addUser(user3);
        List<User> usersList = userService.getAllUsers();
        model.addAttribute("user", usersList);
        return "user";
    }

    @RequestMapping(value = "/add")
    public String showAddUserPage(@ModelAttribute User user, Model model){
        //36
        // User user = new User();
        model.addAttribute("user1", user);

        return "addUser";
    }

    @RequestMapping("/adding")
    public String showAddingPage(@ModelAttribute ("user1") User user){

        System.out.println("/adding" + user);
        userService.addUser(user);

        return "redirect:/user";
    }

    @RequestMapping("/changing")
    public String showChangingPage(@RequestParam(value="id", required = false) int id, Model model){
        System.out.println("id"+id);
        User user = userService.getUser(id);
        System.out.println("changing" + user);
        model.addAttribute("user1", user);

        return "addUser";
    }

    @RequestMapping("/delete")
    public String showDeletePage(@RequestParam(value="id", required = false) int id, Model model){
        System.out.println("id"+id);
        User user = userService.getUser(id);
        userService.deleteUser(user);
        System.out.println("changing" + user);


        return "redirect:/user";
    }
}
