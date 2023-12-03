package com.example.demo.entity;


import jakarta.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private String name;
    private Long price;
    private int stactQuantity;
    @ManyToOne
    @JoinColumn(name = "categoruId")
    private Category category;

}
