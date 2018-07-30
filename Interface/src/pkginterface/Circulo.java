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
public class Circulo implements Figura{
    
    private double diametro;

    Circulo(double diametro) {
        this.diametro = diametro;
    }

    
     @Override
    public double calcularArea(){
        System.out.println("Area del Circulo");
        return 0.0;
    }
}
