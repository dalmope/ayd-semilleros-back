package com.API.datos.controller;


import com.API.datos.dto.SemilleroDto;
import com.API.datos.entity.Actividad;
import com.API.datos.entity.Mensaje;
import com.API.datos.entity.Semillero;
import com.API.datos.service.ActividadesService;
import com.API.datos.service.SemilleroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/semillero")
public class SemilleroController {

    @Autowired
    SemilleroService semilleroService;

    @Autowired
    ActividadesService actividadesService;

    @GetMapping
    public List<Semillero> getSemilleros() {
        return semilleroService.getSemilleros();
    }

    @PostMapping
    public ResponseEntity<?> crearSemillero(@RequestBody SemilleroDto semilleroDto){
        Semillero nuevoSemillero = new Semillero(semilleroDto.getNombre(), semilleroDto.getDescripcion());
        semilleroService.guardarSemillero(nuevoSemillero);
        if(semilleroDto.getActividadesId() != null) {
            for (Integer idActividad : semilleroDto.getActividadesId()) {
                Actividad actividad = actividadesService.getById(idActividad);
                nuevoSemillero.getActividades().add(actividad);
            }
        }


        return new ResponseEntity<>(new Mensaje("Semillero Creado"),
        HttpStatus.OK);
    }


}
