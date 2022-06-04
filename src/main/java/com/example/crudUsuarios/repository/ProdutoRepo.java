package com.example.crudUsuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudUsuarios.model.Produto;

public interface ProdutoRepo extends JpaRepository<Produto, Long> {
    
}
