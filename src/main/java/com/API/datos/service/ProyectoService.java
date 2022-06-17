package com.API.datos.service;

import com.API.datos.entity.Proyecto;
import com.API.datos.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService {

    @Autowired
    ProyectoRepository proyectoRepository;

    public void guardarProyecto(Proyecto proyecto){
        proyectoRepository.save(proyecto);
    }

}
