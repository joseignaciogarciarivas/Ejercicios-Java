package com.ejercicios_canelo.ejercicio_5.model;

public class Libro {

    private String titulo;
    private String isbn;
    private Autor autor;
    private static int contador;

    // Constructor con todos los valrores
    public Libro(String pTitulo, String pIsbn, Autor pAutor) {
        this.titulo = pTitulo;
        this.isbn = pIsbn;
        this.autor = pAutor;
        this.contador++;
    }

    // Gets & Sets
    public static int getContador() {
        return contador;
    }

    // Se reescribe metod toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Titulo = " + titulo);
        sb.append("Isbn = " + isbn);
        sb.append(autor.toString());
        return sb.toString();
    }
}