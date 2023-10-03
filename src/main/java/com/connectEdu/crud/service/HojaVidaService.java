package com.connectEdu.crud.service;


import com.connectEdu.crud.model.HojaVida;


public interface HojaVidaService {
    HojaVida newHojaVida(HojaVida newHojaVida);
    Iterable<HojaVida> getAll();
    HojaVida modifyHojaVida(HojaVida hojaVida);
    Boolean deletHojaVida(Long idHojaVida);
}
