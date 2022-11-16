package model;

import bd.Conexion;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import entity.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioModelImpl implements IUsuarioModel {

    private Conexion conexion;
    private Connection connection;
    private Statement stm;

    public static void main(String[] args) {
        IUsuarioModel model = new UsuarioModelImpl();
        Usuario usuario = new Usuario();

        usuario.setNombre("admin");
        //model.insertarRegistro(usuario);
        model.obtenerRegistro();
        System.out.println("Tamaño: " + model.obtenerRegistro().size());
        model.imprimir(model.obtenerRegistro());
    }
//    public static void main(String[] args) throws ClassNotFoundException {
//        Conexion conexion=new Conexion();
//        conexion.getConnection();
//    }

    @Override
    public void insertarRegistro(Usuario usuario) {
        try {
            conexion = new Conexion();//se establecen los valores de la bd
            connection = conexion.getConnection();// se obtiene la conexión a la bd
            //String query="INSERT INTO Usuario(usuario) values('administrador')";
            //String query = "INSERT INTO Usuario(usuario) values('" + usuario.getNombre() + "')";
            String query = "CALL insertarUsuario('" + usuario.getNombre() +"','"+usuario.getPassword()+ "')";
            stm = connection.createStatement();
            stm.execute(query);
            stm.close();
            connection.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public List<Usuario> obtenerRegistro() {
        try {
            List<Usuario> listaUsuario = new ArrayList<>();
            ResultSet rs;
            conexion = new Conexion();//se establecen los valores de la bd
            connection = conexion.getConnection();// se obtiene la conexión a la bd
            //String query="INSERT INTO Usuario(usuario) values('administrador')";
            //String query = "SELECT * FROM Usuario";
            String query = "CALL obtenerUsuario";
            stm = connection.createStatement();
            rs = stm.executeQuery(query);
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId_usuario(rs.getInt(1));// o se pude hacer usuario.setId_usuario(rs.getInt("idUsuario"));
                usuario.setNombre(rs.getString(2));// o se pude hacer usuario.setNombre(rs.getString("usuario"));
                usuario.setPassword(rs.getString(3));
                listaUsuario.add(usuario);
            }

            stm.close();
            connection.close();
            return listaUsuario;

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public void imprimir(List<Usuario> lista) {
        for (Usuario usuario : lista) {
            System.out.println("Usuario: " + usuario.getNombre());
        }
    }

    @Override
    public void eliminarRegistro(Usuario usuario) {

        try {
            conexion = new Conexion();//se establecen los valores de la bd
            connection = conexion.getConnection();// se obtiene la conexión a la bd
            //String query = "DELETE FROM Usuario WHERE idUsuario='" + usuario.getId_usuario() + "'";
            String query = "CALL eliminarUsuario('" + usuario.getId_usuario() + "')";
            stm = connection.createStatement();
            stm.execute(query);

            connection.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public Usuario buscarRegistro(int id) {
        try {
            Usuario usuario = new Usuario();
            ResultSet rs;
            conexion = new Conexion();//se establecen los valores de la bd
            connection = conexion.getConnection();// se obtiene la conexión a la bd
            //String query="INSERT INTO Usuario(usuario) values('administrador')";
            //String query = "SELECT idUsuario, usuario FROM Usuario where idUsuario=" + id;
            String query = "CALL buscarUsuario('" + id + "')";
            stm = connection.createStatement();
            rs = stm.executeQuery(query);
            rs.next();
            usuario.setId_usuario(rs.getInt(1));// o se pude hacer usuario.setId_usuario(rs.getInt("idUsuario"));
            usuario.setNombre(rs.getString(2));// o se pude hacer usuario.setNombre(rs.getString("usuario"));

            stm.close();
            connection.close();
            return usuario;

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

            return null;
        }

    }

    @Override
    public void actualizarRegistro(Usuario usuario, int idUsuario) {
        try {
            conexion = new Conexion();//se establecen los valores de la bd
            connection = conexion.getConnection();// se obtiene la conexión a la bd
            //String query = "UPDATE Usuario SET usuario='" + usuarioNuevo.getNombre() + "' WHERE Usuario.idUsuario='" + usuario.getId_usuario() + "';";
            String query = "CALL actualizarUsuario('" + usuario.getNombre()+"','"+ idUsuario+ "')";
            stm = connection.createStatement();
            stm.execute(query);

            connection.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
