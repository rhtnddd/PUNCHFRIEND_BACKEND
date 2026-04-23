package com.example.punch.Service;
import com.example.punch.Entity.click;
import lombok.RequiredArgsConstructor;
import com.example.punch.Repository.Userrepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class Clickservice {
    private final Userrepository userrepository;
    private final AsyncClickService asyncClickService;

    public click getClickCounts(String username, String password) {
        return userrepository.findByUsernameAndPassword(username,password).orElse(null);
    }

    public List<click> getAllByClickCounts(){
        return userrepository.findAll();
    }

    public void ClickAsync(String username, String password) {
        click user = userrepository.findByUsername(username).
                orElseGet(()-> userrepository.save(new click(username,password)));

        if(!user.getUsername().equals(username)){
            throw new RuntimeException("비밀번호 틀림");
        }

        asyncClickService.ClickAsync(username,password);
    }
}
