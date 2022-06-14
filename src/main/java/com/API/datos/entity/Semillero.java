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
    private Actividad actividad;

    @ManyToOne
    @JoinColumn(name = "director_id")
    private Usuario director;

    public Actividad getActividades() {
        return actividad;
    }

    public void setActividades(Actividad actividad) {
        this.actividad = actividad;
    }

    public Usuario getDirector() {
        return director;
    }

    public void setDirector(Usuario director) {
        this.director = director;
    }


}
