package com.connectEdu.crudProject.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.connectEdu.crudProject.model.Publicacion;
import com.connectEdu.crudProject.repository.PublicacionRepository;

public class PublicacionServiceImpl implements PublicacionService{

    @Autowired
    private PublicacionRepository publicacionRepository;

    @Override
    public Publicacion newPublicacion(Publicacion newPublicacion) {
        return publicacionRepository.save(newPublicacion);
    }

    @Override
    public Iterable<Publicacion> getAll() {
        return this.publicacionRepository.findAll();
    }

    @Override
    public Publicacion modifyPublicacion(Publicacion publicacion) {
         Optional<Publicacion> personaEncontrada = this.publicacionRepository.findById(publicacion);
        return null;
    }

    @Override
    public Boolean deletePublicacion(Long idPublicacion) {
        this.publicacionRepository.deleteById(idPublicacion);
        return true;
    }
    
}
