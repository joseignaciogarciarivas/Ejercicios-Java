package ejercicios.java.nacho;

public class Ejercicio_02_Calculadora {



   public static void main(String[] args) {

    //Inicializacion de variables
    int numero1 = 20;
    int numero2 = 5;
    
    System.out.println("==========================");
    System.out.println("     CALCULADORA NACHO    ");
    System.out.println("==========================");
    System.out.println("Numero 1: " + numero1);
    System.out.println("Numero 2: "+ numero2);
    System.out.println("--------------------------");
    System.out.println("Suma: " + Suma(numero1, numero2));
    System.out.println("Resta: " + Resta(numero1, numero2));
    System.out.println("Multiplicacion: " + Multiplicacion(numero1, numero2));
    System.out.println("Division: " + Division(numero1, numero2));
    System.out.println("==========================");
        
    } 
    //Funciones
    public static int Suma(int pNumero1, int pNumero2 ){
        
        return pNumero1 + pNumero2;

    }
    public static int Resta(int pNumero1, int pNumero2){

        return pNumero1 - pNumero2;
    }
    public static int Multiplicacion(int pNumero1, int pNumero2){
        return pNumero1 * pNumero2;
    }
    public static int Division(int pNumero1, int pNumero2){
        return pNumero1 / pNumero2;
    }
}
