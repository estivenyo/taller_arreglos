package SRC.arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class punto7 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> pares = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            pares.add(i * 2);
        }
        System.out.println("ArrayList inicial:");
        System.out.println(pares);
        System.out.print("Ingrese un número para insertar: ");
        int nuevo = sc.nextInt();
        pares.add(nuevo);
        Collections.sort(pares);
        System.out.println("ArrayList después de insertar:");
        System.out.println(pares);
        System.out.print("Ingrese un número para eliminar: ");
        int eliminar = sc.nextInt();
        if (pares.remove(Integer.valueOf(eliminar))) {
            System.out.println("Se eliminó el número " + eliminar);
        } else {
            System.out.println("El número " + eliminar + " no está en la lista.");
        }
        System.out.println("ArrayList final:");
        System.out.println(pares);
        sc.close();
    }
}
