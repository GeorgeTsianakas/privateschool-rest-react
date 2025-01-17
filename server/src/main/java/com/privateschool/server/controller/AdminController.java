package com.privateschool.server.controller;

import com.privateschool.server.model.User;
import com.privateschool.server.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/admin") //To reach here; api/admin/**
public class AdminController {

    @Autowired
    private IUserService userService;

    //GET http://localhost:8080/api/admin/all
    //Reachable by just ADMIN
    @GetMapping("all")
    public ResponseEntity<?> getAllUsers() {
        return ResponseEntity.ok(userService.findAllUsers());
    }

    //DELETE http://localhost:8080/api/admin/{userId}
    @DeleteMapping("{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable Long userId) {
        User user = userService.deleteUser(userId);
        return ResponseEntity.ok(user);
    }

}
