package com.example.punch.Service;
import com.example.punch.Entity.click;
import lombok.RequiredArgsConstructor;
import com.example.punch.Repository.Userrepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Clickservice {
    private final Userrepository userrepository;
    public click getUserByUsername(String username) {
        return userrepository.findByUsername(username);
    }
}
