
package model;

import bd.Conexion;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import entity.Rol;
import java.util.ArrayList;
import java.util.List;

public class RolModelImpl implements IRolModel{
    private Conexion conexion;
    private Connection connection;
    private Statement stm;
    
    
    public static void main(String[] args) {
        IRolModel model=new RolModelImpl();
        Rol rol =new Rol();
        
        rol.setRol("admin");
        //model.insertarRegistro(rol);
        model.obtenerRegistro();
        System.out.println("Tamaño: "+model.obtenerRegistro().size());
        model.imprimir(model.obtenerRegistro());
    }
//    public static void main(String[] args) throws ClassNotFoundException {
//        Conexion conexion=new Conexion();
//        conexion.getConnection();
//    }

    @Override
    public void insertarRegistro(Rol rol){
        try {
            conexion=new Conexion();//se establecen los valores de la bd
            connection=conexion.getConnection();// se obtiene la conexión a la bd
            //String query="INSERT INTO Rol(rol) values('administrador')";
            String query="INSERT INTO Rol(rol) values('"+rol.getRol()+"')";
            stm=connection.createStatement();
            stm.execute(query);
            stm.close();
            connection.close();
            
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    @Override
    public List<Rol> obtenerRegistro() {
        try {
            List<Rol> listaRol=new ArrayList<>();
            ResultSet rs;
            conexion=new Conexion();//se establecen los valores de la bd
            connection=conexion.getConnection();// se obtiene la conexión a la bd
            //String query="INSERT INTO Rol(rol) values('administrador')";
            String query="SELECT * FROM Rol";
            stm=connection.createStatement();
            rs=stm.executeQuery(query);
            while(rs.next()){
                Rol rol=new Rol();
                rol.setIdRol(rs.getInt(1));// o se pude hacer rol.setIdRol(rs.getInt("idRol"));
                rol.setRol(rs.getString(2));// o se pude hacer rol.setRol(rs.getString("rol"));
                listaRol.add(rol);
            }
            
            stm.close();
            connection.close();
            return listaRol;
            
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
            return null;
        }
    }

    @Override
    public void imprimir(List<Rol> lista) {
        for (Rol rol : lista) {
            System.out.println("Rol: "+rol.getRol());
        }
    }
    
}
