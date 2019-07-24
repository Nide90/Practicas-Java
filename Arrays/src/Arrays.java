import java.util.Scanner;
public class Arrays {
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
    public void imprimir(){
        for(int f=0; f<sueldo.length;f++){
            System.out.println(sueldo[f]);
        }
    }
        
    
    public static void main(String[] args) {
        // TODO code application logic here
        Arrays usuario = new Arrays();
        usuario.cargar();
        usuario.imprimir();
    }
    
}
