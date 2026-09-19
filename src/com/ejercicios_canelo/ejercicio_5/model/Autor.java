package com.ejercicios_canelo.ejercicio_5.model;

public class Autor {
    
    private String nombre;
    private String nacionalidad;
    private generoLiterario genLit;

    public void Autor(String pNombre, String pNacionalidad, generoLiterario pGenLit){
        this.nombre = pNombre;
        this.nacionalidad = pNacionalidad;
        this.genLit = pGenLit;
    }

    public enum generoLiterario{
        NOVELA,
        POESIA,
        CIENCIA_FICCION,
        HISTORI;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();        
        sb.append("\n\t\tNombre = ").append(nombre);
        sb.append("\n\t\tNacionalidad = ").append(nacionalidad);
        sb.append("\n\t\tGenero Literario = ").append(genLit);                        
        return sb.toString();
    }
    
}
