package com.microservicenota.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Alumno {
    private String codigo;
    private String nombre;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date fechaNacimiento;
    private Integer nota1;
    private Integer nota2;
    private Integer nota3;
}
