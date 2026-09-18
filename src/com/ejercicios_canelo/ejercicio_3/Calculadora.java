package ejercicios_canelo.ejercicio_3;

import ejercicios_canelo.ejercicio_3.model.Procesos;

public class Calculadora {

    public static void main() {
        int vNumero1 = 21;
        int vNumero2 = 5;

        System.out.println("==============================");
        System.out.println("CALCULADORA - Canelo88 v2");
        System.out.println("==============================");
        System.out.println("Número 1: " + vNumero1);
        System.out.println("Número 2: " + vNumero2);
        System.out.println("------------------------------");
        System.out.println("Suma: " + Procesos.Suma(vNumero1, vNumero2));
        System.out.println("Resta: " + Procesos.Resta(vNumero1, vNumero2));
        System.out.println("Multiplicación: " + Procesos.Multiplicacion(vNumero1, vNumero2));
        System.out.println("División: " + Procesos.Division(vNumero1, vNumero2));
        System.out.println("==============================");
        
    }
}