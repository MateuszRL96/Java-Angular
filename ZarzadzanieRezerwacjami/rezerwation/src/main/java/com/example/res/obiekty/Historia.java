package com.example.res.obiekty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "Historia")
@NoArgsConstructor
@AllArgsConstructor
public class Historia {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int idRezerwacji;
    private int idUzytkownika;
    private Date dataAkcji;
    
    
}

