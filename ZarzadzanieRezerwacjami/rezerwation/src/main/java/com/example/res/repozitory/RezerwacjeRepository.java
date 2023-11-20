package com.example.res.repozitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.res.obiekty.Rezerwacje;

public interface RezerwacjeRepository extends JpaRepository<Rezerwacje, Long>{
    
}
