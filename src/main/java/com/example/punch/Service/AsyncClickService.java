package com.example.punch.Service;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import com.example.punch.Entity.click;
import com.example.punch.Repository.Userrepository;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AsyncClickService {
    private final Userrepository userrepository;

    @Async
    @Transactional
    public void ClickAsync(String username, String password){
        userrepository.findByUsernameAndPassword(username, password).
                ifPresent(user -> {
                    user.plusClick();
                });
    }
}
