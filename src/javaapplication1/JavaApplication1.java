/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author Usuario
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String uno = "abd";
        char unoChar = '1';
        int a = 85;
        int b = 2;
        int resultado = 1;
        boolean hay = true;
        String nombre = "asasa";
        if(hay || b == a && resultado < a){
           System.out.println("IF");
        }        
        System.out.println(resultado);
        System.out.println(resultado);
        
        Vehiculo objVehiculo = new Vehiculo("fdsfs", "Ford", "Fiesta", "Color", 2.3);
        
        Vehiculo objVehiculo2;
        
        objVehiculo2 = objVehiculo;
        
        objVehiculo2.setMarca("TOYOTA");
        
        System.out.println(objVehiculo.getMarca());        
    }
    
}
