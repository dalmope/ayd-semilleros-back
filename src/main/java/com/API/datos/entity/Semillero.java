package com.API.datos.entity;

import com.API.security.entity.Usuario;

import javax.persistence.*;

@Entity
public class Semillero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    private String descripcion;

    private byte[] logo;

    @ManyToOne
    @JoinColumn(name = "actividades_id")
    private Actividades actividades;

    @ManyToOne
    @JoinColumn(name = "director_id")
    private Usuario director;

    public Actividades getActividades() {
        return actividades;
    }

    public void setActividades(Actividades actividades) {
        this.actividades = actividades;
    }

    public Usuario getDirector() {
        return director;
    }

    public void setDirector(Usuario director) {
        this.director = director;
    }


}
