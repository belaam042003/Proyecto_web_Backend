package com.connectEdu.crud.controller.Login;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.connectEdu.crud.model.Login.Registrarse;
import com.connectEdu.crud.service.Login.RegistrarseService;

@RestController
@RequestMapping("/registrarse")
@CrossOrigin(origins={"http://localhost:4200","http://localhost:8000'"})
public class RegistrarseController {

    @Autowired
    private RegistrarseService registrarseService;

    // La diferencia de estos metdos con el service, es que estos tienen la conxi;ón directa
    // Con el navegdor mientras que el service se encarga de hacer el procesamiento interno de los datos
    @PostMapping("/nuevo")
    public Registrarse newRegistrarse(@RequestBody Registrarse newRegistrarse){
        return this.registrarseService.newRegistrarse(newRegistrarse);
    }

    @GetMapping("/mostrar")
    public Iterable<Registrarse> getAll(){
        return registrarseService.getAll();
    }

    @PostMapping("/modificar")
    public Registrarse updateRegistrarse(@RequestBody Registrarse registrarse){
        return this.registrarseService.modifyRegistrarse(registrarse);
    }

    @PostMapping(value = "/{id}")
    public Boolean deleteRegistrarse(@PathVariable(value="id") Long id){
        return this.registrarseService.deleteRegistrarse(id);
    }
}
