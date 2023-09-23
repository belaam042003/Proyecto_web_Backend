package com.connectEdu.crud.service;


import com.connectEdu.crud.model.Recurso;


public interface RecursoService {
    Recurso newRecurso(Recurso newRecurso);
    Iterable<Recurso> getAll();
    Recurso modifyRecurso(Recurso recurso);
    Boolean deletRecurso(Long idRecurso);
}
