
package com.mycompany.ej1;

import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        //proxecto que calcule o area de un rectangulo de base = 2 e altura = 5
        float base, altura; //son variables locais
        Scanner obxScaner = new Scanner(System.in); //Instanciamos un obxecto de tipo scanner
        System.out.println("Teclea a base");
        base= obxScaner.nextFloat();
        System.out.println("Teclea a altura");
        altura= obxScaner.nextFloat();
        float area= base * altura;
        System.out.println("O area e = " + area);
    }
}