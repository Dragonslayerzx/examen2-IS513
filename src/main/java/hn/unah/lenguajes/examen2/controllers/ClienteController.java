package hn.unah.lenguajes.examen2.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.examen2.entities.Cliente;
import hn.unah.lenguajes.examen2.services.impl.ClienteServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/crear")
    public Cliente crear(@RequestBody Cliente cliente) {
        return this.clienteServiceImpl.crear(cliente);
    }
    
}
