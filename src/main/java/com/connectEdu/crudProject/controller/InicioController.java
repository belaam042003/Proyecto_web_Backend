package com.connectEdu.crudProject.controller;


import com.connectEdu.crudProject.model.Inicio;
import com.connectEdu.crudProject.service.InicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inicio")
@CrossOrigin(origins={"http://localhost:4200","http://localhost:8000'"})
public class InicioController {

    @Autowired
    private InicioService inicioService;

    // La diferencia de estos metdos con el service, es que estos tienen la conxi;ón directa
    // Con el navegdor mientras que el service se encarga de hacer el procesamiento interno de los datos
    @PostMapping("/nuevo")
    public Inicio newInicio(@RequestBody Inicio newInicio){
        return this.inicioService.newInicio(newInicio);
    }

    @GetMapping("/mostrar")
    public Iterable<Inicio> getAll(){
        return inicioService.getAll();
    }

    @PostMapping("/modificar")
    public Inicio updateInicio(@RequestBody Inicio inicio){
        return this.inicioService.modifyInicio(inicio);
    }

    @PostMapping(value = "/{id}")
    public Boolean deleteInicio(@PathVariable(value="id") Long id){
        return this.inicioService.deleteInicio(id);
    }
}
