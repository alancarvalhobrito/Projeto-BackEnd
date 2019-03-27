package com.backend.projeto.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_telefone")
@Getter
@Setter
public class Telefone implements Serializable {


    private static final long serialVersionUID = 7110508136977106193L;
    @Id
    @Column(name="id_telefone")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="numero")
    private String numero;

    @Column(name="tipo")
    private String tipo;

    @ManyToOne
    @JsonBackReference(value = "cliente")
    @JoinColumn(name="id_cliente")
    private Cliente cliente;

}