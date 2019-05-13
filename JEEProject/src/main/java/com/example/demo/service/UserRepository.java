package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;
import org.springframework.data.repository.Repository;

interface UserRepository extends Repository<User, Long> {

    List<User> findAll();

}