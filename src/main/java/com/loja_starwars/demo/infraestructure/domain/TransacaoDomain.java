package com.loja_starwars.demo.infraestructure.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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

    @Column(name = "client_id", nullable=false, length=100)
    private String client_id;

    @Column(name = "client_name", nullable=false, length=100)
    private String client_name;

    @Column(name = "total_to_pay", nullable=false, length=100)
    private Integer total_to_pay;

    // @Column(name = "CartaoDeCreditoDomain", nullable=false, length=100)
    @ManyToOne
    @JoinColumn(name = "cartao_id", nullable=false)
    private CartaoDeCreditoDomain credit_card;
}
