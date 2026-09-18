package com.ejercicios_canelo.ejercicio_4.model;

public class Autor {
    private String nombre;
    private String nacionalidad;
    private generoLiterario generoLit;

    /*Constructor vacio*/
    public Autor(){

    }

    /*Constructor funcional*/
    public Autor(String pNombre, String pNacionalidad, generoLiterario pGenLit){
        nombre = pNombre;
        nacionalidad = pNacionalidad;
        generoLit = pGenLit;
    }

    public enum generoLiterario{
        NOVELA,
        POESIA,
        CIENCIA_FICCION,
        HISTORIA;
    }
   
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();        
        sb.append("\n\t\tNombre = ").append(nombre);
        sb.append("\n\t\tNacionalidad = ").append(nacionalidad);
        sb.append("\n\t\tGenero Literario = ").append(generoLit);                        
        return sb.toString();
    }
}
