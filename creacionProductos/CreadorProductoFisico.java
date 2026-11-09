package creacionProductos;

class CreadorProductoFisico extends CreadorProducto {
    @Override
    public Producto crearProducto(DatosProducto datos) {
        System.out.println("Creando Producto Físico...");
        return new ProductoFisico(datos);
    }
}