/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nominatotal;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class NominaTotal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                // TODO code application logic here
    Scanner scanner = new Scanner(System.in);
    
          int[] salarios = new int[6];
          int sum = 0;
          
          System.out.println("Ingrese salarios");
          
          for (int i=0; i<salarios.length; i++){
            salarios[i] = scanner.nextInt();
          }
          
          for( int num : salarios) {
              sum = sum+num;
          }
                  
          System.out.println("La nomina es de: "+sum);
    }
}
