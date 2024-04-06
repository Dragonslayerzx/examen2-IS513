package hn.unah.lenguajes.examen2.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes.examen2.entities.Movimientos;

@Repository
public interface MovimientosRepository extends CrudRepository<Movimientos, Integer> {

}
