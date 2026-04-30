package com.hospital_vm_cl.hospital_vm.service;
import com.hospital_vm_cl.hospital_vm.model.Paciente;
import com.hospital_vm_cl.hospital_vm.repository.PacienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

import java.util.List;

@Service
@Transactional
public class PacienteService {
    @Autowired
    private PacienteRepository pacienteRepo;

    public List<Paciente> findAll(){
        return pacienteRepo.findAll();
    }

    public Paciente findById(Integer id){
        return pacienteRepo.findById(id).get();
    }

    public Paciente save(Paciente paciente){
        return pacienteRepo.save(paciente);
    }

    public void delete(Integer id){
        pacienteRepo.deleteById(id);
    }
}
