package com.loja_starwars.demo.infraestructure.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class CartaoDeCreditoDTO {
    private String card_number;
    private String card_holder_name;
    private int value;
    private int cvv;
    private String exp_date;
}