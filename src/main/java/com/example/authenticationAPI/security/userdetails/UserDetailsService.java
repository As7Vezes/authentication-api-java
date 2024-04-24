package com.example.authenticationAPI.security.userdetails;

import com.example.authenticationAPI.entity.User;
import com.example.authenticationAPI.exception.NotFoundException;
import com.example.authenticationAPI.repository.UserRepository;
import com.example.authenticationAPI.security.userdetails.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) {
        User user = getSubscriptionType(email);

        return new UserDetailsImpl(user);
    }

    private User getSubscriptionType(String email) {
        Optional<User> user = userRepository.findByEmail(email);

        if(user.isEmpty()) {
            throw new NotFoundException("Usuário não encontrado");
        }
        return user.get();
    }


}
