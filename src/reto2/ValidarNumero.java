package reto2;
import java.util.Scanner;
public class ValidarNumero {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int x;
        do{
        System.out.print("Ingrese el numero: ");
        x=leer.nextInt();
            String resultado = parImpar(x);
            System.out.println(resultado);
            int cuadrado = sqare(x);
            System.out.println("El cuadrado del numero es: " + cuadrado);
            int cubo = cubito(x);
            System.out.println("El cubo del numero es: " + cubo);
            int suma = sumarDigitos(x);
            System.out.println("La suma de los digitos es: " + suma);
            String primo = esPrimo(x);
            System.out.println("El numero " + primo);
        } while (x!=0);
    }
    
    public static String parImpar(int a) {
    return (a %2 == 0) ? "El número es Par" : "El número es Impar";
}
    
    public static int sqare(int x){
        int cuadrado;
        cuadrado = x*x;
        return cuadrado;
    }
    
    public static int cubito(int x){
        int cubo;
        cubo = (x*x)*x;
        return cubo;
    }
    
    public static int sumarDigitos(int x){
        int suma = 0;
        String cadena = String.valueOf(x);
        for (int i = 0; i < cadena.length(); i++){
            int y = cadena.charAt(i) - '0';
            suma += y;
        }
        return suma;
    }
    
    public static String esPrimo(int numero) {
        String valor = "es primo";
        for (int i = 2; i < numero-1; i++){
            if (numero %i==0){
                valor = "no es primo";
            }
        }
        return valor;
    }
}
