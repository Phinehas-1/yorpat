package com.bigdecimal.yorpat;

import java.sql.Date;
import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private UserRepository adminUserRepository;

    @GetMapping
    public ResponseEntity<User> getUserByProperty(@RequestParam String by, @RequestParam String value) {
        log.debug("GET /user endpoint handling request at " + Date.from(Instant.now()));
        value = by.equals("phone_number") ? value : "invalid";

        return adminUserRepository.findByPhoneNumber(value)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
