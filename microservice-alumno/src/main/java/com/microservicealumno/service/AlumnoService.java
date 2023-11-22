package com.microservicealumno.service;

import com.microservicealumno.entities.Alumno;

import java.util.List;

public interface AlumnoService {
     List<Alumno> All();
     Alumno findAlumnoById(String id);
}
