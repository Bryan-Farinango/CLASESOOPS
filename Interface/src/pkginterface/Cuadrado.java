/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author ESFOT
 */
public class Cuadrado implements Figura{
    private double lado;

    Cuadrado(double lado) {
        this.lado = lado;
    }

    
    
    
    
     @Override
    public double calcularArea(){
        System.out.println("Area del Cuadrado");
        return lado * lado * lado* lado;
    }

   
    
    
    
}
