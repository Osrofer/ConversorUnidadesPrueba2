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
public class Temperatura {
    
    private static Scanner pepe = new Scanner(System.in); 
    
    public static void CelsiusaFahrenheit(){
    
        double C;
        double F;
        
        C = pepe.nextDouble();
        
        
            F = (C * 9 / 5) + 32 ;
            System.out.println(F);
    }
    
    public static void FahrenheitaCelsius(){
        
        double C;
        double F;
        
        F = pepe.nextDouble();
        
        
            C = (F - 32) * 5/9 ;
            System.out.println(C);        
    }
    
    public static void CelsiusKelvin(){
        
        double C;
        double K;
        
        C = pepe.nextDouble();
        
        
            K = C + 273.15;
            System.out.println(K);        
    }
    
}
