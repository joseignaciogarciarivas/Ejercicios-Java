package ejercicios.java.nacho;

import java.util.Scanner;

public class Ejercicio_03_Gestordeinventario {

    public static void main(String[] args) {
        int tamano = 3;
        String[] nombre = new String[tamano];
        double[] precios = new double[tamano];
        int[] stock = new int[tamano];

        MenuPrincipal(nombre, precios, stock, tamano);
    }

    public static void MenuPrincipal(String[] nombre, double[] precios, int[] stock, int tamano) {

        Scanner scanner = new Scanner(System.in);

        String opcion = "";

        do {
            System.out.println("======================");
            System.out.println("1. Ver inventario");
            System.out.println("2. Comprar un producto");
            System.out.println("3. Ingresar Stock");
            System.out.println("4. Salir");
            System.out.println("======================");

            System.out.println("Ingrese una opcion: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    verInvetario(nombre, precios, stock, tamano);
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                     System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion Invalida");
            }

        } while (!opcion.equals("4"));
    }

    public static void verInvetario(String[] nombre, double[] precios, int[] stock, int tamano) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < tamano; i++) {
            System.out.println("Producto # " + (i + 1));
            System.out.println("Ingrese el nombre del producto: ");
            nombre[i] = scanner.nextLine();

            System.out.println("Ingrese el precio del producto: ");
            precios[i] = scanner.nextDouble();

            System.out.println("Ingrese cuantos hay en stock");
            stock[i] = scanner.nextInt();

            scanner.nextLine();
        }
        System.out.println("Productos guardados con exito!!");
        System.out.println("Volviendo al menu principal...");
    }

}
