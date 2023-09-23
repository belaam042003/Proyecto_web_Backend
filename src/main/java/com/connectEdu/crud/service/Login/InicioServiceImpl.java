package com.connectEdu.crud.service.Login;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connectEdu.crud.model.Login.Inicio;
import com.connectEdu.crud.repository.Login.InicioRepository;

import java.util.Optional;
@Service
public class InicioServiceImpl implements InicioService {
    @Autowired
    private InicioRepository inicioRepository;
    @Override
    public Inicio newInicio(Inicio newInicio) {
        return inicioRepository.save(newInicio);
    }

    @Override
    public Iterable<Inicio> getAll() {
        return this.inicioRepository.findAll();
    }

    @Override
    public Inicio modifyInicio(Inicio inicio) {
        Optional<Inicio> inicioEncontrado=this.inicioRepository.findById(inicio.getId());
        if(inicioEncontrado.get() != null){
            inicioEncontrado.get().setId(inicio.getId());
            inicioEncontrado.get().setCorreoElectronico(inicio.getCorreoElectronico());
            inicioEncontrado.get().setContrasena(inicio.getContrasena());
            this.newInicio(inicioEncontrado.get());
        }
        return null ;
    }

    @Override
    public Boolean deleteInicio(Long idInicio) {
        this.inicioRepository.deleteById(idInicio);
        return true;
    }

}
