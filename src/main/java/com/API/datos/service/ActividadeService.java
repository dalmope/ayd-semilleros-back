package com.API.datos.service;

import com.API.datos.dto.ActividadDto;
import com.API.datos.entity.Actividad;
import com.API.datos.entity.Semillero;
import com.API.datos.repository.ActividadesRepository;
import com.API.datos.repository.SemilleroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActividadeService {

    ActividadesRepository actividadesRepository;
    SemilleroRepository semilleroRepository;

    public ActividadeService(ActividadesRepository actividadesRepository, SemilleroRepository semilleroRepository) {
        this.actividadesRepository = actividadesRepository;
        this.semilleroRepository = semilleroRepository;
    }

    public List<Actividad> getActividades() {
        return actividadesRepository.findAll();
    }


    public Actividad getById(Integer idActividad) {
        return actividadesRepository.getById(idActividad);
    }

    public void guardarActividad(ActividadDto actividadDto){

        Semillero semillero =
                semilleroRepository.findById(actividadDto.getIdSemillero()).orElseThrow();

        Actividad actividad = new Actividad(actividadDto.getTitulo(), actividadDto.getFechaInicio(),
                                            actividadDto.getFechaFinal(), actividadDto.getEstado(),
                                            semillero);

        actividadesRepository.save(actividad);
    }
}
