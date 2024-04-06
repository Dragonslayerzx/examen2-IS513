package hn.unah.lenguajes.examen2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.examen2.entities.Direccion;
import hn.unah.lenguajes.examen2.services.impl.DireccionServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/direccion")
public class DireccionController {
    
    @Autowired
    private DireccionServiceImpl direccionServiceImpl;

    @PostMapping("/crear")
    public Direccion crear(@RequestBody Direccion direccion, @RequestParam String dni) {
        return this.direccionServiceImpl.crear(direccion, dni);
    }
    
}
