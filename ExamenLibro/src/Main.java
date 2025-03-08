
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
        libro1.imprimir();
        Libro libro2 = new Libro("la escuela", "julio", 7, 2);
        libro2.imprimir();
        Libro libro3 = new Libro("muerte", "Franco", 10, 8);
        libro3.imprimir();

        
       
    }
}