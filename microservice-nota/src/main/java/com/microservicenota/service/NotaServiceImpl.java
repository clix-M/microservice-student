package com.microservicenota.service;

import com.microservicenota.models.Alumno;
import com.microservicenota.models.Nota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class NotaServiceImpl implements NotaService{

    @Autowired
    private RestTemplate clienteRest;
    @Override
    public List<Nota> findAll() {
        List<Alumno> alumnos= Arrays.asList(Objects.requireNonNull(clienteRest.getForObject("http://localhost:8081/all", Alumno[].class)));
        return alumnos.stream().map(Nota::new).collect(Collectors.toList());
    }



}
