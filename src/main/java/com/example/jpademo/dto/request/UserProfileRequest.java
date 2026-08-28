package com.example.jpademo.dto.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserProfileRequest {

    private String firstName;
    private String lastName;
    private String bio;
    private String phone;
}
