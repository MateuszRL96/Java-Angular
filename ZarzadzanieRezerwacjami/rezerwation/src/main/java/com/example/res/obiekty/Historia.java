package com.example.res.obiekty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Historia")
@NoArgsConstructor
@AllArgsConstructor
public class Historia {

    @Id
    private int id;
    private int idRezerwacji;
    private int idUzytkownika;
    private Data dataAkcji;
    
    
}
