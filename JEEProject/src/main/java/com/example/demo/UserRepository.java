package com.example.demo;

import java.util.List;
import org.springframework.data.repository.Repository;

interface UserRepository extends Repository<User, Long> {

    List<User> findAll();

}