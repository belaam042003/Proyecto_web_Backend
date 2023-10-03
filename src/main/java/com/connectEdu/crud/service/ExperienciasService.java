package com.connectEdu.crud.service;


import com.connectEdu.crud.model.Experiencias;


public interface ExperienciasService {
    Experiencias newExperiencias(Experiencias newExperiencias);
    Iterable<Experiencias> getAll();
    Experiencias modifyExperiencias(Experiencias experiencias);
    Boolean deletExperiencias(String titulo);
}
