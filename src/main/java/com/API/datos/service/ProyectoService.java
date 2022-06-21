package com.API.datos.service;

import com.API.datos.entity.Proyecto;
import com.API.datos.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

@Service
public class ProyectoService {

    @Autowired
    ProyectoRepository proyectoRepository;

    //variable donde pongo la carpeta en la que se guardaran los archivos
    public final Path rootFolder = Paths.get("uploads");

    public void guardarProyecto(Proyecto proyecto){
        proyectoRepository.save(proyecto);
    }

    //manejo de archivos

    public void guardarArchivo(MultipartFile file) throws Exception{
        Files.copy(file.getInputStream(), this.rootFolder.resolve(file.getOriginalFilename()));
    }

    public Resource cargarArchivo(String name) throws Exception{
        return null;
    }

    public void guardarArchivo(List<MultipartFile> files) throws Exception{
        for (MultipartFile file:  files){
            this.guardarArchivo(file);
        }
    }

    public Stream<Path> cargarArchivos() throws Exception{
        return null;
    }

}
