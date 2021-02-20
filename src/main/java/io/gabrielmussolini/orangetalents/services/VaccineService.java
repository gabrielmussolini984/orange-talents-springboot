package io.gabrielmussolini.orangetalents.services;

import io.gabrielmussolini.orangetalents.controllers.DTOs.VaccineRq;
import io.gabrielmussolini.orangetalents.models.Vaccine;
import io.gabrielmussolini.orangetalents.repository.UserRepository;
import io.gabrielmussolini.orangetalents.repository.VaccineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

public class VaccineService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private VaccineRepository vaccineRepository;

    public void create(VaccineRq vaccine){
        var userExist = userRepository.findByEmail(vaccine.getEmail());
        if (userExist == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
        var v = new Vaccine();
        v.setName(vaccine.getName());
        v.setEmail(vaccine.getEmail());
        v.setAppliedAt(vaccine.getAppliedAt());
        vaccineRepository.save(v);
    }
}
