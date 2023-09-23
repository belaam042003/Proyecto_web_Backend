package com.connectEdu.crud.repository.Login;



import org.springframework.data.jpa.repository.JpaRepository;

import com.connectEdu.crud.model.Login.Inicio;
import com.connectEdu.crud.model.Login.Registrarse;

public interface RegistrarseRepository extends JpaRepository<Registrarse, Long> {

}
