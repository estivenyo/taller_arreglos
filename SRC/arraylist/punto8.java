package SRC.arraylist;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
public class punto8 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numeros.add(rand.nextInt(20) + 1);
        }
        Map<Integer, Integer> frecuencia = new HashMap<>();
        for (int n : numeros) {
            frecuencia.put(n, frecuencia.getOrDefault(n, 0) + 1);
        }
        System.out.println("Tabla de frecuencias:");
        for (int i = 1; i <= 20; i++) {
            int f = frecuencia.getOrDefault(i, 0);
            System.out.println("Número " + i + " aparece " + f + " veces.");
        }
        int maxNum = -1;
        int maxFreq = -1;
        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxNum = entry.getKey();
            }
        }
        System.out.println("El numero con mayor repeticiones es: " + maxNum + " con " + maxFreq + " apariciones.");
    }
}
