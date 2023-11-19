package com.example.res.obiekty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private int id;
    private int idUzytkownika;
    private TypPowiadomien typPowiadomien;
    private String tresc;
    private Data dataWyslania;
    
}
