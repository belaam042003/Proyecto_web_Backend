package com.connectEdu.crudProject.service;


import com.connectEdu.crudProject.model.Registrarse;
import com.connectEdu.crudProject.repository.RegistrarseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RegistrarseServiceImpl implements RegistrarseService {
    @Autowired
    private RegistrarseRepository registrarseRepository;
    @Override
    public Registrarse newRegistrarse(Registrarse newRegistrarse) {
        return registrarseRepository.save(newRegistrarse);
    }

    @Override
    public Iterable<Registrarse> getAll() {
        return this.registrarseRepository.findAll();
    }

    @Override
    public Registrarse modifyRegistrarse(Registrarse registrarse) {
        Optional<Registrarse> registrarseEncontrado=this.registrarseRepository.findById(registrarse.getId());
        if(registrarseEncontrado.get() != null){
            registrarseEncontrado.get().setId(registrarse.getId());
            registrarseEncontrado.get().setCorreoElectronico(registrarse.getCorreoElectronico());
            registrarseEncontrado.get().setContrasena(registrarse.getContrasena());
            registrarseEncontrado.get().setContrasenaCorrecta(registrarse.getContrasenaCorrecta());
            registrarseEncontrado.get().setNombre(registrarse.getNombre());
            this.newRegistrarse(registrarseEncontrado.get());
        }
        return null ;
    }

    @Override
    public Boolean deleteRegistrarse(Long idRegistrarse) {
        this.registrarseRepository.deleteById(idRegistrarse);
        return true;
    }

}
