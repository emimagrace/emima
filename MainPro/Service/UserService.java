package com.MyProject.MainPro.Service;

import com.MyProject.MainPro.Model.User;
import com.MyProject.MainPro.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    public UserRepository userRepository;
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return  users;
    }


    public void addUser(User user) {
        userRepository.save(user);
    }




    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public void updateUser(User user) {
        userRepository.save(user);
    }
}
