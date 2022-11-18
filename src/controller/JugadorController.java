
package controller;

import controller.base.RegistroControllerBase;
import entity.Jugador;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import service.IJugadorService;
import service.JugadorServiceImpl;

public class JugadorController extends RegistroControllerBase<Jugador>{
    private IJugadorService service=new JugadorServiceImpl();
    
    public void crearRegistro(Jugador jugador){
        
        //service=new JugadorServiceImpl(); //lo pasé arriba porque lo ocuparemos en todos los métodos
        super.setService(service);
        super.setRegistro(jugador);
        super.crearRegistro();
        //service.insertarRegistro(jugador);
    }
    
    public void mostrarRegistros(DefaultTableModel modelo){
        
        List<Jugador> listaJugador=service.obtenerRegistro();
        modelo.setRowCount(0);
        for (Jugador jugador : listaJugador) {
            Object[] fila=new Object[2];
            fila[0]=String.valueOf(jugador.getId_jugador());
            fila[1]=jugador.getNombre();
            //jugador.getJugador();
            modelo.addRow(fila);
        }
    }
    
    
    //realiza una instancia a la capa service
    /*IJugadorService service=new JugadorServiceImpl();
    public void crearRegistro(Jugador jugador){
        service.insertarRegistro(jugador);
    }
    
    
    
    public Jugador buscarRegistro(int id){      
        return  service.buscarRegistro(id);
    }
    
    public void eliminarRegistro(Jugador jugador){
        service.eliminarRegistro(jugador);
    }
    
    public void actualizarRegistro(Jugador jugador, int id){
        service.actualizarRegistro(jugador, id);
    }*/
    
}
