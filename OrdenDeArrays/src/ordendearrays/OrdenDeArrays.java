package ordendearrays;
import java.util.Scanner;
import java.util.Arrays;

public class OrdenDeArrays {
    private Scanner teclado;
    private int[] sueldo;
    
    public void cargar()
    {
        teclado=new Scanner(System.in);
        sueldo=new int[5];
        for(int f=0; f<sueldo.length;f++){
            System.out.print("Introduce sueldo;");
            sueldo[f]= teclado.nextInt();
        }
    }
    
        public void ordenar(){
        Arrays.sort(sueldo);
    }
    
    public void imprimir()
    {
        for(int f=0;f<sueldo.length;f++){
            System.out.println(sueldo[f]);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    OrdenDeArrays usuario = new OrdenDeArrays();
    usuario.cargar();
    usuario.ordenar();
    usuario.imprimir();
    } 
}
