package ra.controller;

import ra.config.Constants;
import ra.model.User;
import ra.service.UserService;
import ra.ultil.DataBase;

import java.util.List;

public class UserController {

    private UserService userService;

    public UserController() {
    userService = new UserService();
    }

    public List<User> findAll() {
        return userService.findAll();

    }


    public void save(User user) {
    userService.save(user);    }


    public void delete(Integer id) {
       userService.delete(id);

    }

    public User findById(Integer id) {
     return userService.findById(id);
    }
    public void changeStatus(Integer id){
     userService.delete(id);
}
}
