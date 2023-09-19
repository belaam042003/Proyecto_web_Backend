package com.connectEdu.crudProject.service;


import com.connectEdu.crudProject.model.Perfil;


public interface PerfilService {
    Perfil newPerfil(Perfil newPerfil);
    Iterable<Perfil> getAll();
    Perfil modifyPerfil(Perfil perfil);
    Boolean deletePerfil(Long idPerfil);
}
