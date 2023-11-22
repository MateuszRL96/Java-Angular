package com.example.res.obiekty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Potwierdenie")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PotwierdzenieRezerwacji {
 
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //private int idRezerwacji -> Rezerwacje
    private Data dataPotwierdzenia;
    private int kodPotwierdzenia;
}
