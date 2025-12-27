package com.loja_starwars.demo.infraestructure.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ProdutoDTO {
    private String title;
    private int price;
    private String zipcode;
    private String seller;
    private String thumbnailHd;
    private String date;
}