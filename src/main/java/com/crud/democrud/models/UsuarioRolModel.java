package com.crud.democrud.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "rolUsuario")
public class UsuarioRolModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idRol;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = UsuarioModel.class, optional = false)
    @JoinColumn(name = "idRolUsuario", nullable = false)
    @JsonBackReference
    private UsuarioModel usuario;

    private Long idUsuario;
    private String rol;



    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public UsuarioRolModel(Long idUsuario, String rol) {
        this.idUsuario = idUsuario;

        this.rol = rol;
    }

    public UsuarioRolModel() {
    }
}
