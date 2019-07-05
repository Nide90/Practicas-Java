/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplooperaciones;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author facks
 */
public class EjemploOperaciones {


    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
    
    String x = br.readLine();
    
    String y = br.readLine();
    
    int a ;
            
    int b; 
            a = Integer.parseInt(x); 
            b = Integer.parseInt(y);
            
           System.out.println(a+b);
           System.out.println(a-b);
           System.out.println(a*b);
           System.out.println(a/b);
           System.out.println(a%b);
    
    double c;
    
    
           c = Double.parseDouble(x);
           
           
           
           System.out.println(c+b);
           System.out.println(c-b);
           System.out.println(c*b);
           System.out.println(c/b);
           System.out.println(c%b);
                   
           }}