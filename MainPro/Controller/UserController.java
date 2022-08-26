package com.MyProject.MainPro.Controller;

import com.MyProject.MainPro.Model.User;
import com.MyProject.MainPro.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController
{
    @Autowired
    private UserService userService;
    @GetMapping(value = "/user")
    public List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

//    @PostMapping(method = RequestMethod.POST,value = "/user/create")
    @PostMapping("/user/create")
    public  void addUser(@RequestBody User user)
    {
        userService.addUser(user);
    }

    @PutMapping(value = "user/update")
   public void updateUser(@PathVariable Long id,@RequestBody User user)
   {
       userService.updateUser(user);
   }

    @DeleteMapping(value = "user/delete/{id}")
    public void deleteUser(@PathVariable Long id)
    {
        userService.deleteUser(id);
    }
}
