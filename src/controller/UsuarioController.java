package controller;

import controller.base.RegistroControllerBase;
import entity.Usuario;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import service.IUsuarioService;
import service.UsuarioServiceImpl;

public class UsuarioController extends RegistroControllerBase<Usuario> {

    private IUsuarioService service;

    public void init() {
        service = new UsuarioServiceImpl();
        super.setService(service);
    }

    public void crearActualizarUsuario(Usuario usuario) {
        //super.setService(service);
        super.setRegistro(usuario);
        super.crearActualizarRegistro();
    }

    public void mostrarRegistros(DefaultTableModel modelo) {
        List<Usuario> listaUsuario = service.obtenerRegistro();
        modelo.setRowCount(0);
        for (Usuario usuario : listaUsuario) {
            Object[] fila = new Object[3];
            fila[0] = String.valueOf(usuario.getId_usuario());
            fila[1] = usuario.getNombre();
            fila[2] = usuario.getPassword();
            modelo.addRow(fila);
        }
    }

    public Usuario buscarRegistoNC(Usuario usuario) {
        return service.buscarRegistro(usuario);
    }

    public Usuario buscarRegistoNombre(String nombre) {
        return service.buscarRegistro(nombre);
    }

    public Usuario buscarRegisto(int id) {
        return service.buscarRegistro(id);
    }

    public void eliminarRegistro(int id) {
        service.eliminarRegistro(id);
    }

}
