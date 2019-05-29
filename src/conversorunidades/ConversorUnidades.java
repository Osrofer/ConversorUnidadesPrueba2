/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorunidades;

import java.util.Scanner;

/**
 * Clase <b>ConversorUnidades</b>
 * @author thete
 * @version 1.0
 */
public class ConversorUnidades implements Lonxitude, Temperatura, Potencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Menu de inicio para que el usuario elija la accion a realizar*/
        int op;
        do {
            op = MostrarMenuPrincipal();
            switch (op) {
                /* Longitudes*/
                case 0:
                    break;
                case 1:
                    menuLongitud();
                    break;
                /*Potencia*/
                case 2:
                    menuPotencia();
                    break;
                /*Temperatura*/
                case 3:
                    menuTemperatura();
                    break;

            }
        } while (op != 0);
    }//Fin de main

    /**
     * Muestra el menu principal
     * @return la opción del menú elegida
     */

    public static int MostrarMenuPrincipal() {
        Scanner e = new Scanner(System.in);
        int op;
        System.out.println("Elija una opción");
        System.out.println("1.Longitud");
        System.out.println("2.Potencia");
        System.out.println("3.Temperatura");
        op = Integer.valueOf(e.nextLine());

        return op;
    }

    /**
     */

    public static void menuLongitud() {
        Scanner e = new Scanner(System.in);
        int op;
        System.out.println("Elija una opción");
        System.out.println("1.Transformar de Km a Millas");
        System.out.println("2.Transformar de Millas a Km");
        System.out.println("3.Transformar de Millas a Pulgadas");
        System.out.println("4.Transformar de Pulgadas a Millas");
        do {
            op = Integer.valueOf(e.nextLine());

            switch (op) {
                case 0:
                    MostrarMenuPrincipal();
                    break;
                case 1:
                    kmsAMillas();
                    break;
                case 2:
                    MillasaKm();
                    break;
                case 3:
                    MillasaPulgadas();
                    break;
                case 4:
                    PulgadasaMillas();
                    break;
            }
        } while (op != 0);
    }

    /**
     */

    public static void menuPotencia() {
        Scanner e = new Scanner(System.in);
        int op;
        System.out.println("Elija una opción");
        System.out.println("1.Transformar de KW a CV");
        System.out.println("2.Transformar de CV a KW");
        System.out.println("3.Transformar de KW a Ft/Lb");
        System.out.println("4.Transformar de Ft/Lb");
        do {
            op = Integer.valueOf(e.nextLine());

            switch (op) {
                case 0:
                    MostrarMenuPrincipal();
                    break;
                case 1:
                    KWaCV();
                    break;
                case 2:
                    CVaKW();
                    break;
                case 3:
                    KWaFtLb();
                    break;
                case 4:
                    FtLbAKW();
                    break;
            }
        } while (op != 0);
    }
    
    /**
     */

    public static void menuTemperatura() {
        Scanner e = new Scanner(System.in);
        int op;
        System.out.println("Elija una opción");
        System.out.println("1.Transformar de Celsius a Fahrenheit");
        System.out.println("2.Transformar Fahrenheir a Celsius");
        System.out.println("3.Transformar de Celsius a Kelvin");
        System.out.println("4.Transformar de Kelvin a Celsius");

        op = Integer.valueOf(e.nextLine());

        switch (op) {
            case 0:
                MostrarMenuPrincipal();
                break;
            case 1:
                CelsiusaFahrenheit();
                break;
            case 2:
                FahrenheitaCelsius();
                break;
            case 3:
                CelsiusKelvin();
                break;
            case 4:
                KelvinCelsius();
                break;
        }

    }
}
