package com.microservicealumno.controller;

import com.microservicealumno.entities.Alumno;
import com.microservicealumno.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlumnoController{
    @Autowired
    private AlumnoService alumnoService;

    @GetMapping("/all")
    public List<Alumno> all(){
        return alumnoService.All();
    }

    @GetMapping("/see/{id}")
    public Alumno verUno(@PathVariable String id) {
        return alumnoService.findAlumnoById(id);
    }

    @PostMapping("/save")
    public Alumno save(@RequestBody Alumno alumno){
         return alumnoService.save(alumno);
    }
}
