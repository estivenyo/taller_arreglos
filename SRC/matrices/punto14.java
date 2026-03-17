package SRC.matrices;
import java.util.Random;
import java.util.Scanner;

public class punto14 {
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

    public static int[][] transpuesta(int[][] matriz) {
        int m = matriz.length;
        int n = matriz[0].length;
        int[][] transpuesta = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        return transpuesta;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese número de filas (m): ");
        int m = sc.nextInt();
        System.out.print("Ingrese número de columnas (n): ");
        int n = sc.nextInt();

        int[][] matriz = generarMatriz(m, n);
        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        int[][] trans = transpuesta(matriz);
        System.out.println("Matriz transpuesta:");
        imprimirMatriz(trans);
        sc.close();
    }
}
