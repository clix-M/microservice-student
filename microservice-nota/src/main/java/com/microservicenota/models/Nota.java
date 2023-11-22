package com.microservicenota.models;

public class Nota {
    private Alumno alumno;
    public Nota() {
        super();
    }

    public Nota(Alumno alumno) {
        super();
        this.alumno = alumno;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Double getPromedio() {
        double promedio  = (alumno.getNota1().doubleValue() + alumno.getNota2().doubleValue() + alumno.getNota3().doubleValue()) / 3;
        promedio = Math.round(promedio * 10.0) / 10.0;
        return promedio;
    }
}
