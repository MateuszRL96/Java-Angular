package com.example.res.repozitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.res.obiekty.Powiadomienia;

public interface PowiadomieniaRepository extends JpaRepository<Powiadomienia, Long>{
    
}
