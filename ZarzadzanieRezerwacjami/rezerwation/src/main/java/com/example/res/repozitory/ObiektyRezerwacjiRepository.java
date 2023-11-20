package com.example.res.repozitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.res.obiekty.ObiektyRezerwacji;

public interface ObiektyRezerwacjiRepository extends JpaRepository<ObiektyRezerwacji, Long>{
    
}
