package com.example.punch.Repository;

import com.example.punch.Entity.click;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Userrepository extends JpaRepository<click, String> {
    Optional<click> findByUsername(String username);
}
