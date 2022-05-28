package com.example.crudUsuarios.controller;

import java.util.List;

import com.example.crudUsuarios.model.Usuario;
import com.example.crudUsuarios.repository.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.NonNull;

@RestController
@RequestMapping(value="/users")
public class UserController {
    
    @Autowired
    private UserRepo userRepo;

    @GetMapping
    public List<Usuario> findAll(){
        return userRepo.findAll();
    }

    @PostMapping
    public Usuario save(@RequestBody Usuario newUser) {
        return userRepo.save(newUser);
    }

    @PutMapping
    public Usuario update(@RequestBody Usuario updateUser) {
        return userRepo.save(updateUser);
    }


}
