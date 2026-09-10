package ejercicios.java.nacho;

import java.util.Scanner;

public class Ejercicio_03_Gestordeinventario {

    public static void main(String[] args) {
        int tamaño = 3;
        String[] nombre = new String[tamaño];
        double[] precios = new double[tamaño];
        int[] stock = new int[tamaño];

        MenuPrincipal();
    }

    public static void MenuPrincipal() {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("======================");
        System.out.println("1. Ver inventario");
        System.out.println("2. Comprar un producto");
        System.out.println("3. Ingresar Stock");
        System.out.println("4. Salir");
        System.out.println("======================");

        System.out.println("Ingrese una opcion: ");
        String opcion = scanner.nextLine();
        
        switch (opcion) {
            case "1":
                verInvetario(String[] nombre,double[] precios, int[] stock);
        }

    }

    public static void verInvetario(String[] nombre,double[] precios, int[] stock) {
 
        Scanner scanner = new Scanner(System.in);

        

        for (int i = 0; i < tamaño; i++) {
            System.out.println("Producto # " + (i + 1));
            System.out.println("Ingrese el nombre del producto: ");
            nombre[i] = scanner.nextLine();
            scanner.nextLine();
            System.out.println("Ingrese el precio del producto: ");
            precios[i] = scanner.nextDouble();
            System.out.println("Ingrese cuantos hay en stock");
            stock[i] = scanner.nextInt();

        }
        System.out.println("Productos guardados con exito!!");
        System.out.println("Volviendo al menu principal...");
    }
}
