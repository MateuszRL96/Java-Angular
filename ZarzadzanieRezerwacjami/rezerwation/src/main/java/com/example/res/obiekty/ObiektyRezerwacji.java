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
@Table(name = "ObiektyRezerwacji")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ObiektyRezerwacji {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nazwa;
    private String opis;
    private String adress;
    private TypRezerwacji typRezerwacji;
    
    
}
