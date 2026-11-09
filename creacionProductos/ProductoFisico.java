package creacionProductos;

public class ProductoFisico extends Producto {
    private double pesoKg;
    private double largoCm;
    private double anchoCm;
    private double altoCm;

    public ProductoFisico(DatosProducto datos) {
        super(datos);
        // Validaciones simuladas usando un casteo
        this.pesoKg = (double) datos.obtener("pesoKg");
        this.largoCm = (double) datos.obtener("largoCm");
        this.anchoCm = (double) datos.obtener("anchoCm");
        this.altoCm = (double) datos.obtener("altoCm");
    }
}