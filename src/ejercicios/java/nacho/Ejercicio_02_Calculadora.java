package ejercicios.java.nacho;
import java.util.Scanner;

public class Ejercicio_02_Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola bienvenido a la Calculadora");
        System.out.println("Ingrese el valor del primer numero");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el valor del segundo numero");
        int numero2 = scanner.nextInt();
        
        MenudeResultados(numero1, numero2);
        

    }
    public static void MenudeResultados(int numero1, int numero2){
        

        System.out.println("==========================");
        System.out.println("     CALCULADORA NACHO    ");
        System.out.println("==========================");
        System.out.println("Numero 1: " + numero1);
        System.out.println("Numero 2: " + numero2);
        System.out.println("--------------------------");
        System.out.println("Suma: " + Suma(numero1, numero2));
        System.out.println("Resta: " + Resta(numero1, numero2));
        System.out.println("Multiplicacion: " + Multiplicacion(numero1, numero2));
        System.out.println("Division: " + Division(numero1, numero2));
        System.out.println("==========================");
    }
    // Funciones
    public static int Suma(int pNumero1, int pNumero2) {

        return pNumero1 + pNumero2;

    }

    public static int Resta(int pNumero1, int pNumero2) {

        return pNumero1 - pNumero2;
    }

    public static int Multiplicacion(int pNumero1, int pNumero2) {
        return pNumero1 * pNumero2;
    }

    public static double Division(int pNumero1, int pNumero2) {
        return (double) pNumero1 / pNumero2;
    }
}
