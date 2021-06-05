package com.ejercicio.rolRaza.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="raza")
public class Raza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre", nullable = false)
    private String nombre;

    @Column(name="descripcion", nullable = false)
    private String descripcion;

    @Column(name="url_imagen")
    private String urlImagen;

    @Column(name="raza_alianza")
    private Boolean razaAlianza;

    public Raza() {
    }

    public Raza(Long id, String nombre, String descripcion, String urlImagen, Boolean razaAlianza) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.urlImagen = urlImagen;
        this.razaAlianza = razaAlianza;
    }
}
