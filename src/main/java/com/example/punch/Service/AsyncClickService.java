package com.example.punch.Service;

import com.example.punch.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AsyncClickService {
    private final UserRepository userrepository;

    @Async
    @Transactional
    public void ClickAsync(String username, String password){
        userrepository.findByUsernameAndPassword(username, password).
                ifPresent(user -> {
                    user.plusClick();
                });
    }
}
