package com.example.punch.Entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "click")
public class click {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int clicks;
    private boolean ban;
}
