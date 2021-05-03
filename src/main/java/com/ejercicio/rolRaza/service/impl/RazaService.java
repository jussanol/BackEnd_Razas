package com.ejercicio.rolRaza.service.impl;

import com.ejercicio.rolRaza.model.Raza;
import com.ejercicio.rolRaza.repository.RazaRepository;
import com.ejercicio.rolRaza.service.IRazaService;
import com.ejercicio.rolRaza.service.dto.RazaDTO;
import com.ejercicio.rolRaza.service.mapper.ModelMapperUtils;
import org.dom4j.rule.Mode;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RazaService implements IRazaService {

    private RazaRepository razaRepository;

    public RazaService(RazaRepository razaRepository) {
        this.razaRepository = razaRepository;
    }


    @Override
    public List<RazaDTO> obtenerRazas() {
        List<Raza> razas = this.razaRepository.findAll();
        return ModelMapperUtils.mapAll(razas, RazaDTO.class);
    }

    @Override
    public RazaDTO save(RazaDTO razaDTO) {
        Raza raza = this.razaRepository.save(ModelMapperUtils.map(razaDTO, Raza.class));
        return ModelMapperUtils.map(raza, RazaDTO.class);
    }

    @Override
    public RazaDTO getRaza(Long id) {
        Optional<Raza> raza = this.razaRepository.findById(id);
        if(raza.isPresent()){
            return ModelMapperUtils.map(raza.get(), RazaDTO.class);
        }else {
            return null;
        }
    }

    @Override
    public void deteleRaza(Long id) {
        /*Optional <Raza> raza = this.razaRepository.findById(id);
        if(raza.isPresent()){
            this.razaRepository.delete(raza.get());
        }*/
        this.razaRepository.deleteById(id);
    }
}
