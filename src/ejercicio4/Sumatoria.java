package ejercicio4;
/**
 * En este proyecto se utilizará un metodo recursivo para hacer la
 * sumatoria de un arreglo que almacene distintos valores
 * @author eduar
 */
public class Sumatoria {
    public static void main(String[] args) {
        int[] numeros = {3, 5, 7, 2, 8};
        int resultado = sumatoria(numeros, 0);
        System.out.println("La suma de los números es: " + resultado);

    }
    public static int sumatoria(int[] a, int i ){
    // Si el índice supera el tamaño del arreglo, retorna 0
        if (i >= a.length) {
            return 0;
        }
        // Recursivo: suma el elemento actual con la suma del resto
        return a[i] + sumatoria(a, i + 1);
        }
}

