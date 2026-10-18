package principal;

import modelos.Joke;
import reader.JsonReader;

import java.util.Arrays;

public class Ejercicio2LeerJson {
    public static void main(String[] args) {
        final var arrayJokes = JsonReader.leerJokeArray();
        ordenarArray(arrayJokes);
        System.out.printf("El array ordenado es: %s%n", Arrays.toString(arrayJokes));
    }

    private static void ordenarArray(Joke[] array) {
        final var n = array.length;

        for (var i = 0; i < n; i++) { //pasos
            for (var j = 0; j < n - i - 1; j++) { //subpasos
                //condición de desordenado
                if (array[j].getId() > array[j + 1].getId()) {
                    final var temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}