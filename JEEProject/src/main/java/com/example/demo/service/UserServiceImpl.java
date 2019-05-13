package com.example.demo.service;


import com.example.demo.model.User;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("userService")
@Transactional
class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    public UserServiceImpl( ) { }


    @Override
    public List<User> findAll() {

        return this.userRepository.findAll();
    }

}