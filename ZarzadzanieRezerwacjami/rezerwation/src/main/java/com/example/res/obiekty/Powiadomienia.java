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
@Table(name = "Powiadomienia")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Powiadomienia {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int idUzytkownika;
    private TypPowiadomien typPowiadomien;
    private String tresc;
    private Data dataWyslania;
    
}
