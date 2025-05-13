package com.seuapp.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TaskList {
    @Id @GeneratedValue
    private Long id;
    private String title;

    @ManyToOne
    private Board board;

    @OneToMany(mappedBy = "taskList", cascade = CascadeType.ALL)
    private List<Card> cards = new ArrayList<>();
}