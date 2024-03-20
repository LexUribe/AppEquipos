package co.edu.ucentral.proydemo.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Equipo") //Tiene que existir una tabla en la base de datos.
@Table(name = "EQUIPOS")
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_EQUIPOS")
    @SequenceGenerator(name = "SEQ_EQUIPOS", allocationSize = 1)
    @Column(name = "EQU_SERIAL")
    private long serial;

    @Column(name = "EQU_NOMBRE")
    private String nombre;

    @Column(name = "EQU_DESCRIPCION")
    private String descripcion;
}
