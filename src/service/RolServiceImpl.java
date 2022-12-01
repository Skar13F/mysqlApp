
package service;

import entity.Rol;
import java.util.List;
import model.IRolModel;
import model.RolModelImpl;

public class RolServiceImpl implements IRolService{
    //hacemos una instancia a la capa model
    IRolModel model= new RolModelImpl();
    /*@Override
    public void insertarRegistro(Rol rol) {
        model.insertarRegistro(rol);
    }

    @Override
    public List<Rol> obtenerRegistro() {
        return model.obtenerRegistro();
    }

    @Override
    public void eliminarRegistro(Rol rol) {
        model.eliminarRegistro(rol);
    }

    @Override
    public Rol buscarRegistro(int id) {
        return model.buscarRegistro(id);
    }

    @Override
    public void actualizarRegistro(Rol rol, Rol rolNuevo) {
        model.actualizarRegistro(rol, rolNuevo);
    }*/

    @Override
    public void insertarRegistro(Rol registro) {
        model.insertarRegistro(registro);
    }

    @Override
    public List<Rol> obtenerRegistro() {
        return model.obtenerRegistro();
    }

    @Override
    public void eliminarRegistro(int id) {
        model.eliminarRegistro(id);
    }

    @Override
    public Rol buscarRegistro(int id) {
        return model.buscarRegistro(id);
    }

    @Override
    public void actualizarRegistro(Rol registro) {
        model.actualizarRegistro(registro);
    }

    @Override
    public Rol buscarRegistro(Rol registro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Rol buscarRegistro(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
