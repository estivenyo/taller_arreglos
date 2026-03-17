package SRC.arreglos;

public class punto2 {
    public static void main(String[] args) {
        int[] pares = new int[100];
        for (int i = 0 ; i < pares.length; i++){
         pares[i] = (i + 1) * 2;
        }
    System.out.println("aqui los 100 primeros en una linea");
    for (int p : pares){
        System.out.println(p + " ");
    }
    System.out.println("ahora en 10 lineas");
    for (int i = 0 ; i < pares.length; i++){
     if (i % 10 == 0) {
                System.out.print("Línea " + (i / 10 + 1) + ": ");
            }
            System.out.print(pares[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println(); 
            }
        }
    }
}
