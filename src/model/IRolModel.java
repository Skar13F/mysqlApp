
package model;

import entity.Rol;
import java.util.List;

public interface IRolModel {

    public void insertarRegistro(Rol rol);
    public List<Rol> obtenerRegistro();
    public void imprimir(List<Rol> lista);
    public void eliminarRegistro(Rol rol);
    public Rol buscarRegistro(int id);
    public void actualizarRegistro(Rol rol, int id);
}
