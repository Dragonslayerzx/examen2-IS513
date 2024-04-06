package hn.unah.lenguajes.examen2.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.examen2.entities.Direccion;

@Repository
public interface DireccionRepository extends CrudRepository<Direccion, Integer> {

}
