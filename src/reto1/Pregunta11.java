package reto1;
import java.util.ArrayList;
import java.util.Scanner;
public class Pregunta11 {
    /**
     * Eduardo Jesús FLores Navarro (23 de Septiembre del 2025)
     * En esta clase, se hizo el repaso del exámen, llevando a cabo
     * el ejercicio 11, haciendo que el programa registre nombres
     * en un ArrayList de tipo String y no permite que se repitan los
     * nombres, una vez finalizado, arroja el numero de nombres registrados
     * @param args 
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        ArrayList <String> nombres = new ArrayList<>();
        
        String n;
        do{
            System.out.println("Nombre: ");
            n=leer.nextLine();
            boolean siExiste = false;
            for (String nombre : nombres) {
                if (nombre.equalsIgnoreCase(n)){
                    siExiste = true;
                    break;
            }
            }
            if(!siExiste)
            nombres.add(n);
        } while (!n.equalsIgnoreCase("Salir"));
        System.out.println("La cantidad de nombres es: "+(nombres.size()-1));
    }
}
