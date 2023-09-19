package com.connectEdu.crudProject.service;


import com.connectEdu.crudProject.model.Perfil;
import com.connectEdu.crudProject.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PerfilServiceImpl implements PerfilService {
    @Autowired
    private PerfilRepository perfilRepository;
    @Override
    public Perfil newPerfil(Perfil newPerfil) {
        return perfilRepository.save(newPerfil);
    }

    @Override
    public Iterable<Perfil> getAll() {
        return this.perfilRepository.findAll();
    }

    @Override
    public Perfil modifyPerfil(Perfil perfil) {
        Optional<Perfil> perfilEncontrado=this.perfilRepository.findById(perfil.getId());
        if(perfilEncontrado.get() != null){
            perfilEncontrado.get().setId(perfil.getId());
            perfilEncontrado.get().setNombre(perfil.getNombre());
            perfilEncontrado.get().setApellido(perfil.getApellido());
            perfilEncontrado.get().setCelular(perfil.getCelular());
            perfilEncontrado.get().setDireccion(perfil.getDireccion());
            this.newPerfil(perfilEncontrado.get());
        }
        return null ;
    }

    @Override
    public Boolean deletePerfil(Long idPerfil) {
        this.perfilRepository.deleteById(idPerfil);
        return true;
    }

}
