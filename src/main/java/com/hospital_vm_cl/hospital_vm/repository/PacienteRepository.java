package com.hospital_vm_cl.hospital_vm.repository;

import org.springframework.stereotype.Repository;
import com.hospital_vm_cl.hospital_vm.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer>{
    List<Paciente> findByApellido(String apellido);

    Paciente findByCorreo(String correo);

    List<Paciente> findByNombreAndApellido(String nombre, String apellido);
}
