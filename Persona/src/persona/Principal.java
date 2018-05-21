
package persona;

public class Principal {
    
    public static void main(String[] args){
    
    Persona p1 = new Persona(); // Se crea un espacio en memoria donde aloja a P2
    Persona p2 = new Persona(); //SE crea una refetencia en memoria 
    
        /*System.out.println("CONTADOR GLOBAL : "+ Persona.contador());
        System.out.println("CONTADOR: "+p2.getId());
    */
        
        
        String s1 = "HOLA";
        String s2 = "HOLA";
        p1.setNombre("JUAN");
        p1.setApellido("PEREZ");
        
        p2.setNombre("MARIA");
        p2.setApellido("SANCHEZ");
        
        if(p1.equals(p2)){
            System.out.println("SON IGUALES");
        }else{
            System.out.println("NO SON IGUALES");
        }
        
        //tostring
        
        System.out.println("PERSONA 1: " + p1); //->> implicitamente esta haciendo p1.toString 
        //el toString convierte a string 
        System.out.println("PERSONA 2: " + p2);
        
        
        
        
        //metodos y atributos staticos
        // --> pertenece a la clase y no a la instancia ni los objetos y podemos hacerla referencia 
        //desde la clase y no necesitamos instancias
        //metodo equals
        //metodo toString 
        //metodos heredados de la clase Object
        
        
        //si le damos un valor de otro mismo objeto va a ser iguales porque se compara
        //posiciones de memoiras <--- el metodo equals
        
        
   /* p2.setNombre("Jhonathan"); //Seters son mutadores porque cambian el valor del atributo
    p3.setApellido("Pizarra");
    
        System.out.println("P2 "+ p2.getNombre());
        System.out.println("P3 "+ p3.getNombre());
        
        System.out.println("P2 "+ p2.getApellido());
        System.out.println("P2 "+ p3.getApellido());
    
        System.out.println(""); //salto de linea
        
        String greeting = "Hello"; // La clase String abstrae una cadena de caracteres
        String greeting3 = new String("Hello"); // Es lo mismo que  String greeting esta llamando a un constructor de la clase Strng
        
        String greeting2 = greeting;
        
        greeting2.toUpperCase(); // A traves de un metodo no podemos cambiar el valor de un objeto de la clase string
        //String es inmutable toma el valor del objeto lo transforma , pero no cambiara a menos que se almacenene 
        
        //Ninguno de los emtodos de la clase String cambia el valor del objeto
        System.out.println("G2: "+ greeting2.toUpperCase());
        System.out.println("G1: "+ greeting2);
        */
        
    }
}





//Crear una clase atributo
//Atributos de un archivo 
//Pueden ser inicializados con al menos en nombre y la fecha de creacion 


//la clase va a tenwer un atributo de tipo String [] para lista de mate4rias


