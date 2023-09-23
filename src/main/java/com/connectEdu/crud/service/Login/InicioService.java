package com.connectEdu.crud.service.Login;


import com.connectEdu.crud.model.Login.Inicio;


public interface InicioService {
    Inicio newInicio(Inicio newInicio);
    Iterable<Inicio> getAll();
    Inicio modifyInicio(Inicio inicio);
    Boolean deleteInicio(Long idInicio);
}
