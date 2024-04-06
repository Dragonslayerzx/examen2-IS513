package hn.unah.lenguajes.examen2.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.examen2.entities.Cliente;
import hn.unah.lenguajes.examen2.entities.Direccion;
import hn.unah.lenguajes.examen2.repositories.ClienteRepository;
import hn.unah.lenguajes.examen2.repositories.DireccionRepository;
import hn.unah.lenguajes.examen2.services.DireccionService;

@Service
public class DireccionServiceImpl implements DireccionService {

    @Autowired
    private DireccionRepository direccionRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Direccion crear(Direccion direccion, String dni){
        if(this.clienteRepository.existsById(dni)){
            Cliente clienteDir = this.clienteRepository.findById(dni).get();
            clienteDir.setDireccion(direccion);
            return direccionRepository.findById(direccion.getIdDireccion()).get();
        }
        return null;
    }

}
