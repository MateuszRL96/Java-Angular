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
@Table(name = "users")//user domyslnie jest zajety
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String login;
    private String password;
    private String imie;
    private String nazwisko;
    private String email;
    private String number;
}
