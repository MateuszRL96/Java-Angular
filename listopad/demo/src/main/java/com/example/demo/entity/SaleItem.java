package com.example.demo.entity;


import jakarta.persistence.*;

@Entity
public class SaleItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long saleItemId;

    private int quantity;

    private double subtotal;

    @ManyToOne
    @JoinColumn(name = "orderId")
    private Order order;
}
