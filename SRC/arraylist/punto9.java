package SRC.arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class punto9 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numeros.add(rand.nextInt(100) + 1);
        }

        System.out.println("Lista original:");
        System.out.println(numeros);
        Collections.sort(numeros);
        System.out.println("Ordenada de menor a mayor:");
        System.out.println(numeros);
        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("Ordenada de mayor a menor:");
        System.out.println(numeros);
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (int n : numeros) {
            if (n % 2 == 0) {
                pares.add(n);
            } else {
                impares.add(n);
            }
        }
        System.out.println("Lista de pares:");
        System.out.println(pares);
        System.out.println("Lista de impares:");
        System.out.println(impares);
    }
}
