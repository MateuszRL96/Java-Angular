package com.example.res.obiekty;

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
    private int id;
    private String login;
    private String password;
    private String imie;
    private String nazwisko;
    private String email;
    private String number;
}
