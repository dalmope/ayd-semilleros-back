package com.API.datos.entity;

import com.API.security.enums.entity.Usuario;
import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Getter
@Entity
public class Semillero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    private String descripcion;

    @OneToMany
    @JoinColumn(name = "actividades_id")
    private List<Actividad> actividad;

    public Semillero() {
    }

    public Semillero(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }


    //private byte[] logo;


/*
    @ManyToOne
    @JoinColumn(name = "director_id")
    private Usuario director;
*/
    public List<Actividad> getActividades() {
        return actividad;
    }

    public void setActividades(List<Actividad> actividad) {
        this.actividad = actividad;
    }
/*
    public Usuario getDirector() {
        return director;
    }

    public void setDirector(Usuario director) {
        this.director = director;
    }
*/

}
