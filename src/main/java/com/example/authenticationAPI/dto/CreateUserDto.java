package com.example.authenticationAPI.dto;
import com.example.authenticationAPI.enums.RoleName;

public record  CreateUserDto (

    String email,
    String password,
    RoleName role

){

}
