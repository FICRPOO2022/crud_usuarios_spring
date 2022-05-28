package com.example.crudUsuarios.repository;

import com.example.crudUsuarios.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Usuario, Long> {
}
