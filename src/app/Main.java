package app;

import java.util.ArrayList;
import java.util.Scanner;

import model.LineaPedido;
import model.Pedido;
import model.Producto;


public class Main {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       ArrayList<Producto> productos = new ArrayList<>();
       ArrayList<Pedido> pedidos = new ArrayList<>();

       int opcion = 0;

       while (opcion != 7) {
        System.out.println("\n======================================");
        System.out.println("      SISTEMA DE GESTIÓN - TECHLAB");
        System.out.println("======================================");
        System.out.println("1. Agregar producto");
        System.out.println("2. Crear pedido");
        System.out.println("3. Agregar línea de pedido");
        System.out.println("4. Mostrar productos");
        System.out.println("5. Mostrar pedidos");
        System.out.println("6. Calcular total de un pedido");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opción: ");

        opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch (opcion) {
            case 1:
                // Lógica para agregar producto
                break;
            case 2:
                // Lógica para crear pedido
                break;
            case 3:
                // Lógica para agregar línea de pedido
                break;
            case 4:
                // Lógica para mostrar productos
                break;
            case 5:
                // Lógica para mostrar pedidos
                break;
            case 6:
                // Lógica para calcular total de un pedido
                break;
            case 7:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida, por favor intente nuevamente.");
        }
       })
    }
    
} 