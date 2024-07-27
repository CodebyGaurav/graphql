package com.codebygaurav.graphql.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "project_books")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;
    private String author;
    private double price;
    private int pages;
}
