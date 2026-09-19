package com.ejercicios_canelo.ejercicio_5.model;

public class Autor {

    String nombre;
    String nacionalidad;
    GeneroLiterario genLit;

    // Constructor Vacio
    public Autor() {

    }

    //constructor con todos los atributos
    public Autor(String pNombre, String pNacionalidad, GeneroLiterario pGenLit) {
        this.nombre = pNombre;
        this.nacionalidad = pNacionalidad;
        this.genLit = pGenLit;
    }


    public enum GeneroLiterario {
        NOVELA,
        POESIA,
        CIENCIA_FICCION,
        HISTORIA;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autor = " + Autor);
        sb.append("Nacionalidad = " + nacionalidad);
        sb.append("Genero literario = " + genLit);
        return sb.toString();
    }

}
