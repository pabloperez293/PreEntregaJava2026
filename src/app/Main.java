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
        System.out.println("2) Listar productos");
        System.out.println("3) Buscar/Actualizar producto");
        System.out.println("4) Eliminar producto");
        System.out.println("5) Crear pedido");
        System.out.println("6) Listar pedidos");
        System.out.println("7) Salir");
        System.out.print("\n Elija una opción: ");

        opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        switch (opcion) {
            case 1:
                // Lógica para agregar producto
                System.out.println("\n ------  Agregar producto ------");

                System.out.println("Nombre: ");
                String nombre = scanner.nextLine();

                System.out.println("Precio: ");
                double precio = scanner.nextDouble();

                System.out.println("Stock: ");

                int stock = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                Producto nuevProducto = new Producto(nombre, precio, stock);

                productos.add(nuevProducto);

                System.out.println();

                break;
            case 2:
                // Lógica para lista de productos
                System.out.println("\n ------  Lista productos ------");

                if (productos.isEmpty() ) {
                    System.out.println("No hay productos cargados.");
                } else {
                    for (Producto producto : productos) {
                        System.out.println(producto);
                    }
                }
                break;
            case 3:
                // Lógica para Buscar/Actualizar producto
                System.out.println("\n ------  Buscar/Actualizar producto ------");

                System.out.println("ingresar el ID del producto a buscar: ");
                int idBuscar = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                Producto ProductoEncontrado = null;

                for (Producto producto : productos){

                    if (producto.getId() == idBuscar){
                        productoEncontrado = producto;
                        break; 
                    }
                }

                if (productoEncontrado != null) {

                    System.out.println(("Producto encontrado: " + productoEncontrado));

                    System.out.println("Nuevo precio:  ");
                    double nuevoPrecio = scanner.nextDouble();

                    System.out.println("Nuevo stock:");
                    int nuevoStock = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea

                    if (nuevoStock >=0 ) {
                        productoEncontrado.setPrecio(nuevoPrecio);
                        productoEncontrado.setStock(nuevoStock);

                        System.out.println("Producto actualizado: " + productoEncontrado);
                    } else {
                        System.out.println("El stock no puede ser negativo. Actualización cancelada.");
                    } 
                    } else {
                        System.out.println("Producto no encontrado. ");
                    }

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