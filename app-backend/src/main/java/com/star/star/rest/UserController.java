package com.star.star.rest;

import com.star.star.dto.UserLogin;
import com.star.star.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.star.star.service.UserService;

@CrossOrigin(origins = "http://localhost:9999", maxAge = 3600)
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public User register(@RequestBody User user){
        return userService.register(user);
    }


    @RequestMapping(value = "login",method = RequestMethod.POST)
    public User login(@RequestBody UserLogin user){
        return  userService.login(user.getUsername(),user.getPassword());
    }

    @RequestMapping(value="/message",method = RequestMethod.GET)
    public String print(){
        return "Merge!";
    }


}
