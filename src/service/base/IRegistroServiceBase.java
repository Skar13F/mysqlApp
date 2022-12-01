
package service.base;

import java.util.List;

public interface IRegistroServiceBase <T>{
    public void insertarRegistro(T registro);
    public List<T> obtenerRegistro();
    public void eliminarRegistro(int id);
    public T buscarRegistro(int id);
    public T buscarRegistro(T registro);
    public T buscarRegistro(String nombre);
    public void actualizarRegistro(T registro);
}
