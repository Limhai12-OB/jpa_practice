package com.example.jpademo.controller;

import com.example.jpademo.dto.request.UserRequest;
import com.example.jpademo.dto.response.UserResponse;
import com.example.jpademo.repository.UserRepository;
import com.example.jpademo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public UserResponse createUser(@RequestBody UserRequest request){
        return userService.createUser(request);
    }

    @GetMapping("")
    public List<UserResponse> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserResponse getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @PutMapping("/{id}")
    public UserResponse updateUser(@PathVariable Long id, @RequestBody UserRequest request){
        return userService.updateUser(id, request);
    }
}
