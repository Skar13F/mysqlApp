
package controller;

import controller.base.RegistroControllerBase;
import entity.Jugador;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import service.IJugadorService;
import service.JugadorServiceImpl;

public class JugadorController extends RegistroControllerBase<Jugador>{
    private IJugadorService service;
    
    public void init() {
        service =new JugadorServiceImpl();
        super.setService(service);
    }
    
    public void crearRegistro(Jugador jugador){
        super.setService(service);
        super.setRegistro(jugador);
        super.crearActualizarRegistro();
    }
    
    public void mostrarRegistros(DefaultTableModel modelo){
        List<Jugador> listaJugador=super.obtenerRegistro();
        modelo.setRowCount(0);
        for (Jugador jugador : listaJugador) {
            Object[] fila=new Object[2];
            fila[0]=String.valueOf(jugador.getId_jugador());
            fila[1]=jugador.getNombre();
            modelo.addRow(fila);
        }
    }
    
    public Jugador buscarRegistroTelefono(String telefono){      
        System.out.println("Entró a jugadorController");
        return  service.buscarRegistro(telefono);
    }
    
    public void eliminarRegistro(int id){
        service.eliminarRegistro(id);
    }    
}
