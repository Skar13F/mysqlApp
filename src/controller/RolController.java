
package controller;

import controller.base.RegistroControllerBase;
import entity.Rol;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import service.IRolService;
import service.RolServiceImpl;

public class RolController extends RegistroControllerBase<Rol>{
    private IRolService service=new RolServiceImpl();
    
    public void crearRegistro(Rol rol){
        
        //service=new RolServiceImpl(); //lo pasé arriba porque lo ocuparemos en todos los métodos
        super.setService(service);
        super.setRegistro(rol);
        super.crearRegistro();
        //service.insertarRegistro(rol);
    }
    
    public void mostrarRegistros(DefaultTableModel modelo){
        
        List<Rol> listaRol=service.obtenerRegistro();
        modelo.setRowCount(0);
        for (Rol rol : listaRol) {
            Object[] fila=new Object[2];
            fila[0]=String.valueOf(rol.getIdRol());
            fila[1]=rol.getRol();
            //rol.getRol();
            modelo.addRow(fila);
        }
    }
    
    
    //realiza una instancia a la capa service
    /*IRolService service=new RolServiceImpl();
    public void crearRegistro(Rol rol){
        service.insertarRegistro(rol);
    }
    
    
    
    public Rol buscarRegistro(int id){      
        return  service.buscarRegistro(id);
    }
    
    public void eliminarRegistro(Rol rol){
        service.eliminarRegistro(rol);
    }
    
    public void actualizarRegistro(Rol rol, int id){
        service.actualizarRegistro(rol, id);
    }*/
    
}
