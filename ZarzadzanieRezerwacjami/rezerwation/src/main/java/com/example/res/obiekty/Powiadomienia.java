package com.example.res.obiekty;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

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
    private Date dataWyslania;
    
}
