package com.hospital_vm_cl.hospital_vm.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // Marca la clase como una entidad JPA para ser tratado como una tabla de bdd
@Table(name = "paciente") // Especifica el nombre de la tabla en la bdd
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {
    @Id // Indica que el campo anotado es el id primario de la entidad
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define la estrategia para generar el valor del id primario
    private int id;

    @Column(unique = true, length = 13, nullable = false) // Configura la columna de la base de datos
    private String run;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(nullable = true)
    private Date fechaNacimiento;

    @Column(nullable = false)
    private String correo;
}
