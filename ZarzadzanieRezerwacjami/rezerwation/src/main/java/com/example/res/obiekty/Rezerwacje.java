package com.example.res.obiekty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
