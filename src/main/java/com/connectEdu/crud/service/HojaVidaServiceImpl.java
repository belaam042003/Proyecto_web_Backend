package com.connectEdu.crud.service;


import com.connectEdu.crud.model.HojaVida;
import com.connectEdu.crud.repository.HojaVidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HojaVidaServiceImpl implements HojaVidaService{
    @Autowired
    private HojaVidaRepository hojaVidaRepsoitory;
    @Override
    public HojaVida newHojaVida(HojaVida newHojaVida) {
        return hojaVidaRepsoitory.save(newHojaVida);
    }

    @Override
    public Iterable<HojaVida> getAll() {
        return this.hojaVidaRepsoitory.findAll();
    }

    @Override
    public HojaVida modifyHojaVida(HojaVida hojaVida) {
        Optional<HojaVida> hojaVidaEncontrado=this.hojaVidaRepsoitory.findById(hojaVida.getCedula());
        if(hojaVidaEncontrado.get() != null){
            hojaVidaEncontrado.get().setNombre(hojaVida.getNombre());
            hojaVidaEncontrado.get().setApellido(hojaVida.getApellido());
            hojaVidaEncontrado.get().setDireccion(hojaVida.getDireccion());
            hojaVidaEncontrado.get().setCorreo(hojaVida.getCorreo());
            hojaVidaEncontrado.get().setFechaNacimiento(hojaVida.getFechaNacimiento());
            hojaVidaEncontrado.get().setTwitter(hojaVida.getTwitter());
            hojaVidaEncontrado.get().setPinterest(hojaVida.getPinterest());
            hojaVidaEncontrado.get().setLinkedIn(hojaVida.getLinkedIn());
            hojaVidaEncontrado.get().setHobbies(hojaVida.getHobbies());
            hojaVidaEncontrado.get().setTrayectoria(hojaVida.getTrayectoria());
            hojaVidaEncontrado.get().setAlgoMas(hojaVida.getAlgoMas());
            hojaVidaEncontrado.get().setTitulo(hojaVida.getTitulo());
            this.newHojaVida(hojaVidaEncontrado.get());
        }
        return null ;
    }

    @Override
    public Boolean deletHojaVida(Long idHojaVida) {
        this.hojaVidaRepsoitory.deleteById(idHojaVida);
        return true;
    }

}
