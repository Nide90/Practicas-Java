import javax.swing.JOptionPane;
public class Operaciones {
    public static void main (String[] args) {
    String cadena1=JOptionPane.showInputDialog("Inserte primer número");
   int num1 = 0;
   String cadena2=JOptionPane.showInputDialog("Inserte segundo número");        
   int num2 = 0;
    
     System.out.println ("La suma de los números es"); 
     System.out.println(num1+num2);   
     System.out.println ("El producto de los númros es");    
     System.out.println(num1*num2);
     System.out.println ("El cociente de los numeros es");
     System.out.println(num1/num2);   
    }
    
}
        
