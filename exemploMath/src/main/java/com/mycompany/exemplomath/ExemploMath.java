
package com.mycompany.exemplomath;

import java.util.Scanner;

/**
 *
 * @author PC-LORENZO
 */
public class ExemploMath {

    public static void main(String[] args) {
    //Programa que calcula lonxitude e area de unha circunferencia. 
    Scanner scanear= new Scanner(System.in);
    System.out.println("Teclea o radio");
    float radio= scanear.nextFloat();
    float lonxitude= (float) (2 * radio * Math.PI);//Casteamos pues pi es double.
    float area= (float) (Math.pow(radio, 2) * Math.PI);
    System.out.println("lonxitude =" + lonxitude + "\narea= " + area);
   
    
    
    }
    
}
