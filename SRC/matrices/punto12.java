package SRC.matrices;
import java.util.Random;
import java.util.Scanner;
public class punto12 {

public class Ejercicio12 {
    // Método para generar matriz cuadrada
    public static int[][] generarMatriz(int n) {
        Random rand = new Random();
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = rand.nextInt(100); // números entre 0 y 99
            }
        }
        return matriz;
    }
    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz generada:");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }

    // Método para sumar diagonal opuesta
    public static int sumarDiagonalOpuesta(int[][] matriz) {
        int suma = 0;
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            suma += matriz[i][n - 1 - i]; 
            // posición (i, n-1-i) → diagonal secundaria
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer tamaño de la matriz
        System.out.print("Ingrese tamaño de la matriz (n): ");
        int n = sc.nextInt();

        // Generar matriz
        int[][] matriz = generarMatriz(n);
        imprimirMatriz(matriz);

        // Calcular sumatoria diagonal opuesta
        int suma = sumarDiagonalOpuesta(matriz);
        System.out.println("La sumatoria de la diagonal opuesta es: " + suma);
        sc.close();
    }

}
}
