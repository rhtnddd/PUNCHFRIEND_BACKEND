package com.example.punch.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.cglib.core.Block;

@Getter
@Entity
@Table(name = "Clickany")
public class Click {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(unique = true)
    private String username;
    private String password;
    private int click;
    private boolean banned;
}
