package com.connectEdu.crud.service.Login;


import com.connectEdu.crud.model.Login.Registrarse;


public interface RegistrarseService {
    Registrarse newRegistrarse(Registrarse newRegistrarse);
    Iterable<Registrarse> getAll();
    Registrarse modifyRegistrarse(Registrarse registrarse);
    Boolean deleteRegistrarse(Long idRegistrarse);
}
