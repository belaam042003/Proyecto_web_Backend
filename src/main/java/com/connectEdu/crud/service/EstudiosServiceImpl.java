package com.connectEdu.crud.service;

import com.connectEdu.crud.model.Estudios;
import com.connectEdu.crud.repository.EstudiosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EstudiosServiceImpl implements EstudiosService{
    @Autowired
    private EstudiosRepository estudiosRepsoitory;
    @Override
    public Estudios newEstudios(Estudios newEstudios) {
        return estudiosRepsoitory.save(newEstudios);
    }

    @Override
    public Iterable<Estudios> getAll() {
        return this.estudiosRepsoitory.findAll();
    }

    @Override
    public Estudios modifyEstudios(Estudios estudios) {
        Optional<Estudios> estudiosEncontrado=this.estudiosRepsoitory.findById(estudios.getNivelEducacion());
        if(estudiosEncontrado.get() != null){
            estudiosEncontrado.get().setNivelEducacion(estudios.getNivelEducacion());
            estudiosEncontrado.get().setCarrera(estudios.getCarrera());
            estudiosEncontrado.get().setUniversidad(estudios.getUniversidad());
            estudiosEncontrado.get().setIdiomas(estudios.getIdiomas());
            this.newEstudios(estudiosEncontrado.get());
        }
        return null ;
    }

    @Override
    public Boolean deletEstudios(String nivelEducacion) {
        this.estudiosRepsoitory.deleteById(nivelEducacion);
        return true;
    }

}
