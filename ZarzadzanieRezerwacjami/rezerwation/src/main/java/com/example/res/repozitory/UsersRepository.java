package com.example.res.repozitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.res.obiekty.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{
    
}
