package com.example.res.obiekty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "rezervation")
public class Rezerwacje {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Data dataStart;
    private Data dataEnd;
    //private int idUzytkownika -> z Users
    //private int idObiektRezerwacji ->z ObiektyRezerwacji



}
