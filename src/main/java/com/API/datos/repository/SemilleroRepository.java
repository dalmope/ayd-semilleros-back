package com.API.datos.repository;


import com.API.datos.entity.Actividad;
import com.API.datos.entity.Semillero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemilleroRepository  extends JpaRepository<Semillero, Integer> {
}
