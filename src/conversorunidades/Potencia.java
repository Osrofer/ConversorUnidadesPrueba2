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
public class Potencia {
    
    private static Scanner pepe = new Scanner(System.in);
    
    public static void KWaCV(){
        double KW;
        double CV;
        
        KW = pepe.nextDouble();
        
        CV = KW * 1.341;
        System.out.println(CV);
        
    }
    
    public static void CVaKW(){
        double KW;
        double CV;
        
        CV = pepe.nextDouble();
        
        KW = CV / 1.341;
        System.out.println(KW);
    }
    
    public static void KWaFtLb(){
        double FtLb;
        double KW;
        
        FtLb = pepe.nextDouble();
        
        KW = FtLb * 737.562149;
        System.out.println(KW);
    }
    
    public static void FtLbAKW(){
        double FtLb;
        double KW;
        
        KW = pepe.nextDouble();
        
        FtLb = KW * 0.001356;
        System.out.println(FtLb);
    }
    
    
    
}
