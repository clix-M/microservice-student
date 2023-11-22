package com.microservicenota.service;

import com.microservicenota.models.Nota;

import java.util.List;

public interface NotaService {
     List<Nota> findAll();
}
