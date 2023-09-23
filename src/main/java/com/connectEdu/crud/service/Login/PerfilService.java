package com.connectEdu.crud.service.Login;


import com.connectEdu.crud.model.Login.Perfil;


public interface PerfilService {
    Perfil newPerfil(Perfil newPerfil);
    Iterable<Perfil> getAll();
    Perfil modifyPerfil(Perfil perfil);
    Boolean deletePerfil(Long idPerfil);
}
