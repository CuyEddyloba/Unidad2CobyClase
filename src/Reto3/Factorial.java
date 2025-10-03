package Reto3;
import java.util.Scanner;
/**
 * En este proyecto hacemos un método para calcular el factorial de un numero
 * @author eduar
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.print("Numero: ");
        int num = leer.nextInt();
        int respuesta = factorial2(num);
        System.out.println(respuesta);
    }
    // Metodo que utiliza logica pendeja 
    public static int factorial(int x){
        int op = 1;
        for (int i = 2; i <= x; i++){
            op *= i;
        }
        return op;
    }
    // Metodo que utiliza recursividad
    public static int factorial2(int x){
        if (x == 0) return 1;
        else return factorial2(x-1) * x;
    }
}
