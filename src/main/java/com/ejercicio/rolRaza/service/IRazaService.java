package com.ejercicio.rolRaza.service;

import com.ejercicio.rolRaza.service.dto.RazaDTO;

import java.util.List;

public interface IRazaService {

    public List<RazaDTO> obtenerRazas();

    RazaDTO save(RazaDTO razaDTO);

    RazaDTO getRaza(Long id);

    void deteleRaza(Long id);
}
