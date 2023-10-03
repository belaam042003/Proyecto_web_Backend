package com.connectEdu.crud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

//Esta libreria de data nosda getters and setters
@Data
@Entity
public class HojaVida {

    @Column
    private String nombre;
    @Column
    private String apellido;
    @Id
    @Column
    private Long cedula;
    @Column
    private String direccion;
    @Column
    private String correo;
    @Column
    private String fechaNacimiento;
    @Column
    private String twitter;
    @Column
    private String pinterest;
    @Column
    private String linkedIn;
    @Column
    private String Hobbies;
    @Column
    private String trayectoria;
    @Column
    private String algoMas;
    @Column
    private String titulo;
}
