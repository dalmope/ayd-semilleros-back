package com.API.datos.controller;


import com.API.datos.entity.Actividad;
import com.API.datos.entity.Semillero;
import com.API.datos.service.ActividadesService;
import com.API.datos.service.SemilleroService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/semillero")
public class SemilleroController {

    SemilleroService semilleroService;

    public SemilleroController(SemilleroService semilleroService) {
        this.semilleroService = semilleroService;
    }

    @GetMapping
    public List<Semillero> getSemilleros() {
        return semilleroService.getSemilleros();
    }
}
