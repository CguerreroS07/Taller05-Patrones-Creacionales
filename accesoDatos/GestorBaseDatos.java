package accesoDatos;

import java.sql.Connection;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class GestorBaseDatos implements AccesoDatos {
    private static GestorBaseDatos instancia;
    private Connection conexion; 
    private GestorBaseDatos() {
        System.out.println("Inicializando la conexión a la base de datos");
    }

    public static synchronized GestorBaseDatos getInstancia() {
        if (instancia == null) {
            instancia = new GestorBaseDatos();
        }
        return instancia;
    }

    @Override
    public List> consultar(String sql) {
        System.out.println("Ejecutando consulta: " + sql);
        return new ArrayList<>();
    }

    @Override
    public int actualizar(String sql) {
        System.out.println("Ejecutando actualización: " + sql);
        return 1;
    }
}