package com.example.crudUsuarios.repository;

import com.example.crudUsuarios.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    
}
