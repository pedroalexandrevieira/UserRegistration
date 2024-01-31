package com.example.testCanadWithGradlle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.testCanadWithGradlle.model.User;
import com.example.testCanadWithGradlle.service.UserService;

import java.util.List;

@RequestMapping("/userProfile")
@RestController
public class UserController {

    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        super();
        this.userService = userService;
    }

    @PostMapping(value = "/createUserProfile")
    public ResponseEntity<?> createUserProfile(@RequestBody User user) {
        try {
            userService.save(user);
            return ResponseEntity.ok("User created!");
        }
        catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.ALREADY_REPORTED).body(e.toString());
        }
    }

    @DeleteMapping(value = "/deleteUserProfile/{userId}")
    public ResponseEntity<?> deleteUserProfileById(@PathVariable (value="userId") Long userId) {
        try {
            userService.delete(userId);
            return ResponseEntity.ok("User deleted!");
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.toString());
        }
    }

    @GetMapping(value = "/getUserProfile/{userId}")
    public User getUserProfileById(@PathVariable (value="userId") Long userId) {
        return userService.getUserById(userId);
    }

    @GetMapping(value = "/getAllUsersProfiles")
    public List<User> getAllUsersProfiles() {
        return userService.getAllUsersProfiles();
    }

    @PutMapping(value = "/updateUserProfile/{userId}")
    public ResponseEntity<?> updateUserProfile(@PathVariable (value="userId") Long userId, @RequestBody User user) {
        try {
            User currentUser = userService.getUserById(userId);
            userService.update(currentUser, user);
            return ResponseEntity.ok("User updated!");
        }
        catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.ALREADY_REPORTED).body(e.toString());
        }
    }

    @GetMapping("/dataFromJava")
    public String getDataFromJava() {
        return "Hello from Java!";
    }
}
