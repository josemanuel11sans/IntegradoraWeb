package com.example.GestionDeVehiculos.Vehiculos.model;

import com.example.GestionDeVehiculos.Servicios.model.Servicios;
import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Vehiculo")
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "modelo", columnDefinition = "VARCHAR(100)", nullable = false)
    private String modelo;

    @Column(name = "marca", columnDefinition = "VARCHAR(100)", nullable = false)
    private String marca;

    @Column(name = "color", columnDefinition = "VARCHAR(50)", nullable = false)
    private String color;

    @Column(name = "status", columnDefinition = "TINYINT", nullable = false)
    private boolean status;

    @ManyToMany
    @JoinTable(
            name = "vehiculo_servicio",
            joinColumns = @JoinColumn(name = "vehiculo_id"),
            inverseJoinColumns = @JoinColumn(name = "servicio_id")
    )
    private Set<Servicios> servicios;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Set<Servicios> getServicios() {
        return servicios;
    }

    public void setServicios(Set<Servicios> servicios) {
        this.servicios = servicios;
    }
}
