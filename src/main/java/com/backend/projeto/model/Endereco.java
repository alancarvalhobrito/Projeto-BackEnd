package com.backend.projeto.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_endereco")
@Getter
@Setter
public class Endereco implements Serializable {

    private static final long serialVersionUID = 1436014352129235821L;

    @Id
    @Column(name="id_endereco")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="cep")
    private String cep;

    @Column(name="logradouro")
    private String logradouro;

    @Column(name="bairro")
    private String bairro;

    @Column(name="cidade")
    private String cidade;

    @Column(name="uf")
    private String uf;

    @Column(name="complemento")
    private String complemento;
}
