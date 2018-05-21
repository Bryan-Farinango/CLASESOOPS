
package persona;

import java.util.Date;
import java.util.Objects;


public class Persona {
    
    //Para definir atributos
    //Encapsulamiento Limita el alcance de los atributos que pertenecesn a una clase
    private static int contador = 0;

   
    private int id;
    private String nombre;
    private String apellido;
    private Date fechaDeNacimiento;
    private String cedula;
    
    
    public Persona(){
        
        this.contador++; 
        this.id = this.contador;
    }
  /*  
    public int getContador() {
        return contador; //Este contador aumente conforme se ingrese na persona
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    */
    public Persona(String nombre){  
        this.nombre = nombre; 
    }
    
     public Persona(String nombre, String apellido){ 
        this.apellido = apellido;
        this.nombre = nombre; 
    }
     
      public Persona(String nombre, String apellido, Date fechaNacimiento){ 
        this.apellido = apellido;
        this.nombre = nombre; 
        this.fechaDeNacimiento = fechaNacimiento;
    }
      
      public String getNombre(){
      
          return this.nombre;
      }
      
       public String getApellido(){
           
          return apellido;
      }
      
       public String getCedula(){
           
          return this.cedula;
      }
        public Date getFechaNacimeinto(){
      
          return fechaDeNacimiento;
      }
    
        //SETTERS
      public void setNombre(String nombre){
      
          this.nombre = nombre;
      }
      
   
      public void setApellido(String apellido){
      
          this.apellido = apellido;
      }
      
       public void setCedula(String cedula){
           
           if(cedulaValida(cedula)){
               this.cedula = cedula;
           }else {
               System.out.println("Cédula no válida");
           }
      
          
      }
      
       public void setFechaNacimeinto(Date fechaDeNacimiento){
      
          this.fechaDeNacimiento = fechaDeNacimiento;
      }
       
       //METODOS PRIVADOS // no van a ser visibles desde otra clase
       private boolean cedulaValida(String cedula){
           
           //Implemetar el algoritmo de validacion
           
           
           
           
           return false;
       }
       
 //CADA CPNSTRCTOR INICIALAIZA UN ATRIBUITO O VARISO ATRIBUTOS DEIFERENEA
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona1 = new Persona(); //Cuando se crea una instancia se sepra un espacio en memora para esta variable
        
        //Como llamamos al contructor? con la palabra new.
        //y que pasa cuando lo llaamamos? se crea una instancia.
        System.out.println(persona1.nombre);
        
        persona1.apellido = "Pizarra";
        persona1.nombre = "Jhonathan";
        persona1.fechaDeNacimiento = new Date("1997/11/19");
        System.out.println(persona1.nombre);
        
        Persona persona2 = new Persona("Jhonathan");
        System.out.println(persona2.nombre);
        
        persona1.setCedula("1725358525");
        
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //forma correcra
   
    
    
    //sintaxis basica del metodo equals
    //SOBREESCRIBIR EL CODIGO
    @Override //---> una etiqueta que dise al compilador que esta sobreescribiendo 
    public boolean equals(Object obj){
        final Persona otrapersona = (Persona) obj;
        if(!this.nombre.equals(otrapersona.nombre) || 
                !this.apellido.equals(otrapersona.apellido)){
                return false;           
        }
        return true;
    }

   
    //sobreescribir el metodo toString
    //aqui no importa lo que devolvamos pero debe ser representativo que veamos
    @Override
    public String toString(){
        return "Nombre: " + this.nombre + " " + this.apellido;
       
    }
}


//Primera prueba, Martes 15 prubea teórica ¡Estudiarás!

//Coeficientes 2.1.2.1.2.1.2.1.2
//Cedula :     1 7 2 5 3 5 8 5 2 5
//Multiplicar:  2.7.5.6.5.16.5.4 // Ese 16 o sumanos 1+6 o restamos 16 -9 y se reenokaza por 7 
//Sumar todos esos: 2+7+5+6+6+7+5+4 = 42 50 -42 // El 50 es el decimo superior = 8 este 8 debe coincidir  con el ultimo digito de la cedula

//Strings" arreglo de caacteres, es mas facil iterar 

//metodo charAt(i) // i es una posicion
// char.At(i) multiplicar por cada uni de los coediciientes
// o IF(I %2 == 0) multiplica por 2 , caso contrario multiplica por 1 
// varios if...
//usar una variable acumuladora