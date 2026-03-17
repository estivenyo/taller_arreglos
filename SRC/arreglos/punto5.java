package SRC.arreglos;
import java.util.Random;
public class punto5 {
    public static int[] generarDatos(int n) {
        Random rand = new Random();
        int[] datos = new int[n];
        for (int i = 0; i < n; i++) {
            datos[i] = rand.nextInt(900) + 100;
        }
        return datos;
    }
    public static int invertirNumero(int num) {
        int invertido = 0;
        while (num > 0) {
            int digito = num % 10;
            invertido = invertido * 10 + digito;
            num /= 10;
        }
        return invertido;
    }
    public static int[] invertirArreglo(int[] datos) {
        int[] invertidos = new int[datos.length];
        for (int i = 0; i < datos.length; i++) {
            invertidos[i] = invertirNumero(datos[i]);
        }
        return invertidos;
    }
    public static void imprimir(int[] datos, int[] invertidos) {
        System.out.println("Arreglo original:");
        for (int d : datos) System.out.print(d + " ");
        System.out.println("\nArreglo invertido:");
        for (int inv : invertidos) System.out.print(inv + " ");
    }
    public static void main(String[] args) {
        int[] datos = generarDatos(20);
        int[] invertidos = invertirArreglo(datos);
        imprimir(datos, invertidos);
    }
}
