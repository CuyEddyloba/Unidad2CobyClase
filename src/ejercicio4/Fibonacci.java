package ejercicio4;
/**
 * En este programa, se va a programar el uso de Fibonacci por medio
 * de la recursividad
 * @author eduar
 */
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       /* System.out.print("Interacciones: ");
        int rep = leer.nextInt();
        for (int i = 1; i <= rep; i++) {
            System.out.println(fibonacci(i));
        }*/
       int a ;
       a = obtenerNumeroSecreto(5);
        System.out.println(a);
    }
    public static int fibonacci(int i){
        if (i <= 1) {
        return i;
        } 
        else {
        return fibonacci(i - 1) + fibonacci(i - 2);
        }
    }
    public static int obtenerNumeroSecreto( int n ){
        if (n==0) return 0;
        else return n + obtenerNumeroSecreto (n-1);
    }
}
