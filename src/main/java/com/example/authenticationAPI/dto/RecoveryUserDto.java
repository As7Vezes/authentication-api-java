package com.example.authenticationAPI.dto;
import com.example.authenticationAPI.entity.Role;

import java.util.List;

public record RecoveryUserDto (

    Long id,
    String email,
    List<Role> role

){

}

