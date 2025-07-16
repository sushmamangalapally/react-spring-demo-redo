package com.example.demo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*") // Allow frontend calls
public class MessageController {

    private List<String> messages = new ArrayList<>();

    @GetMapping("/messages")
    public List<String> getMessages() {
        return messages;
    }

    @PostMapping("/messages")
    public void addMessage(@RequestBody String msg) {
        messages.add(msg);
    }
}
