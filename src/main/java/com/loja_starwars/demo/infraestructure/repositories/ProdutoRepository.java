package com.loja_starwars.demo.infraestructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loja_starwars.demo.infraestructure.domain.ProdutosDomain;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutosDomain, Long> {

}
