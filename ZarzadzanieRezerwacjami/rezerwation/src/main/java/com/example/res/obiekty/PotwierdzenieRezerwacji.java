package com.example.res.obiekty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
