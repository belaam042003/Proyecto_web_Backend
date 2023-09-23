package com.connectEdu.crud.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connectEdu.crud.model.Publicacion;
import com.connectEdu.crud.repository.PublicacionRepository;

@Service
public class PublicacionServiceImpl implements PublicacionService {

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
    public Publicacion modifyPublicacion(Long id, Publicacion publicacion) {
        Optional<Publicacion> publicacionEncontrada = this.publicacionRepository.findById(id);
        if (publicacionEncontrada.isPresent()) {
            Publicacion publicacionActualizada = publicacionEncontrada.get();
            publicacionActualizada.setComentarios(publicacion.getComentarios());
            publicacionActualizada.setContenido(publicacion.getContenido());
            publicacionActualizada.setUser(publicacion.getUser());
            return this.newPublicacion(publicacionActualizada);
        }
        return null; // O manejar de alguna otra manera si no se encuentra la publicación
    }

    @Override
    public Boolean deletePublicacion(Long idPublicacion) {
        this.publicacionRepository.deleteById(idPublicacion);
        return true;
    }

}
