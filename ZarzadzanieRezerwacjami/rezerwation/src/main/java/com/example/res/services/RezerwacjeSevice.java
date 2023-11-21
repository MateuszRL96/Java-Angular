package com.example.res.services;

import java.util.List;

import com.example.res.obiekty.Rezerwacje;

public interface RezerwacjeSevice {
    List<Rezerwacje> getAllRezerwacje();
    Rezerwacje getRezerwacjeById(Long rezerwacjeId);
    void saveRezerwacje(Rezerwacje rezerwacje);
    void deleteRezerwacje(Long rezerwacjeId);
    
}
