package com.API.datos.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Actividad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String titulo;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "fecha_inicio")
    private Date fechaInicio;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "fecha_final")
    private Date fechaFinal;

    private String duracion;

    private String estado;

    public String getTitulo() {
        return titulo;
    }

    @ManyToOne
    @JoinColumn(name = "semillero_id")
    private Semillero semillero;

    public Actividad(String titulo, Date fechaInicio, Date fechaFinal, String estado, Semillero semillero){

        this.titulo = titulo;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.estado = estado;
        this.semillero = semillero;

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date fechaInicial = sdf.parse(String.valueOf(this.fechaInicio));
        Date fechaFin = sdf.parse(String.valueOf(this.fechaFinal));

        long diff = fechaFin.getTime() - fechaInicial.getTime();

        TimeUnit time = TimeUnit.DAYS;

        long diferenciaDias = time.convert(diff, TimeUnit.MILLISECONDS);

        return " " + diferenciaDias;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Semillero getSemillero() {
        return semillero;
    }

    public void setSemillero(Semillero semillero) {
        this.semillero = semillero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
