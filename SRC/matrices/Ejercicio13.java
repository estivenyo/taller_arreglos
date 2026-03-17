package SRC.matrices;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio13 {
    public static int[][] generarMatriz(int n) {
        Random rand = new Random();
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
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

    public static boolean esSimetrica(int[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void imprimirEsquinas(int[][] matriz) {
        int n = matriz.length;
        System.out.println("Superior izquierda: " + matriz[0][0]);
        System.out.println("Superior derecha: " + matriz[0][n - 1]);
        System.out.println("Inferior izquierda: " + matriz[n - 1][0]);
        System.out.println("Inferior derecha: " + matriz[n - 1][n - 1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese tamaño de la matriz (n): ");
        int n = sc.nextInt();

        int[][] matriz = generarMatriz(n);
        imprimirMatriz(matriz);

        if (esSimetrica(matriz)) {
            System.out.println("La matriz es simétrica.");
        } else {
            System.out.println("La matriz NO es simétrica.");
        }

        imprimirEsquinas(matriz);
        sc.close();
    }
}