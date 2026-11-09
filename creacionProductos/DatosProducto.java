package creacionProductos;

import java.util.Map;

public class DatosProducto {
    private Map<String, Object> atributos;

    public DatosProducto(Map<String, Object> atributos) {
        this.atributos = atributos;
    }

    public Object obtener(String clave) {
        return atributos.get(clave);
    }
}