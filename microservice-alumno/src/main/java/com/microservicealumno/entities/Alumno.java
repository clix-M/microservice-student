package com.microservicealumno.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Alumno {
    @Id
    private String codigo;
    private String nombre;

    @JsonFormat(pattern="yyyy-MM-dd")
    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;
    private Integer nota1;
    private Integer nota2;
    private Integer nota3;
}
