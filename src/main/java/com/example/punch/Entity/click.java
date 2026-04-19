package com.example.punch.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "click")
public class click {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int clicks;
    @Column(unique = true)
    private String username;
    private String password;

    public click(String username, String password) {
        this.username = username;
        this.password = password;
        this.clicks = 0;
    }

    public void plusClick() {
        this.clicks++;
    }
}
