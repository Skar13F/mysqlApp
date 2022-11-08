
package service;

import entity.Rol;
import java.util.List;

public interface IRolService {
    public void insertarRegistro(Rol rol);
    public List<Rol> obtenerRegistro();
}
