package com.loja_starwars.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loja_starwars.demo.infraestructure.dto.ProdutoDTO;
import com.loja_starwars.demo.service.ProdutosService;

@RestController
@RequestMapping("/starstore")

public class ProdutoController {

    private final ProdutosService produtos;

    public ProdutoController(ProdutosService produtos) {
        this.produtos = produtos;
    }

    @PostMapping("/products")
    public String cadastrarProduto(@RequestBody ProdutoDTO body) {
        
        return "Produto cadastrado.";
    }



}
