package hn.unah.lenguajes.examen2.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cuentas")
@Data
public class Cuentas {

    @Id
    @Column(name = "numerocuenta")
    private String numerocuenta;

    private double saldo;

    @Column(name = "fechaapertura")
    private LocalDate fechaapertura;

    private short estado;

    private short sobregiro;

    @ManyToOne
    @JoinColumn(name = "dni")
    private Cliente cliente;

    @OneToMany(mappedBy = "cuenta", cascade = CascadeType.ALL)
    private List<Movimientos> movimientos;

}
