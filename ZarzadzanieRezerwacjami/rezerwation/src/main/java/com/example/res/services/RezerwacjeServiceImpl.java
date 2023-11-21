package com.example.res.services;

import java.util.List;

import com.example.res.obiekty.Rezerwacje;
import com.example.res.repozitory.RezerwacjeRepository;

public class RezerwacjeServiceImpl implements RezerwacjeSevice{

    private final RezerwacjeRepository rezerwacjeRepository;

    //@Autowired
    public RezerwacjeServiceImpl(RezerwacjeRepository rezerwacjeRepository) {
        this.rezerwacjeRepository = rezerwacjeRepository;
    }
    @Override
    public List<Rezerwacje> getAllRezerwacje() {
        return rezerwacjeRepository.findAll();
    }

    @Override
    public Rezerwacje getRezerwacjeById(Long rezerwacjeId) {
        return rezerwacjeRepository.findById(rezerwacjeId).orElse(null);
     }

    @Override
    public void saveRezerwacje(Rezerwacje rezerwacje) {
        rezerwacjeRepository.save(rezerwacje);
    }

    @Override
    public void deleteRezerwacje(Long rezerwacjeId) {
        rezerwacjeRepository.deleteById(rezerwacjeId);
    }
    
}
