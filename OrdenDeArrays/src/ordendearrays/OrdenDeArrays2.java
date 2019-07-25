package ordendearrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class OrdenDeArrays2{
    private Scanner teclado;
    private Integer[] sueldo;
    
    public void cargar()
    {
        teclado=new Scanner(System.in);
        sueldo=new Integer[5];
        for(int f=0; f<sueldo.length;f++){
            System.out.print("Introduce sueldo;");
            sueldo[f]= teclado.nextInt();
        }
    }
    
    public void ordenar(){
        Arrays.sort(sueldo, Collections.reverseOrder());
    }
            
    public void imprimir(){
        for(int f=0;f<sueldo.length;f++){
            System.out.println(sueldo[f]);
        }
    }
    


public static void main(String[] args) {
        // TODO code application logic here
        OrdenDeArrays2 usuario = new OrdenDeArrays2();
        usuario.cargar();
        usuario.ordenar();
        usuario.imprimir();
    }
}


