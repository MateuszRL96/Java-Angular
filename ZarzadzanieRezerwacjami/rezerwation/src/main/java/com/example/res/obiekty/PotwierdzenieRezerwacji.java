package com.example.res.obiekty;

import jakarta.persistence.Entity;
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
    private int id;
    //private int idRezerwacji -> Rezerwacje
    private Data dataPotwierdzenia;
    private int kodPotwierdzenia;
}
