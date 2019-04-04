package com.ocloudwork.cloud.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ocloudwork.cloud.service.dao.UserRepository;
import com.ocloudwork.cloud.service.domain.User;

@Service
@Scope(value="singleton")//default "singleton",可声明成：prototype,singleton
public class TestService {

    @Autowired
    private UserRepository userRepository;

    
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    
    @Transactional
    public User saveUser() {
    	User user=new User("minghui",32);
        return userRepository.save(user);
    }
}
