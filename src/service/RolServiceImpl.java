
package service;

import entity.Rol;
import java.util.List;
import model.IRolModel;
import model.RolModelImpl;

public class RolServiceImpl implements IRolService{
    //hacemos una instancia a la capa model
    IRolModel model= new RolModelImpl();
    @Override
    public void insertarRegistro(Rol rol) {
        model.insertarRegistro(rol);
    }

    @Override
    public List<Rol> obtenerRegistro() {
        return model.obtenerRegistro();
    }
    
}
