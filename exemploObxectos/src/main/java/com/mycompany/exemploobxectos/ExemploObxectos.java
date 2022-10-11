/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.exemploobxectos;

/**
 *
 * @author PC-LORENZO
 */
public class ExemploObxectos {

    public static void main(String[] args) {

        Rectangulo obxRec1 = new Rectangulo();
        float resultado = obxRec1.calcularArea(2, 3.0f);
        System.out.println("area= " + resultado);
        obxRec1.calcularPerimetro(2, 3);
        //instancio obxecto de tipo rectangulo co constructor parametrizado
        Rectangulo obxRec2 = new Rectangulo(5, 8);
        float base = obxRec2.getBase();
        float altura = obxRec2.getAltura();
        float result = obxRec2.calcularArea(base, altura);
        System.out.println("o novo area= " + result);

    }
}
