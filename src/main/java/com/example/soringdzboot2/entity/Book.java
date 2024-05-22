package com.example.soringdzboot2.entity;


import jakarta.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name = "books")

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private int count;
    private int price;

    private LocalDate dateManufacture;


    public Book(String title, int count, int price, LocalDate dateManufacture) {
        this.title = title;
        this.count = count;
        this.price = price;
        this.dateManufacture = dateManufacture;
    }
}
