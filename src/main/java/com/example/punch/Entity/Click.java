package com.example.punch.Entity;

import jakarta.persistence.*;

@Table(name = "Clickany")
public class Click {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(unique = true)
    private String username;
    private int click;


}
