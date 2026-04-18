package com.example.punch.Repository;

import com.example.punch.Entity.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Userrepository extends JpaRepository<user, String> {
    Optional<user> findByUsername(String username);
}
