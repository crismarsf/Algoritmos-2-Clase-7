/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperaturapacientes;

/**
 *
 * @author crist
 */
public class TemperaturaPacientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int sum = 0,i;
        double promedio = 0;
        int[] temperatura = new int[5];
        temperatura[0] = 35;
        temperatura[1] = 40;
        temperatura[2] = 35;
        temperatura[3] = 35;
        temperatura[4] = 35;
        
        for(i=0;i<temperatura.length;i++){
            sum = sum + temperatura[i];
        
        }
        
        promedio = sum / temperatura.length;
        
        System.out.println("El promedio de temperatura es: " + promedio);
    
    }
}
