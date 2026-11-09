package accesoDatos;

import java.util.List;
import java.util.Map;

public interface AccesoDatos {
    List> consultar(String sql);
    int actualizar(String sql);
}