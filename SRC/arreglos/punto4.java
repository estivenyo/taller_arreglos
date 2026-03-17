package SRC.arreglos;
import java.util.Random;

public class punto4 {
       public static int[] generarDatos(int n) {
        Random rand = new Random();
        int[] datos = new int[n];
        for (int i = 0; i < n; i++) {
            datos[i] = rand.nextInt(101) - 50;
        }
        return datos;
    }
    public static int encontrarMinimo(int[] datos) {
        int min = datos[0];
        for (int d : datos) {
            if (d < min) min = d;
        }
        return min;
    }
    public static int encontrarMaximo(int[] datos) {
        int max = datos[0];
        for (int d : datos) {
            if (d > max) max = d;
        }
        return max;
    }
    public static void imprimir(int[] datos, int min, int max) {
        System.out.println("Arreglo generado:");
        for (int d : datos) System.out.print(d + " ");
        System.out.println("\nEl Numero menor: " + min);
        System.out.println("El Numero mayor: " + max);
    }
    public static void main(String[] args) {
        int[] datos = generarDatos(25);
        int min = encontrarMinimo(datos);
        int max = encontrarMaximo(datos);
        imprimir(datos, min, max);
    }
}
