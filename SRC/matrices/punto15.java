package SRC.matrices;

import java.util.Random;
import java.util.Scanner;

public class punto15 {
    public static int[][] generarMatriz(int m, int n) {
        Random rand = new Random();
        int[][] matriz = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = rand.nextInt(100);
            }
        }
        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] sumarMatrices(int[][] a, int[][] b) {
        int m = a.length;
        int n = a[0].length;
        int[][] suma = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                suma[i][j] = a[i][j] + b[i][j];
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese número de filas (m): ");
        int m = sc.nextInt();
        System.out.print("Ingrese número de columnas (n): ");
        int n = sc.nextInt();

        int[][] matrizA = generarMatriz(m, n);
        int[][] matrizB = generarMatriz(m, n);

        System.out.println("Matriz A:");
        imprimirMatriz(matrizA);
        System.out.println("Matriz B:");
        imprimirMatriz(matrizB);

        int[][] suma = sumarMatrices(matrizA, matrizB);
        System.out.println("Matriz suma:");
        imprimirMatriz(suma);
        sc.close();
    }
}