package com.loja_starwars.demo.infraestructure.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class TransacaoDTO {
    private String client_id;
    private String client_name;
    private int total_to_pay;
    private CartaoDeCreditoDTO credit_card;
}