/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorunidades;

import java.util.Scanner;

/**
 *
 * @author thete
 */
public class Lonxitude {
    private static Scanner pepe = new Scanner(System.in);
        
    public static void kmsAMillas(){
        double km;
        double millas;
        
        
        km = pepe.nextDouble();
        
        
            millas = km * 0.621371;
            System.out.println(millas); 
    }
    
    public static void MillasaKm(){
        double km;
        double millas;
        
        Scanner pepe = new Scanner(System.in);
        millas = pepe.nextDouble();
        
        
            km = millas * 1.609;
            System.out.println(millas);
    }
    
    
}
