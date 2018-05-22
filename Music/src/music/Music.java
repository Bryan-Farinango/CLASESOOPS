/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music;

import java.util.*;

public class Music {

    
    public static void main(String[] args) {
        //VARIABLE para almacenar el numero de artistas
        int m = 0;
        System.out.println("###BIENVENIDO###");
        System.out.println("Ingrese el numero de Artistas");
        Scanner entrance = new Scanner(System.in);
        m = entrance.nextInt();
        Artista[] artist = new Artista[m];
        
        entrance.nextLine();
        for(int i = 0; i < artist.length ; i++){
            
            System.out.println("Artista  " + (i+1));          
            System.out.println("Nombre: ");
            String nombre = entrance.nextLine();  
            artist[i] = new Artista();
            artist[i].setNombre(nombre);
            
            
            //System.out.println("Artisa: " + artist[0].getNombre());
            
            
        }
        
        
        
        
        
        
        
    }
    
}
