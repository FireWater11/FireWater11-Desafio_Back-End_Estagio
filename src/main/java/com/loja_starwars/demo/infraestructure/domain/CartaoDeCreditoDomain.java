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
@Table(name = "cartao")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

public class CartaoDeCreditoDomain {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "card_number", nullable=false, length=100)
    private String card_number;

    @Column(name = "card_holder_name", nullable=false, length=100)
    private String card_holder_name;

    @Column(name = "amount", nullable=false, length=100)
    private Integer amount;

    @Column(name = "cvv", nullable=false, length=100)
    private Integer cvv;

    @Column(name = "exp_date", nullable=false, length=100)
    private String exp_date;
}
