package com.API.datos.controller;

import com.API.datos.dto.ActividadDto;
import com.API.datos.dto.SemilleroDto;
import com.API.datos.entity.Mensaje;
import com.API.datos.service.ActividadeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/actividades")
public class ActividadesController {

    ActividadeService actividadesService;

    public ActividadesController(ActividadeService actividadesService) {
        this.actividadesService = actividadesService;
    }

    //@GetMapping
    //public List<Actividad> getActividades() {
    //    return actividadesService.getActividades();
    //}

    @PostMapping
    public ResponseEntity<?> crearActividad(@RequestBody ActividadDto actividadDto){
        actividadesService.guardarActividad(actividadDto);
        return new ResponseEntity<>(new Mensaje("Actividad Creada"),HttpStatus.OK);
    }

}
