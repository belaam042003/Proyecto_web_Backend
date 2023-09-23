package com.connectEdu.crud.controller.Login;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.connectEdu.crud.model.Login.Perfil;
import com.connectEdu.crud.service.Login.PerfilService;

@RestController
@RequestMapping("/perfil")
@CrossOrigin(origins={"http://localhost:4200","http://localhost:8000'"})
public class PerfilController {

    @Autowired
    private PerfilService perfilService;

    // La diferencia de estos metdos con el service, es que estos tienen la conxi;ón directa
    // Con el navegdor mientras que el service se encarga de hacer el procesamiento interno de los datos
    @PostMapping("/nuevo")
    public Perfil newPerfil(@RequestBody Perfil newPerfil){
        return this.perfilService.newPerfil(newPerfil);
    }

    @GetMapping("/mostrar")
    public Iterable<Perfil> getAll(){
        return perfilService.getAll();
    }

    @PostMapping("/modificar")
    public Perfil updatePerfil(@RequestBody Perfil perfil){
        return this.perfilService.modifyPerfil(perfil);
    }

    @PostMapping(value = "/{id}")
    public Boolean deletePerfil(@PathVariable(value="id") Long id){
        return this.perfilService.deletePerfil(id);
    }
}
