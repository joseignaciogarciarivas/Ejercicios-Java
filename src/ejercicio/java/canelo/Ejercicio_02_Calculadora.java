package ejercicio.java.canelo;

public class Ejercicio_02_Calculadora {

    public static void main(String[] args) {
        int vNumero1 = 21;
        int vNumero2 = 5;

        System.out.println("==============================");
        System.out.println("CALCULADORA - Canelo88");
        System.out.println("==============================");
        System.out.println("Número 1: " + vNumero1);
        System.out.println("Número 2: " + vNumero2);
        System.out.println("------------------------------");
        System.out.println("Suma: " + Suma(vNumero1, vNumero2));
        System.out.println("Resta: " + Resta(vNumero1, vNumero2));
        System.out.println("Multiplicación: " + Multiplicacion(vNumero1, vNumero2));
        System.out.println("División: " + Division(vNumero1, vNumero2));
        System.out.println("==============================");
    }

    // <editor-fold defaultstate="collapsed" desc="MÉTODOS Y FUNSIONES">    
    public static int Suma(int pVal1, int pVal2) {
        return pVal1 + pVal2;
    }

    public static int Resta(int pVal1, int pVal2) {
        return pVal1 - pVal2;
    }

    public static int Multiplicacion(int pVal1, int pVal2) {
        return pVal1 * pVal2;
    }

    public static double Division(int pVal1, int pVal2) {
        return (double) pVal1 / pVal2;
    }
    // </editor-fold>
}
