package com.ejercicio.rolRaza.resource;

import com.ejercicio.rolRaza.service.IRazaService;
import com.ejercicio.rolRaza.service.dto.RazaDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class RazaResource {

    private IRazaService razaService;

    public RazaResource(IRazaService razaService) {
        this.razaService = razaService;
    }

    @GetMapping("/razas")
    public List<RazaDTO> getAllRazas(){
        List<RazaDTO> razas = razaService.obtenerRazas();
        return razas;
    }

    @PostMapping("/razas")
    public RazaDTO postRaza(@RequestBody RazaDTO razaDTO){
        RazaDTO raza = this.razaService.save(razaDTO);
        return raza;
    }

    @PutMapping("/razas")
    public RazaDTO updateRaza(@RequestBody RazaDTO razaDTO){
        RazaDTO raza = this.razaService.save(razaDTO);
        return raza;
    }

    @GetMapping("/razas/{id}")
    public RazaDTO getRaza(@PathVariable Long id){
        return this.razaService.getRaza(id);
    }

    @DeleteMapping("/razas/{id}")
    public void deleteRaza(@PathVariable Long id){
        this.razaService.deteleRaza(id);
    }

}
