package com.hospital_vm_cl.hospital_vm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital_vm_cl.hospital_vm.model.Paciente;
import com.hospital_vm_cl.hospital_vm.service.PacienteService;

@RestController
@RequestMapping("/api/v1/pacientes")
public class PacienteController {
    @Autowired
    private PacienteService pacienteService;

    @GetMapping // Metodo GET
    public ResponseEntity<List<Paciente>> mostrar(){
        List<Paciente> pacientes = pacienteService.findAll();
        if(pacientes.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(pacientes);
    }


}
