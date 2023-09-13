package com.connectEdu.crudProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.connectEdu.crudProject.model.Recurso;
import com.connectEdu.crudProject.service.RecursoService;

@RestController
@RequestMapping("/recurso")
public class RecursoController {

    @Autowired
    private RecursoService recursoService;

    // La diferencia de estos metdos con el service, es que estos tienen la conxi;ón directa 
    // Con el navegdor mientras que el service se encarga de hacer el procesamiento interno de los datos
    @PostMapping("/nuevoRecurso")
    public Recurso newRecurso(@RequestBody Recurso newRecurso){
        return this.recursoService.newRecurso(newRecurso);
    }

    @GetMapping("/mostrarRecurso")
    public Iterable<Recurso> getAll(){
        return recursoService.getAll();
    }

    @PostMapping("/modificarRecurso")
    public Recurso updateRecurso(@RequestBody Recurso recurso){
        return this.recursoService.modifyRecurso(recurso);
    }

    @PostMapping("/{id}")
    public Boolean deleteRecurso(@RequestParam Integer id){
        return this.recursoService.deletRecurso(id);
    }
}
