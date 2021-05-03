package com.ejercicio.rolRaza.service.dto;

import lombok.Data;

@Data
public class RazaDTO {

    private Long id;
    private String nombre;
    private String descripcion;
    private String urlImagen;
    private Boolean razaAlianza;

    public RazaDTO() {
    }

    public RazaDTO(Long id, String nombre, String descripcion, String urlImagen, Boolean razaAlianza) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.urlImagen = urlImagen;
        this.razaAlianza = razaAlianza;
    }
}
