package com.example.res.obiekty;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
