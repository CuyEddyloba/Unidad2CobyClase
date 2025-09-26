package Overload;
public class Operaciones {
    
    /**
     * En esta clase tengo los metodos necesarios para
     * las operaciones que son requeridas en este programa 
     * @param nombre
     * @return 
     */
    
    public static String saludoMayus(String nombre) {
        String mayus = "HOLA "+nombre.toUpperCase();
        return mayus;
    }
    
    public static int incrementaNumero(int n){
        int m = n+1;
        return m;
    }
    
    public static int sumar(int a, int b){
        int suma = a + b;
        return suma;
    }
    
    public static int sumar(int a, int b, int c){
        int suma = a + b + c;
        return suma;
    }
    
    public static boolean compararNumero(int a, int b){
        boolean i = false;
        if (a == b) i = true;
        return i;
    }
    
    public static void linea(){
        System.out.println("----------------------------------------------------");
    }
}
