/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivina.el.número;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

/**
 *
 * @author facks
 */
public class AdivinaElNúmero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
     
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        
        Random r = new Random();
        int numero = r.nextInt(100);
        
        System.out.println(numero);
        
        String respuesta="" ;
        
        int n;
        
        do{
            
        System.out.println("Escribe un número del 0 al 100");
        n = Integer.parseInt(br.readLine());
        
        if( numero == n )
            
            System.out.println("Haz acertado!!! El número era "+numero);
        
        else{

            if( numero < n)

                System.out.println("Incorrecto!!! El número es menor.");

            else
                System.out.println("Incorrecto!!! El número es mayor.");
        
            System.out.println("Quiere seguir intentando? (s|n)");
            respuesta = br.readLine();
        
            }

            }while(respuesta.equals("s") && numero != n);
    }
}
    
    
    

