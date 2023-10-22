package com.example.lista.Models;

public class Agente
{
    private String nombres;
    private String edad;
    private Rol rol;

    public String getNombres() {
        return nombres;
    }

    public String getEdad() {
        return edad;
    }

    public Agente(String nombres, String edad, Rol rol) {
        this.nombres = nombres;
        this.edad = edad;
        this.rol = rol;
    }

    public Rol getRol() {
        return rol;
    }
}
