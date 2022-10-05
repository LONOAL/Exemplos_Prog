
package com.mycompany.exemploobxectos;

/**
 *
 * @author PC-LORENZO
 */
public class Rectangulo {
    //Declaro atributos
    
    public float base;
    private float altura;
    
    //Defino metodos
    
    public float calcularArea(float b, float a){
        float area = b*a ;
        return area;
    }


    public void calcularPerimetro(float b, float a){
        float peri = 2*b+2*a;
        System.out.println(" perimetro= "+peri);
    }
}
