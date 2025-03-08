
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author estudiante103
 */
public class Main {
    
   public static void main(String[] args) {
       
        Libro libro1 = new Libro("La Vida", "Carlos Steven", 5, 2);

       
        Libro libro2 = new Libro();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el título del libro: ");
        libro2.setTitulo(scanner.nextLine());

        System.out.print("Ingrese el autor del libro: ");
        libro2.setAutor(scanner.nextLine());

        System.out.print("Ingrese el número de ejemplares: ");
        libro2.setNumEjemplares(scanner.nextInt());

        System.out.print("Ingrese el número de ejemplares prestados: ");
        libro2.setNumEjemplaresPrestados(scanner.nextInt());

        
        System.out.println("\nIntentando prestar un libro de libro1...");
        if (libro1.prestar()) {
            System.out.println("Préstamo realizado con éxito.");
        } else {
            System.out.println("No hay ejemplares disponibles para prestar.");
        }

        System.out.println("\nIntentando devolver un libro de libro1...");
        if (libro1.devolver()) {
            System.out.println("Devolución realizada con éxito.");
        } else {
            System.out.println("No hay ejemplares prestados para devolver.");
        }

    
        System.out.println("\nDatos de libro1:");
        System.out.println(libro1);

        System.out.println("\nDatos de libro2:");
        System.out.println(libro2);
    }
}