package com.example.res.services;

import java.util.List;

import com.example.res.obiekty.Users;

public interface UserServices {
    List<Users> getAllUsers();
    Users getUserById(Long userId);
    Users saveUser(Users users);
    void deleteUsers(Long userid);

}
