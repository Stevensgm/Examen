/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author estudiante103
 */
import java.util.Scanner;

public class Libro {
    private String Titulo;
    private String autor;
    private int numEjemplares;
    private int numEjemplaresPrestados;

    
    public Libro() {
        this.Titulo = "";
        this.autor = "";
        this.numEjemplares = 0;
        this.numEjemplaresPrestados = 0;
    }

   
    public Libro(String Titulo, String autor, int numEjemplares, int numEjemplaresPrestados) {
        this.Titulo = Titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }

   
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
      this.Titulo = Titulo;
    }

    public String getAutor(){
    return autor;
    }

    public void setAutor(String autor){
      this.autor = autor;
    }

    public int getNumEjemplares(){
    return numEjemplares;
    }
    public void setNumEjemplares(int numEjemplares){
    this.numEjemplares = numEjemplares;
    }
    public int getNumEjemplaresPrestados(){
    return numEjemplaresPrestados;
    }
    public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
     this.numEjemplaresPrestados = numEjemplaresPrestados;
    }

    
    public boolean prestar() {
    if (numEjemplares > numEjemplaresPrestados) {
        numEjemplaresPrestados++;
        return true;
        }
        return false;
    }

 
    public boolean devolver() {
    if (numEjemplaresPrestados > 0) {
        numEjemplaresPrestados--;
       return true;
        }
     return false;
    }
   
    
    public void imprimir (){
        System.out.println("Titulo=  " + Titulo);
        System.out.println("autor=  " + autor);
        System.out.println("numEjemplares= " + numEjemplares);
        System.out.println(" numEjemplaresPrestados= " + numEjemplaresPrestados);
    
   
    }}

    