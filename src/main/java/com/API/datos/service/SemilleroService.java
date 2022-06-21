package com.API.datos.service;


import com.API.datos.entity.Semillero;
import com.API.datos.repository.SemilleroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SemilleroService {

    SemilleroRepository semilleroRepository;

    public SemilleroService(SemilleroRepository semilleroRepository) {
        this.semilleroRepository = semilleroRepository;
    }

    public List<Semillero> getSemilleros() {
        return semilleroRepository.findAll();
    }

    public void guardarSemillero(Semillero semillero){
        semilleroRepository.save(semillero);
    }

    public void eliminarSemillero(Integer id){
        semilleroRepository.deleteById(id);
    }


}
