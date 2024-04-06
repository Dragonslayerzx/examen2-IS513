package hn.unah.lenguajes.examen2.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.examen2.entities.Cliente;
import hn.unah.lenguajes.examen2.repositories.ClienteRepository;
import hn.unah.lenguajes.examen2.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {
     
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crear(Cliente cliente) {
        if(!this.clienteRepository.existsById(cliente.getDni())){
           Cliente nvoCliente = this.clienteRepository.findById(cliente.getDni()).get();
           return this.clienteRepository.save(nvoCliente);
        }
        return null;
        
    }

}
