/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp.problema1;
import java.util.*;
/**
 *
 * @author alumno
 */
public class PPProblema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int año, calcular;
    }
    public static int entradaDato(){
    int año;
    Scanner entrada= new Scanner(System.in);
        System.out.println("Introduce el año");
       año=entrada.nextInt();
          
    return año;   
   }
    public static int calcular(int año){  
        if(año % 4 == 0 && año % 100 != 0 || año % 400 == 0){
            System.out.println("El año:"+ año +"es bisiesto");  
       }else{
            System.out.println("El año:"+ año +"no es bisiesto");
           }
    return año;
    }
}
