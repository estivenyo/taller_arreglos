package SRC.matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {
    // Método para generar matriz aleatoria
    public static int[][] generarMatriz(int m, int n) {
        Random rand = new Random();
        int[][] matriz = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = rand.nextInt(100); // números entre 0 y 99
            }
        }
        return matriz;
    }

    // Método para imprimir matriz
    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz generada:");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }

    // Método para buscar número en la matriz
    public static void buscarNumero(int[][] matriz, int numero) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numero) {
                    System.out.println("Número " + numero + " encontrado en posición: (" + i + "," + j + ")");
                    return; // salir en la primera ocurrencia
                }
            }
        }
        System.out.println("Número " + numero + " no se encuentra en la matriz.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer dimensiones
        System.out.print("Ingrese número de filas (m): ");
        int m = sc.nextInt();
        System.out.print("Ingrese número de columnas (n): ");
        int n = sc.nextInt();

        // Generar matriz
        int[][] matriz = generarMatriz(m, n);
        imprimirMatriz(matriz);

        // Leer número a buscar
        System.out.print("Ingrese número a buscar: ");
        int numero = sc.nextInt();

        // Buscar número
        buscarNumero(matriz, numero);
        sc.close();
    }

}