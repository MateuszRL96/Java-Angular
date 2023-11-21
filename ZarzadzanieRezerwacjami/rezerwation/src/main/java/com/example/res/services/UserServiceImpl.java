package com.example.res.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.res.obiekty.Users;
import com.example.res.repozitory.UsersRepository;

public class UserServiceImpl implements UserServices{

    private final UsersRepository usersRepository;

    @Autowired
    public UserServiceImpl(UsersRepository usersRepository)
    {
        this.usersRepository=usersRepository;
    }

    @Override
    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }

    @Override
    public Users getUserById(Long userId) {
        return usersRepository.findById(userId).orElse(null);
    }

    @Override
    public void saveUser(Users users) {
        usersRepository.save(users);
    }

    @Override
    public void deleteUsers(Long userid) {
        usersRepository.deleteById(userid);
    }
    
}
