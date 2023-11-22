package com.example.res.kontrolery;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.res.obiekty.Users;
import com.example.res.services.UserServices;

@RestController
@RequestMapping("/api/users")
public class UserController {


    private final UserServices userServices;

    //@Autowired
    public UserController(UserServices userServices)
    {
        this.userServices = userServices;
    }

    @GetMapping
    public ResponseEntity<List<Users>> getAllUsers()
    {
        List<Users> users = userServices.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<Users> getUserById(@PathVariable Long userId)
    {
        Users users = userServices.getUserById(userId);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Users> createUser(@RequestBody Users users)
    {
        Users createdUser = userServices.saveUser(users);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);

    }
    
}
