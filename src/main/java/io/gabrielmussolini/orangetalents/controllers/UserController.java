package io.gabrielmussolini.orangetalents.controllers;

import io.gabrielmussolini.orangetalents.controllers.DTOs.UserRq;
import io.gabrielmussolini.orangetalents.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody UserRq user){
        userService.create(user);
    }

}
