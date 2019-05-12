package com.mastertheboss.springboot.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.mastertheboss.springboot.model.User;

@Component("userService")
@Transactional
class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    public UserServiceImpl( ) { }

    @Override
    public User getUser(String name, String country) {
        Assert.notNull(name, "Name must not be null");
        Assert.notNull(country, "Country must not be null");
        return this.userRepository.findByNameAndCountryAllIgnoringCase(name, country);
    }

    @Override
    public List<User> findAll() {

        return this.userRepository.findAll();
    }

}