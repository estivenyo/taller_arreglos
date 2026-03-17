package SRC.arreglos;
import java.util.Random;
import java.util.Scanner;

public class punto3 {
    public static int[] generarDatos(int n) {
        Random rand = new Random();
        int[] datos = new int[n];
        for (int i = 0; i < n; i++) {
            datos[i] = rand.nextInt(10) + 1;
        }
        return datos;
    }
    public static long[] calcularFactoriales(int[] datos) {
        long[] factoriales = new long[datos.length];
        for (int i = 0; i < datos.length; i++) {
            factoriales[i] = factorial(datos[i]);
        }
        return factoriales;
    }
    private static long factorial(int num) {
        long f = 1;
        for (int i = 1; i <= num; i++) {
            f *= i;
        }
        return f;
    }
    public static void imprimir(int[] datos, long[] factoriales) {
        System.out.println("Numeros generados:");
        for (int d : datos) System.out.print(d + " ");
        System.out.println("\nFactoriales:");
        for (long f : factoriales) System.out.print(f + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese cuantos nuemros aleatorios: ");
        int n = sc.nextInt();
        int[] datos = generarDatos(n);
        long[] factoriales = calcularFactoriales(datos);
        imprimir(datos, factoriales);
        sc.close();
    }
}