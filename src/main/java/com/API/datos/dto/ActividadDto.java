package com.API.datos.dto;

import com.API.datos.entity.Semillero;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ActividadDto {

        private Long id;
        private String titulo;
        private String fechaInicio;
        private String duracion;
        private String estado;
        private Semillero semillero;

}
