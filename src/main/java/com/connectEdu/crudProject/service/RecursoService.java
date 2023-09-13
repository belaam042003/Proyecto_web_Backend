package com.connectEdu.crudProject.service;

import com.connectEdu.crudProject.model.Recurso;

public interface RecursoService {
    Recurso newRecurso(Recurso newRecurso);
    Iterable<Recurso> getAll();
    Recurso modifyRecurso(Recurso recurso);
    Boolean deletRecurso(Integer idRecurso);
}
