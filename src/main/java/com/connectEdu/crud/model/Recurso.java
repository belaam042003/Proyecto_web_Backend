package com.connectEdu.crud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

//Esta libreria de data nosda getters and setters
@Data
@Entity
public class Recurso {
    @Id
    @Column
    private Long id;
    @Column
    private String urlImagen;
    @Column
    private String descripcion;
    @Column
    private String etiquetas;
    @Column
    private String visibilidad;

}
