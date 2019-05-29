/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorunidades;

import java.util.Scanner;

/**
 * Clase<b>Temperatura</b>
 * @author thete
 */
public class Temperatura {
    
    private static Scanner pepe = new Scanner(System.in); 
    
    /**
     * Cambio de Celsius a Fahrenheit
     */
    public static void CelsiusaFahrenheit(){
    
        double C;
        double F;
        
        C = pepe.nextDouble();
        
        
            F = (C * 9 / 5) + 32 ;
            System.out.println(F);
    }
    
    /**
     * Cambio de Fahrenheit a Celsius
     */
    public static void FahrenheitaCelsius(){
        
        double C;
        double F;
        
        F = pepe.nextDouble();
        
        
            C = (F - 32) * 5/9 ;
            System.out.println(C);        
    }
    
    /**
     * Cambio de Celsius a Kelvin
     */
    public static void CelsiusKelvin(){
        
        double C;
        double K;
        
        C = pepe.nextDouble();
        
        
            K = C + 273.15;
            System.out.println(K);        
    }
    
    /**
     * Cambio de Kelvin a Celsius
     */
    public static void KelvinCelsius(){
        
        double C;
        double K;
        
        K = pepe.nextDouble();
        
        
            C = K - 273.15;
            System.out.println(C);        
    }
    
}
