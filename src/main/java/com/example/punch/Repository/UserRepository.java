package com.example.punch.Repository;

import com.example.punch.Entity.click;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<click, Long> {
    Optional<click> findByUsername(String username);
    Optional<click> findByUsernameAndPassword(String username, String password);
}
