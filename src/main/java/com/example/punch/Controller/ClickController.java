package com.example.punch.Controller;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.punch.Service.ClickService;
import com.example.punch.Entity.click;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ClickController {
    private final ClickService clickservice;
    @GetMapping
    public click getClickCounts(@RequestParam String username, @RequestParam String password) {
        return clickservice.getClickCounts(username, password);
    }

    @GetMapping("/all")
    public List<click> getAllClickCounts(@RequestParam String username, @RequestParam String password) {
        return clickservice.getAllByClickCounts();
    }

    @PostMapping
    public void ClickAsync(@RequestParam String username, @RequestParam String password) {
        clickservice.ClickAsync(username, password);
    }
}
