package com.API.datos.mapper;

import com.API.datos.dto.ActividadDto;
import com.API.datos.entity.Actividad;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public class ActividadMapper {

    ActividadMapper INSTANCE = Mappers.getMapper(ActividadMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "titulo", target = "titulo")
    @Mapping(source = "fechaInicio", target = "fechaInicio")
    @Mapping(source = "fechaFin", target = "fechaFin")
    @Mapping(source = "estado", target = "estado")
    public Actividad toEntity(ActividadDto actividad) {
        return INSTANCE.toEntity(actividad);
    }

    @Mapping(source = "id", target = "id")
    @Mapping(source = "titulo", target = "titulo")
    @Mapping(source = "fechaInicio", target = "fechaInicio")
    @Mapping(source = "fechaFin", target = "fechaFin")
    @Mapping(source = "estado", target = "estado")
    public ActividadDto toDto(Actividad actividad) {
        return INSTANCE.toDto(actividad);
    }

}
