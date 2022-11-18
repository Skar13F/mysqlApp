
package controller;

import controller.base.RegistroControllerBase;
import entity.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import service.IUsuarioService;
import service.UsuarioServiceImpl;

public class UsuarioController extends RegistroControllerBase<Usuario>{
    private IUsuarioService service=new UsuarioServiceImpl();
    
    public void crearRegistro(Usuario usuario){
        
        //service=new UsuarioServiceImpl(); //lo pasé arriba porque lo ocuparemos en todos los métodos
        super.setService(service);
        super.setRegistro(usuario);
        super.crearActualizarRegistro();
        //service.insertarRegistro(usuario);
    }
    
    public void mostrarRegistros(DefaultTableModel modelo){
        
        List<Usuario> listaUsuario=service.obtenerRegistro();
        modelo.setRowCount(0);
        for (Usuario usuario : listaUsuario) {
            Object[] fila=new Object[3];
            fila[0]=String.valueOf(usuario.getId_usuario());
            fila[1]=usuario.getNombre();
            fila[2]=usuario.getPassword();
            //usuario.getUsuario();
            modelo.addRow(fila);
        }
    }
    
    
    //realiza una instancia a la capa service
    /*IUsuarioService service=new UsuarioServiceImpl();
    public void crearRegistro(Usuario usuario){
        service.insertarRegistro(usuario);
    }
    
    
    
    public Usuario buscarRegistro(int id){      
        return  service.buscarRegistro(id);
    }
    
    public void eliminarRegistro(Usuario usuario){
        service.eliminarRegistro(usuario);
    }
    
    public void actualizarRegistro(Usuario usuario, int id){
        service.actualizarRegistro(usuario, id);
    }*/
    
}
