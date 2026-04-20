package com.example.punch.Service;
import com.example.punch.Entity.click;
import lombok.RequiredArgsConstructor;
import com.example.punch.Repository.Userrepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class Clickservice {
    private final Userrepository userrepository;
    public click getUserByUsername(String username, String password) {
        return userrepository.findByUsernameAndPassword(username,password).orElse(null);
    }
}
