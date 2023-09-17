package com.connectEdu.crudProject.service;

import com.connectEdu.crudProject.model.Publicacion;

public interface PublicacionService {
    Publicacion newPublicacion(Publicacion newPublicacion);
    Iterable<Publicacion> getAll();

    Publicacion modifyPublicacion(Publicacion publicacion);
    Boolean deletePublicacion(Long idPublicacion);
}
