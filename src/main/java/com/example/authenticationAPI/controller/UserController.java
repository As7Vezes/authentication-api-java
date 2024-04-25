package com.example.authenticationAPI.controller;


import com.example.authenticationAPI.dto.CreateUserDto;
import com.example.authenticationAPI.dto.LoginUserDto;
import com.example.authenticationAPI.dto.RecoveryJwtTokenDto;
import com.example.authenticationAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<RecoveryJwtTokenDto> authenticateUser (@RequestBody LoginUserDto loginUserDto) {
        RecoveryJwtTokenDto token = userService.authenticateUser(loginUserDto);
        return new ResponseEntity<>(token, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> createUser (@RequestBody CreateUserDto createUserDto) {
        userService.createUser(createUserDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/test/customer")
    public ResponseEntity<String> getAuthenticationTest() {
        return new ResponseEntity<>("Cliente autenticado com sucesso", HttpStatus.OK);
    }

    @GetMapping("/test/administrdor")
    public ResponseEntity<String> getAdminAuthenticationTest () {
        return new ResponseEntity<>("Administrador autenticado com sucesso", HttpStatus.OK);
    }


}
