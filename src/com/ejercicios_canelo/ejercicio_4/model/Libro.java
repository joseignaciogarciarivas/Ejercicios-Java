package com.ejercicios_canelo.ejercicio_4.model;

public class Libro {
    
    private String libro;
    private String isbn;
    private Autor cls_Autor;
    private static int contador;

    //Constructor vacio
    public Libro(){}

    public Libro(String pLibro, String pIsbn, Autor pCls_Autor){
        libro = pLibro;
        isbn = pIsbn;
        cls_Autor = pCls_Autor;
        contador++;
    }
    
    public static int getCantidadLibros(){
        return contador;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nLibro{");
        sb.append("\n\tLibro = ").append(libro);
        sb.append("\n\tisbn = ").append(isbn);
        sb.append("\n\tAutor = ").append(cls_Autor.toString());        
        sb.append("\n}");
        return sb.toString();
    }
    
}
