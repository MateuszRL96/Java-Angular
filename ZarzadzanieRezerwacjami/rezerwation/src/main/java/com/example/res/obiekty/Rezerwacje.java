package com.example.res.obiekty;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "rezervation")
public class Rezerwacje {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date dataStart;
    private Date dataEnd;
    private int idUzytkownika;// -> z Users
    private int idObiektRezerwacji;// ->z ObiektyRezerwacji



}
