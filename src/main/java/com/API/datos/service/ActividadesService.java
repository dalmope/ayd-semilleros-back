package com.API.datos.service;

import com.API.datos.entity.Actividad;
import com.API.datos.repository.ActividadesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActividadesService {

    ActividadesRepository actividadesRepository;

    public ActividadesService(ActividadesRepository actividadesRepository) {
        this.actividadesRepository = actividadesRepository;
    }

    public List<Actividad> getActividades() {
        return actividadesRepository.findAll();
    }

}
