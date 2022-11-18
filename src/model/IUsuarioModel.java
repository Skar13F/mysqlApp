
package model;

import entity.Usuario;
import java.util.List;

public interface IUsuarioModel {

    public void insertarRegistro(Usuario usuario);
    public List<Usuario> obtenerRegistro();
    public void imprimir(List<Usuario> lista);
    public void eliminarRegistro(int id);
    public Usuario buscarRegistro(int id);
    public void actualizarRegistro(Usuario usuario);
}
