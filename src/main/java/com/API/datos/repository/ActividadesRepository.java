package com.API.datos.repository;

import com.API.datos.entity.Actividad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActividadesRepository extends JpaRepository<Actividad, Integer> {

}
