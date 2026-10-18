package principal;

import Parser.ProductoParser;

public class Ejercicio3LeerExcel {
    public static void main(String[] args) {
        final var productoMap = ProductoParser.getMapProducto();

        final var avena = productoMap.get("AVENA");
        final var precioTotal = avena.obtenerPrecioTotal();

        System.out.printf("El precio total de la avena es %.2f%n", precioTotal);
    }
}
