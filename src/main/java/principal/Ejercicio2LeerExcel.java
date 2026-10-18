package principal;

import Parser.MonstruoParser;
import modelos.Monstruo;

import java.util.Arrays;

public class Ejercicio2LeerExcel {
    public static void main(String[] args) {
        final var arrayMonstruo = MonstruoParser.obtenerArrayMonstruo();
        ordenarArrayMonstruo(arrayMonstruo);

        System.out.printf("El array ordenado es: %s%n", Arrays.toString(arrayMonstruo));
    }

    private static void ordenarArrayMonstruo(Monstruo[] array) {
        final var n = array.length;

        for (var i = 0; i < n; i++) { //pasos
            for (var j = 0; j < n - i - 1; j++) { //subpasos
                //condicion de desordenado
                if (array[j].getNivel() < array[j + 1].getNivel()) {
                    final var temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}