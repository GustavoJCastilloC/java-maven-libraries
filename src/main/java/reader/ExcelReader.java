package reader;

import com.poiji.bind.Poiji;
import modelos.Monstruo;
import modelos.Producto;
import modelos.Videojuego;

import java.io.File;
import java.util.List;

public class ExcelReader {
    private final static String excelPath = "src/main/resources/data/dataExcel.xlsx";

    public static List<Videojuego> obtenerListaVideojuego() {
        return Poiji.fromExcel(new File(excelPath), Videojuego.class);
    }

    public static List<Monstruo> obtenerListaMonstruo() {
        return Poiji.fromExcel(new File(excelPath), Monstruo.class);
    }

    public static List<Producto> obtenerListaProducto() {
        return Poiji.fromExcel(new File(excelPath), Producto.class);
    }
}
