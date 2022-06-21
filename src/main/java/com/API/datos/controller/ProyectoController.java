package com.API.datos.controller;

import com.API.datos.service.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.Multipart;
import java.util.List;

@RestController
@RequestMapping("/proyectos")
public class ProyectoController {

    @Autowired
    ProyectoService proyectoService;


    //Cargar Archivos
    @PostMapping("/upload")
    public ResponseEntity<String> cargarArchivos(@RequestParam("files") List<MultipartFile> files){
        try {
            proyectoService.guardarArchivo(files);
            return ResponseEntity.status(HttpStatus.OK).body("Los archivos fueron cargados " +
                    "correctamente al servidor");
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrio " +
                    "un error al subir el archivo");
        }
    }

}
