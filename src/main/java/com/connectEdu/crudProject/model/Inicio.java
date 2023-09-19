package com.connectEdu.crudProject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

//Esta libreria de data nosda getters and setters
@Data
@Entity
public class Inicio {
    @Id
    @Column
    private Long id;
    @Column
    private String correoElectronico;
    @Column
    private String contrasena;

}
