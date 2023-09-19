package com.connectEdu.crudProject.service;


import com.connectEdu.crudProject.model.Registrarse;


public interface RegistrarseService {
    Registrarse newRegistrarse(Registrarse newRegistrarse);
    Iterable<Registrarse> getAll();
    Registrarse modifyRegistrarse(Registrarse registrarse);
    Boolean deleteRegistrarse(Long idRegistrarse);
}
