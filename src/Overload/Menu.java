package Overload;
import java.util.Scanner;
public class Menu {
    /**
     * En este programa se lleva a cabo un menú con distintas
     * posibles operaciones para lo cual se hace llamado a 
     * métodos que se encuentran en la clase de Operaciones
     * @param args 
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int opcion;
        do{
            Operaciones.linea();
            System.out.println("1...Mandar Saludo");
            System.out.println("2...Incrementar");
            System.out.println("3...Sumar 2 numeros");
            System.out.println("4...Sumar 3 numeros");
            System.out.println("5...Comparar numeros");
            System.out.println("6...Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion){
                case 1: Operaciones.linea();
                        System.out.print("Nombre: ");
                        String nombre = leer.nextLine();
                        System.out.println(Operaciones.saludoMayus(nombre));
                        break;
                case 2: Operaciones.linea();
                        System.out.print("Numero a incrementar: ");
                        int a = leer.nextInt();
                        int b = Operaciones.incrementaNumero(a);
                        System.out.println("Resultado: "+b);
                        break;
                case 3: Operaciones.linea();
                        System.out.print("Numero 1: ");
                        int x = leer.nextInt();
                        System.out.print("Numero 2: ");
                        int y = leer.nextInt();
                        int suma1 = Operaciones.sumar(x, y);
                        System.out.println("La suma de los numero es: "+suma1);
                        break;
                case 4: Operaciones.linea();
                        System.out.print("Numero 1: ");
                        int m = leer.nextInt();
                        System.out.print("Numero 2: ");
                        int n = leer.nextInt();
                        System.out.print("Numero 3: ");
                        int o = leer.nextInt();
                        int suma2 = Operaciones.sumar(m, n, o);
                        System.out.println("La suma de los numero es: "+suma2);
                        break;
                case 5: Operaciones.linea();
                        System.out.print("Numero 1: ");
                        int e = leer.nextInt();
                        leer.nextLine();
                        System.out.print("Numero 2: ");
                        int f = leer.nextInt();
                        leer.nextLine();
                        boolean t = Operaciones.compararNumero(e, f);
                        if (t==false)System.err.println("Los numeros son diferentes");
                        else System.out.println("Los numeros son iguales");
                        break;
            }
        } while (opcion !=6);
    }
}
