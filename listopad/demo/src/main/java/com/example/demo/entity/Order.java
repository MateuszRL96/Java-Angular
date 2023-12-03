package com.example.demo.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Order {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long saleId;

    private LocalDateTime data;

    private double totalAmount;

    @ManyToOne
    @JoinColumn(name = "cashierId")
    private Employee cashier;

}
