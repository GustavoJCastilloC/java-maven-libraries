package principal;

import modelos.Deportista;

public class Ejericio1DataAleatoria {
    public static void main(String[] args) {
        final var deportista1 = new Deportista();
        final var deportista2 = new Deportista();

        System.out.printf("Deportista 1: %s%n", deportista1);
        System.out.printf("Deportista 2: %s%n", deportista2);

        final var masVeloz = deportista1.getVelocidad() > deportista2.getVelocidad() ?
                deportista1.getNombre() : deportista2.getNombre();

        System.out.printf("El mas veloz es: %s%n", masVeloz);
    }
}