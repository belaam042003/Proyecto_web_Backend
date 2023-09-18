package com.connectEdu.crud.service;

import com.connectEdu.crud.model.Publicacion;

public interface PublicacionService {

    Publicacion newPublicacion(Publicacion newPublicacion);

    Iterable<Publicacion> getAll();

    Publicacion modifyPublicacion(Long id,Publicacion publicacion);

    Boolean deletePublicacion(Long idPublicacion);
}
