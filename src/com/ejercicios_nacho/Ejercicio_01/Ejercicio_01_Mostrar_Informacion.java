package com.ejercicios_nacho; 

public class Ejercicio_01_Mostrar_Informacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MiPresentacion();

        
    }
    public static void MiPresentacion() {

        //Inicializacion de variables 
        String nombre = "Jose Ignacio Garcia Rivas";
        int edad = 19;
        String Ciudad = "Heredia";

        System.out.println("-----------------------------");
        System.out.println("       Mi Presentacion.      ");
        System.out.println("-----------------------------");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Ciudad: "+ Ciudad);
        System.out.println("Estoy aprendiendo Java");

    }
}
