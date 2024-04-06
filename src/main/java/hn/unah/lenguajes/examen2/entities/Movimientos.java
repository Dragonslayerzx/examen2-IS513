package hn.unah.lenguajes.examen2.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "movimientos")
@Data
public class Movimientos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmovimiento")
    private int idmovimiento;

    @Column(name = "tipomovimiento")
    private char tipomovimiento;

    private double monto;

    @Column(name = "fechamovimiento")
    private LocalDate fechamovimiento;

    @ManyToOne
    @JoinColumn(name = "numerocuenta")
    private Cuentas cuenta;


}
