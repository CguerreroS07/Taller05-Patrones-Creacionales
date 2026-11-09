package creacionProductos;


class CreadorProductoDigital extends CreadorProducto {
    @Override
    public Producto crearProducto(DatosProducto datos) {
        System.out.println("Creando Producto Digital...");
        return new ProductoDigital(datos);
    }
}