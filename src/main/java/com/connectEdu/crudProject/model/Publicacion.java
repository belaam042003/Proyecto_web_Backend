package com.connectEdu.crudProject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Publicacion {
    @Id
    @Column
    private Long id;

    @Column
    private String contenido;

    @Column
    private String comnetarios;
    
    @Column
    private String user;
}
