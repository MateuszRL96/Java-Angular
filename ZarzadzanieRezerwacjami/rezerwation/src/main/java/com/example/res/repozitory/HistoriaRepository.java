package com.example.res.repozitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.res.obiekty.Historia;

public interface HistoriaRepository extends JpaRepository<Historia, Long>{
    
}
