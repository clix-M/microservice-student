package com.microservicealumno.persistence;

import com.microservicealumno.entities.Alumno;
import org.springframework.data.repository.CrudRepository;

public interface AlumnoRepo extends CrudRepository<Alumno, String> {
}
