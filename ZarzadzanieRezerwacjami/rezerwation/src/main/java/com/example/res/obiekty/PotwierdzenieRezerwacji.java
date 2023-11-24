package com.example.res.obiekty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Potwierdenie")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PotwierdzenieRezerwacji {
 
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int idRezerwacji; //-> Rezerwacje
    private Date dataPotwierdzenia;
    private int kodPotwierdzenia;
}
