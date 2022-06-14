package com.API.datos.controller;

import com.API.datos.entity.Actividad;
import com.API.datos.service.ActividadesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/actividades")
public class ActividadesController {

    ActividadesService actividadesService;

    public ActividadesController(ActividadesService actividadesService) {
        this.actividadesService = actividadesService;
    }

    @GetMapping
    public List<Actividad> getActividades() {
        return actividadesService.getActividades();
    }


}
