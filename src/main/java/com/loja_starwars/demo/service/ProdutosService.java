package com.loja_starwars.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loja_starwars.demo.infraestructure.domain.ProdutosDomain;
import com.loja_starwars.demo.infraestructure.dto.ProdutoDTO;
import com.loja_starwars.demo.infraestructure.repositories.ProdutoRepository;

@Service

public class ProdutosService {

    @Autowired
    private ProdutoRepository produtos;

    private boolean isVazio(String valor) {
        return valor == null || valor.isBlank();
    }

    public ProdutosDomain cadastrarProduto(ProdutoDTO dto) {

        if (isVazio(dto.getDate()) || 
        isVazio(dto.getTitle()) || 
        isVazio(dto.getZipcode()) || 
        isVazio(dto.getThumbnailHd())) {
            throw new RuntimeException("As informações não podem estar vazias.");
        }
        
        if (dto.getPrice() < 0) {
            throw new RuntimeException("O preço deve ter valor positivo.");
        }

        ProdutosDomain novoProduto = new ProdutosDomain(
            null,
            dto.getTitle(),
            dto.getPrice(),
            dto.getZipcode(),
            dto.getSeller(),
            dto.getThumbnailHd(),
            dto.getDate()
        );

        System.out.println(novoProduto);
        
        return produtos.save(novoProduto);
    }
}
