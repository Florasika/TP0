/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Point;

/**
 *
 * @author noudo
 */
public class Thread1 extends Thread{
    private String nom;

    public Thread1(String nom) {
        this.nom = nom;
    }

    public Thread1() {
    }
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
    public static void main(String[] args) {
        new Thread1("toto").start();
    }

    @Override
    public void run() {
        System.out.println("Bienvenue " +nom);  
    }
    
}
