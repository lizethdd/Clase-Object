
package domain;


public class test {


    public static void main(String[] args) {
        Empleado em1= new Empleado("Luis",45000);
        Empleado em2= new Empleado("Luis",45000);
        
        if(em1 == em2){
            System.out.println("Tienen la misma referencia en memoria.");
        }else{
            System.out.println("Tienen distinta referencia en memoria");
        }
        
        System.out.println((em1.equals(em2))? "Los objetos son iguales en contenido." : "Los objetos son distintos");
        System.out.println((em1.hashCode() == em2.hashCode())? "Los objetos son iguales en contenido." : "Los objetos son distintos");
    }
    
    
   
    
}
