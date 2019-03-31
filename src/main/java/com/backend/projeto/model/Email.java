package com.backend.projeto.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_email")
@Getter
@Setter
public class Email implements Serializable {

    private static final long serialVersionUID = 7457830539048611750L;

    @Id
    @Column(name="id_email")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="email")
    private String email;

    @ManyToOne
    @JsonBackReference(value = "cliente")
    @JoinColumn(name="id_cliente")
    private Cliente cliente;

}