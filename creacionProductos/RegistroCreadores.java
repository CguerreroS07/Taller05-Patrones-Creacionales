package creacionProductos;

import java.util.HashMap;
import java.util.Map;

public class RegistroCreadores {
    private Map<String, CreadorProducto> creadores = new HashMap<>();

    public void registrar(String tipo, CreadorProducto creador) {
        creadores.put(tipo, creador);
    }

    public CreadorProducto obtener(String tipo) {
        return creadores.get(tipo);
    }

    public void cargarConfiguracion(String ruta) {
        System.out.println("Cargando configuración desde: " + ruta);
    }
}