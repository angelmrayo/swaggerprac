package com.example.demo;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    private List<String> users = new ArrayList<>();

    public UserController() {
        users.add("sss");
        users.add("bbb");
        users.add("zzz");
    }

    @GetMapping(value="users")
    public ResponseEntity<List<String>> findAll() {
        return ResponseEntity.ok(users);
    }

    @PostMapping(value="users")
    public ResponseEntity<String> create(String request)
    {
        users.add(request);
        return ResponseEntity.ok(request);
    }
}
