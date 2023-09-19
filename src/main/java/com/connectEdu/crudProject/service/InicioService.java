package com.connectEdu.crudProject.service;


import com.connectEdu.crudProject.model.Inicio;


public interface InicioService {
    Inicio newInicio(Inicio newInicio);
    Iterable<Inicio> getAll();
    Inicio modifyInicio(Inicio inicio);
    Boolean deleteInicio(Long idInicio);
}
