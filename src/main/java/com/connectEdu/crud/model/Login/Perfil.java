package com.connectEdu.crud.model.Login;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

//Esta libreria de data nosda getters and setters
@Data
@Entity
public class Perfil {
    @Id
    @Column
    private Long id;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String celular;
    @Column
    private String direccion;
}
