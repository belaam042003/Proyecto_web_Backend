package com.connectEdu.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.connectEdu.crud.model.Publicacion;
import com.connectEdu.crud.service.PublicacionService;

@RestController
@RequestMapping("/publicacion")
@CrossOrigin(origin = {"http://localhost:4200", "http://localhost:8080"})
public class PublicacionController {

    @Autowired
    private PublicacionService publicacionService;

    @PostMapping("/nuevo")
    public Publicacion newPublicacion(@RequestBody Publicacion newPublicacion){
        return this.publicacionService.newPublicacion(newPublicacion);
    }

    @GetMapping("/mostrar")
    public Iterable<Publicacion> getAll(){
        return publicacionService.getAll();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Publicacion> updatedPublicacion(@PathVariable Long id, @RequestBody Publicacion publicacion){
    Publicacion updatedPublicacion = this.publicacionService.modifyPublicacion(id, publicacion);
    if (updatedPublicacion != null) {
        return ResponseEntity.ok(updatedPublicacion);
    } else {
        return ResponseEntity.notFound().build();
    }
}

    @PostMapping(value = "/delete/{id}")
    public Boolean deletePublicacion(@PathVariable(value = "id")Long id){
        return this.publicacionService.deletePublicacion(id);
    }
}
