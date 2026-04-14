package com.example.punch.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClickController {
    @GetMapping("/click")
    public int Click (int click) {
        return click;
    }
    @PostMapping("/new")
    public String newClick() {}
}
