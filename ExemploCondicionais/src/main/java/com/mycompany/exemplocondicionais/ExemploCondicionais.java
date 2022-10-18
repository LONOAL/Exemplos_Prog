

package com.mycompany.exemplocondicionais;

import javax.swing.JOptionPane;

/**
 *
 * @author PC-LORENZO
 */
public class ExemploCondicionais {
   
    public static void main(String[] args) {
        CondicionalSimple obx1 = new CondicionalSimple();
         String res= JOptionPane.showInputDialog("Teclea a edade");
        System.out.println(res);
        int edad= Integer.parseInt(res);
        obx1.mayorEdade(edad);
      
       
        //Pedimos datos utilizando JOptionPane
       
    
    }


}
