package com.seuapp.model;

import jakarta.persistence.*;

@Entity
public class Card {
    @Id @GeneratedValue
    private Long id;
    private String title;
    private String description;

    @ManyToOne
    private TaskList taskList;
}