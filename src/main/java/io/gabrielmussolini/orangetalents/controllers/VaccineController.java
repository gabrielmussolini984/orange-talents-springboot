package io.gabrielmussolini.orangetalents.controllers;

import io.gabrielmussolini.orangetalents.controllers.DTOs.UserRq;
import io.gabrielmussolini.orangetalents.controllers.DTOs.VaccineRq;
import io.gabrielmussolini.orangetalents.models.User;
import io.gabrielmussolini.orangetalents.models.Vaccine;
import io.gabrielmussolini.orangetalents.repository.UserRepository;
import io.gabrielmussolini.orangetalents.repository.VaccineRepository;
import io.gabrielmussolini.orangetalents.services.UserService;
import io.gabrielmussolini.orangetalents.services.VaccineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
@RequestMapping("/vaccine")
public class VaccineController {
    @Autowired
    private VaccineService vaccineService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@Valid @RequestBody VaccineRq vaccine){
        vaccineService.create(vaccine);
    }
}
