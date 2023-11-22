package com.microservicenota.controller;

import com.microservicenota.models.Nota;
import com.microservicenota.service.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Year;
import java.time.ZoneId;
import java.util.*;

@RestController
public class NotaController {
    @Autowired
    private NotaService service;

    @GetMapping("/all")
    public List<Map<String, Object>> findAll() {
      /*  List<Nota> notas = service.findAll();
        List<Map<String, Object>> notasConMensaje = new ArrayList<>();
        for (Nota nota : notas) {
            Map<String, Object> notaMap = new HashMap<>();
            notaMap.put("alumno", nota.getAlumno());
            notaMap.put("promedio", nota.getPromedio());
            if (nota.getPromedio() >= 13) {
                notaMap.put("message", "APROBADO");
            } else {
                notaMap.put("message", "DESAPROBADO");
            }
            notasConMensaje.add(notaMap);
        }
        return notasConMensaje;

       */

        List<Nota> notas = service.findAll();
        List<Map<String, Object>> notasConMensaje = new ArrayList<>();

        for (Nota nota : notas) {
            Map<String, Object> notaMap = new HashMap<>();
            notaMap.put("alumno", nota.getAlumno());
            notaMap.put("promedio", nota.getPromedio());

            LocalDate fechaNacimiento = nota.getAlumno().getFechaNacimiento().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int edad = Year.now().getValue() - fechaNacimiento.getYear();
            notaMap.put("edad", edad);

            if (nota.getPromedio() >= 13) {
                notaMap.put("message", "APROBADO");
            } else {
                notaMap.put("message", "DESAPROBADO");
            }
            notasConMensaje.add(notaMap);
        }
        return notasConMensaje;
    }


}
