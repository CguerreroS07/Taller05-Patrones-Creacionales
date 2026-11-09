package creacionProductos;

public class ProductoDigital extends Producto {
    private double tamanoMB;
    private String formato;

    public ProductoDigital(DatosProducto datos) {
        super(datos);
        this.tamanoMB = (double) datos.obtener("tamanoMB");
        this.formato = (String) datos.obtener("formato");
    }
}