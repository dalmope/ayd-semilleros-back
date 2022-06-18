package com.API.datos.dto;

import com.API.datos.entity.Semillero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ActividadDto {

        private String titulo;
        private Date fechaInicio;
        private Date fechaFinal;
        private String estado;
        private Integer idSemillero;

}
