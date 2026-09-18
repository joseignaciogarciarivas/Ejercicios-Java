package com.ejercicios_canelo.ejercicio_4.model;

import java.util.ArrayList;

public class Biblioteca {
    
    private ArrayList<Libro> arr_libro = new ArrayList<>();

    public void agregarLibro(Libro pLibro){
        arr_libro.add(pLibro);
    }

    public void mostrarLibrosForMejorado(){
        System.out.println("==============================");
        System.out.println("LIBROS EN LA BIBLIOTECA");
        System.out.println("==============================");
        for (Libro libro : arr_libro) {
            System.out.println(libro.toString());
        }
    }

    public void mostrarLibrosForTradicional(){
        System.out.println("==============================");
        System.out.println("LIBROS EN LA BIBLIOTECA");
        System.out.println("==============================");
        
        for (int i = 0; i < arr_libro.size(); i++) {
            System.out.println(arr_libro.get(i).toString());
        }
    }
}
