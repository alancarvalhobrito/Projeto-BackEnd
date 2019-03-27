package com.backend.projeto.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tb_cliente")
@Getter
@Setter
public class Cliente implements Serializable {


    private static final long serialVersionUID = 6320542328154192831L;
    @Id
    @Column(name="id_cliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="nome")
    private String nome;

    @Column(name="cpf")
    private String cpf;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

    @OneToMany(mappedBy="cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference(value = "cliente")
    private List<Telefone> telefones;
}
