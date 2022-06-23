package com.API.datos.entity;

import com.API.security.enums.entity.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Proyecto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String tituloProyecto;

    private Date fechaInicio;

    @OneToMany
    @JoinColumn(name = "proyecto_id")
    private List<Usuario> usuariosEstudiante;


}
