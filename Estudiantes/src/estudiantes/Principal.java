/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes;

/**
 *
 * @author ESFOT
 */
public class Principal {
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiantes[] estudiantes = new Estudiantes[5]; // va a ser un arreglo de datos de tipo estudiante  
        System.out.println("#####INFORMACION ESTUDIANTES#####");
        //2materias
        estudiantes[0] = new Estudiantes("Juan", "Perez", "1234567890");
        System.out.println("##ESTUDIANTE 1");
        System.out.println("Nombre completo: " + estudiantes[0].getNombre() +
                estudiantes[0].getApellido());
        
        
        /*String[] m = new String[2];
        m[0] = "1"*/ //forma manual  y larga
        String[] m = {"Calculo","Arquitectura"}; //forma corta
        estudiantes[0].setMaterias(m);
        
        String[] materiasEstudiante0 = estudiantes[0].getMaterias();
        for (int i = 0; i<materiasEstudiante0.length; i++){
            System.out.println(materiasEstudiante0[i]);
        }
        
        //3 materias
        estudiantes[1] = new Estudiantes("Maria", "Castro", "1722864483");
        
        String[] n = {"Calculo", "Arquitectura", "Fisica"};
        estudiantes[1].setMaterias(n);
        
        String[] materiasEstudiante1 = estudiantes[1].getMaterias();
        for(int i = 0; i < materiasEstudiante1.length; i++){
            System.out.println(materiasEstudiante1[i]);
        }
        
        //4 materias
        estudiantes[2] = new Estudiantes("Pedro", "Benitez", "1712568672");
        //3 materias
        estudiantes[3] = new Estudiantes("Jose", "Salvador", "1722884493");
        //2 materias
        estudiantes[4] = new Estudiantes("Ana", "Martinez", "1712846852");
        
     
        
      
        
        
    }
    
}
    
    
    

/*######INFORMACION ESTUDIANTES ##########

  ##Estudiante 1
  Nombre Completo: Juan Perez
  Cedula: 172284545
  Materias:
  1. M1   
  2. M2

  ##Estudiante2
  asi completar....


  ######RESUMEN MATERIAS#######
  M1: 1
  M2: 3
  M3: 2
  M4: 2
  M5: 1
*/