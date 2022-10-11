package com.mycompany.exemploobxectos;

/**
 *
 * @author PC-LORENZO
 */
public class Rectangulo {
    //Declaro atributos

    public float base;
    private float altura;
    public float lado1;
    public float lado2;
    
    //constructores 
    public Rectangulo(float ba, float alt) { //constructor parametrizado
        base = ba;
        altura = alt;
    }

    public Rectangulo() { //constructor por defecto

    }
    //Defino metodos

    public float calcularArea(float b, float a) {
        float area = b * a;
        return area;
    }

    public void calcularPerimetro(float b, float a) {
        float peri = 2 * b + 2 * a;
        System.out.println(" perimetro= " + peri);
    }
       
//metodo de acceso
    
    public void setAltura (float al){
        altura= al;
    }
    public float getAltura(){
        return altura;
    }
    
    public void setBase (float ba){
        base= ba;
    }
    
    public float getBase(){
        return base;
    }
     
    
}
