package com.connectEdu.crud.service;


import com.connectEdu.crud.model.Estudios;


public interface EstudiosService {
    Estudios newEstudios(Estudios newEstudios);
    Iterable<Estudios> getAll();
    Estudios modifyEstudios(Estudios estudios);
    Boolean deletEstudios(String nivelEducacion);
}
