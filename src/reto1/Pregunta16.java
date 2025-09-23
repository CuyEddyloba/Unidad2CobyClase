package reto1;
import java.util.Scanner;
public class Pregunta16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int[] x = {3,2,8,6,3,7,3,1,4,-2,4};
        int mayor = x[0];
        int posicion = 0;
        for (int i = 1; i < x.length-1; i++){
            if(mayor<x[i]){
                mayor = x[i];
                posicion = i;
            }
        }
        System.out.println("El valor " + mayor + " está en la posicion " + posicion);
    }
    
}
