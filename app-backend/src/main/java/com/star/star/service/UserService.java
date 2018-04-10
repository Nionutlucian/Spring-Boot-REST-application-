package com.star.star.service;

import com.star.star.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.star.star.repository.UserRepository;

import javax.transaction.Transactional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    @Transactional
    public User register(User user){

        userRepository.save(user);

        return user;
    }


    @Transactional
    public User login(String username,String password){
        if(userRepository.loginQuery(username,password) != null){
            return userRepository.loginQuery(username,password);
        }
        else{
            return null;
        }
    }

}
