package creacionProductos;

import java.math.BigDecimal;

public abstract class Producto {
    private String id;
    private String nombre;
    private BigDecimal precio;
    private String categoria;

    protected Producto(DatosProducto datos) {
        this.id = (String) datos.obtener("id");
        this.nombre = (String) datos.obtener("nombre");
        this.precio = (BigDecimal) datos.obtener("precio");
        this.categoria = (String) datos.obtener("categoria");
    }

    public String getNombre() { return nombre; }
    public BigDecimal getPrecio() { return precio; }
}