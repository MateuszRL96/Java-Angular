package com.example.res.obiekty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private int id;
    private String nazwa;
    private String opis;
    private String adress;
    private TypRezerwacji typRezerwacji;
    
    
}
