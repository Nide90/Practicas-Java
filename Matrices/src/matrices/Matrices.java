package matrices;
import java.util.Scanner;

public class Matrices {
    private Scanner teclado;
    private int[][] mat;
    
    public void cargar(){
        teclado= new Scanner(System.in);
        mat= new int[3][5];
        for(int f=0; f<3;f++){
            for(int c=0;c<5;c++){
                System.out.print("Ingrese componente:");
                mat [f][c]= teclado.nextInt();
            }
        }
    }
    
    public void imprimir(){
        for(int f=0; f<3;f++){
            for(int c=0;c<5;c++){
                System.out.print(mat[f][c]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
       Matrices ma=new Matrices();
       ma.cargar();
       ma.imprimir();
        
    }
    
}
