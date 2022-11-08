/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Basınç {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
         Scanner sümer = new Scanner(System.in);
        System.out.println("Hoşgeldiniz");
        System.out.println("Lütfen Kuvvet Değeri Giriniz: ");
        double F = sümer.nextDouble();
        
        
        System.out.println("Lütfen Yüzey Alanını Giriniz: ");
        double S = sümer.nextDouble();
        
        
        
        
        
        double P = F / S;
        System.out.println("Basınç: "+ P);
        
        
    }
    
}
