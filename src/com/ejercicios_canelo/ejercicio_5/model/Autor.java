package com.ejercicios_canelo.ejercicio_5.model;

public class Autor {
    private String nombre;
    private String nacionalidad;
    private generoLiterario genero;

    public Autor(String nombre, String nacionalidad, generoLiterario genero) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
    }

    public enum generoLiterario{
        NOVELA,
        POESIA,
        CIENCIA_FICCION,
        HISTORIA;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", genero=" + genero +
                '}';
    }
}
