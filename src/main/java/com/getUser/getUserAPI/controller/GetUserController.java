package com.getUser.getUserAPI.controller;

import com.getUser.getUserAPI.model.User;
import com.getUser.getUserAPI.service.UserService.GetUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class GetUserController {

    @Autowired
    GetUserService getUserService;

    @GetMapping("/getAll")
    public List<User> getAllUsers(){
        return this.getUserService.getAllUser();
    }

    @GetMapping("/get/{id}")
    public User getUserById(@PathVariable("id") Long id){
        User user = this.getUserService.getUserById(id);
        return user;
    }
}
