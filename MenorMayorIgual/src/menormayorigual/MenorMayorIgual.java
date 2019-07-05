package menormayorigual;
import java.util.Scanner;
public class MenorMayorIgual
        {
 public static void main(String[] args)
 {
 Scanner sc = new Scanner(System.in);
 int a;
 int b;

 System.out.println("Ingrese un número entero entre 0 y 20:");
 a = sc.nextInt();
 if ((a < 0) || (a > 20))
 {
 System.out.println("Error.Vuelva a ejecutar el programa");
 System.exit(0);
 }

 System.out.println("Ingrese otro nümero entero entre 0 y 20:");
 b = sc.nextInt();
 if ((b < 0) || (b > 20))
 {
 System.out.println("Error.Vuelva a ejecutar el programa");
 System.exit(0);
 }

 if (a > b)
 {
 System.out.println("El primer número es mayor al segundo");
 }

 if (b > a)
 {
 System.out.println("El segundo número es mayor al primero");
 }

 if (a == b)
 {
 System.out.println("Ambos números son iguales");
 }
 }
}
