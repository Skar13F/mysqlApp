
package controller;

import entity.Rol;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import service.IRolService;
import service.RolServiceImpl;

public class RolController {
    //realiza una instancia a la capa service
    IRolService service=new RolServiceImpl();
    public void crearRegistro(Rol rol){
        service.insertarRegistro(rol);
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
    public void buscarRegistro(int id){
        List<Rol> listaRol=service.obtenerRegistro();
        int bandera=0;
        for (Rol rol : listaRol) {
            if(rol.getIdRol()==id){
                JOptionPane.showMessageDialog(null, rol.getRol());
                bandera=1;
                break;
            }
        }
        if(bandera==0){
            JOptionPane.showMessageDialog(null, "Registro no encontrado");
        }
    }
}
