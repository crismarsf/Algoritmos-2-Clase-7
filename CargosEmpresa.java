/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargosempresa;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class CargosEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        
        System.out.println("Seleccione un asesor entre 1 y 2");
        System.out.println("1. Asesor   2. consultor");
        
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        
        switch(a){
            case 1:{
                System.out.println("El salario del asesor es $1.000.000");
                break;}
                
            case 2:{
                System.out.println("El salario del asesor es $2.000.000");
                break;}
            
            default:{
                System.out.println("Opcion invalida");
                break;}

        }
        
    }
    
}
