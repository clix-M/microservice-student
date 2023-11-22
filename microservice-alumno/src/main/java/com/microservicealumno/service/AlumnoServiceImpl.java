package com.microservicealumno.service;

import com.microservicealumno.entities.Alumno;
import com.microservicealumno.persistence.AlumnoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AlumnoServiceImpl implements AlumnoService{
    @Autowired
    private AlumnoRepo alumnoRepo;
    @Override
    public List<Alumno> All() {
        return (List<Alumno>) alumnoRepo.findAll();
    }

    @Override
    public Alumno findAlumnoById(String id) {
        return alumnoRepo.findById(id).orElseThrow(()->new RuntimeException("Alumno no encontrado"));
    }

    @Override
    public Alumno save(Alumno alumno) {
         return alumnoRepo.save(alumno);
    }
}
