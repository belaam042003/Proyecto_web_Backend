package com.connectEdu.crudProject.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.connectEdu.crudProject.model.Recurso;
import com.connectEdu.crudProject.repository.RecursoRepsoitory;

public class RecursoServiceImpl implements RecursoService{
    @Autowired
    private RecursoRepsoitory recursoRepsoitory;
    @Override
    public Recurso newRecurso(Recurso newRecurso) {
        return recursoRepsoitory.save(newRecurso);
    }

    @Override
    public Iterable<Recurso> getAll() {
        return this.recursoRepsoitory.findAll();
    }

    @Override
    public Recurso modifyRecurso(Recurso recurso) {
        Optional<Recurso> recursoEncontrado=this.recursoRepsoitory.findById(recurso.getId());
        if(recursoEncontrado.get() != null){
            recursoEncontrado.get().setUrlImagen(recurso.getUrlImagen());
            recursoEncontrado.get().setDescripcion(recurso.getDescripcion());
            recursoEncontrado.get().setEtiquetas(recurso.getEtiquetas());
            recursoEncontrado.get().setVisibilidad(recurso.getVisibilidad());
            this.newRecurso(recursoEncontrado.get());
        }
        return null ; 
    }

    @Override
    public Boolean deletRecurso(Integer idRecurso) {
        this.recursoRepsoitory.deleteById(idRecurso);
        return true;
    }
    
}
