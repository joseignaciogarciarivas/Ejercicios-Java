package com.ejercicios_canelo.ejercicio_5.model;

public class Libro{

    private String titulo;
    private String isbn;
    private Autor autor;
    private static int contador;

    public Libro(String pTitulo, String pIsbn, Autor pAutor){
        this.titulo = pTitulo;
        this.isbn = pIsbn;
        this.autor = pAutor;
        this.contador++;
    }

    public static int getContador(){
        return contador;
    }

    @Override 
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(titulo);
        sb.append(isbn);
        sb.append(autor.toString());
        return  sb.toString();
    }
}