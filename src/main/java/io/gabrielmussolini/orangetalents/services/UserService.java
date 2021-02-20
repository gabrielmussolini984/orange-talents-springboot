package io.gabrielmussolini.orangetalents.services;

import io.gabrielmussolini.orangetalents.controllers.DTOs.UserRq;
import io.gabrielmussolini.orangetalents.models.User;
import io.gabrielmussolini.orangetalents.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void create(UserRq user) {
        var userExist = userRepository.findByEmail(user.getEmail());
        if (userExist != null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        var u = new User();
        u.setName(user.getName());
        u.setEmail(user.getEmail());
        u.setCpf(user.getCpf());
        u.setBornAt(user.getBornAt());
        userRepository.save(u);
    }
}
