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
@Table(name = "produtos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

public class ProdutosDomain {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable=false, length=100)
    private String title;

    @Column(name = "price", nullable=false, length=100)
    private Integer price;

    @Column(name = "zipcode", nullable=false, length=100)
    private String zipcode;

    @Column(name = "seller", nullable=false, length=100)
    private String seller;

    @Column(name = "thumbnailHd", nullable=false, length=100)
    private String thumbnailHd;

    @Column(name = "date", nullable=false, length=100)
    private String date;

}
