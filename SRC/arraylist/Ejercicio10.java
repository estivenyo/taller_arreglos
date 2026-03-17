package SRC.arraylist;

import java.util.*;
import java.io.*;

class Partido {
    String local;
    String visitante;
    int golesLocal;
    int golesVisitante;

    public Partido(String local, String visitante, int golesLocal, int golesVisitante) {
        this.local = local;
        this.visitante = visitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    public boolean esEmpate() {
        return golesLocal == golesVisitante;
    }

    public boolean ganoVisitante() {
        return golesVisitante > golesLocal;
    }

    public boolean ganoLocal() {
        return golesLocal > golesVisitante;
    }

    @Override
    public String toString() {
        return local + " " + golesLocal + " - " + golesVisitante + " " + visitante;
    }
}

public class Ejercicio10 {
    public static void main(String[] args) {
        List<Partido> partidos = leerPartidos("src/arraylist/Partidoliga.txt");

        // 1. Mostrar partidos donde el visitante ganó
        System.out.println("Partidos donde el visitante ganó:");
        for (Partido p : partidos) {
            if (p.ganoVisitante()) {
                System.out.println(p);
            }
        }

        // 2. Contar cuántas veces ganó Barcelona
        long victoriasBarcelona = partidos.stream()
            .filter(p -> (p.local.equalsIgnoreCase("Barcelona") && p.ganoLocal())
                      || (p.visitante.equalsIgnoreCase("Barcelona") && p.ganoVisitante()))
            .count();
        System.out.println("\nBarcelona ganó " + victoriasBarcelona + " veces.");

        // 3. Eliminar partidos que no sean empate
        partidos.removeIf(p -> !p.esEmpate());
        System.out.println("\nPartidos restantes (solo empates):");
        for (Partido p : partidos) {
            System.out.println(p);
        }

        // 4. Contar cuántos partidos ganó el equipo local
        long victoriasLocales = partidos.stream().filter(Partido::ganoLocal).count();
        System.out.println("\nEl equipo local ganó " + victoriasLocales + " partidos.");
    }

    private static List<Partido> leerPartidos(String ruta) {
        List<Partido> lista = new ArrayList<>();
        try (Scanner sc = new Scanner(new File(ruta))) {
            while (sc.hasNextLine()) {
                String[] datos = sc.nextLine().split(",");
                // Formato esperado: local,visitante,golesLocal,golesVisitante
                lista.add(new Partido(
                    datos[0], datos[1],
                    Integer.parseInt(datos[2]),
                    Integer.parseInt(datos[3])
                ));
            }
        } catch (Exception e) {
            System.out.println("Error leyendo archivo: " + e.getMessage());
        }
        return lista;
    }
}