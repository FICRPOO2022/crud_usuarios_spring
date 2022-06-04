package com.example.crudUsuarios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudUsuarios.model.Produto;
import com.example.crudUsuarios.repository.ProdutoRepo;

@RestController
@RequestMapping(value="/produtos")
public class ProdutoController {
    @Autowired
    public ProdutoRepo produtoRepo;

    @GetMapping
    public List<Produto> listAll(){
        return produtoRepo.findAll();
    }

    @PostMapping
    public Produto create(@RequestBody Produto novoProduto) {
        return produtoRepo.save(novoProduto);
    }
}
