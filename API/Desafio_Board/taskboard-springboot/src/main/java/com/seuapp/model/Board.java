package com.seuapp.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Board {
    @Id @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL)
    private List<TaskList> lists = new ArrayList<>();
}