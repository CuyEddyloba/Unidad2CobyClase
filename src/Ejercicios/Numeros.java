package Ejercicios;
/**
 *Metodo que imprime 100 numeros usando recursividad
 * @author eduar
 */
public class Numeros {
    public static void main(String[] args) {
        
        //Llamada al metodo 1
        numeros(1);
        
        //Llamada al metodo 2
        numeros2(100);
        
        //Llamada al metodo 3
        numeros3(100);
    }
    
    //metodo 1
    public static void numeros(int x){
        if (x > 100) return;
        System.out.println(x);
        numeros(x + 1);  
    }
    
    //Metodo 2 
    public static void numeros2(int i){
        if (i>=0){
            numeros2(i -1);
            System.out.println(i);
        }
    }
    
    //Metodo 3 para imprimir inverso
    public static void numeros3(int i){
        if (i>=0){
            System.out.println(i);
            numeros3(i -1);
        }
    }
    
}
