package com.loja_starwars.demo.infraestructure.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "transacao")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

public class TransacaoDomain {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, length=100)
    private String client_id;

    @Column(nullable=false, length=100)
    private String client_name;

    @Column(nullable=false, length=100)
    private int total_to_pay;

    @Column(nullable=false, length=100)
    private CartaoDeCreditoDomain credit_card;
}
