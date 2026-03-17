package SRC.arraylist;

import java.util.ArrayList;
import java.util.Random;

public class punto6 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();
        int num;
        do {
            num = rand.nextInt(21) - 10;
            numeros.add(num);
        } while (num != 10);
        System.out.println("Numeros Leidos:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        int suma = 0;
        for (int n : numeros) {
            suma += n;
        }
        double media = (double) suma / numeros.size();
        System.out.println("\nSuma: " + suma);
        System.out.println("Media: " + media);
    }
}
