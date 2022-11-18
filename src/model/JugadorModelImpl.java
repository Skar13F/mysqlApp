package model;

import bd.Conexion;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import entity.Jugador;
import java.util.ArrayList;
import java.util.List;

public class JugadorModelImpl implements IJugadorModel {

    private Conexion conexion;
    private Connection connection;
    private Statement stm;

    public static void main(String[] args) {
        IJugadorModel model = new JugadorModelImpl();
        Jugador jugador = new Jugador();

        jugador.setNombre("admin");
        jugador.setSexo("m");
        model.insertarRegistro(jugador);
        model.obtenerRegistro();
        System.out.println("Tamaño: " + model.obtenerRegistro().size());
        model.imprimir(model.obtenerRegistro());
    }
//    public static void main(String[] args) throws ClassNotFoundException {
//        Conexion conexion=new Conexion();
//        conexion.getConnection();
//    }

    @Override
    public void insertarRegistro(Jugador jugador) {
        try {
            conexion = new Conexion();//se establecen los valores de la bd
            connection = conexion.getConnection();// se obtiene la conexión a la bd
            //String query="INSERT INTO Jugador(jugador) values('administrador')";
            String query = "INSERT INTO jugador(nombre, edad, sexo, telefono, correo, direccion, puntos) values('" + jugador.getNombre()+"','"+
                    jugador.getEdad()+"','"+jugador.getSexo()+"','"+jugador.getTelefono()+"','"+jugador.getCorreo()+"','"+
                    jugador.getDireccion()+"','"+jugador.getPuntos()+"')";
            //String query = "CALL insertarRegistro('" + jugador.getJugador() + "')";
            stm = connection.createStatement();
            stm.execute(query);
            stm.close();
            connection.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public List<Jugador> obtenerRegistro() {
        try {
            List<Jugador> listaJugador = new ArrayList<>();
            ResultSet rs;
            conexion = new Conexion();//se establecen los valores de la bd
            connection = conexion.getConnection();// se obtiene la conexión a la bd
            //String query="INSERT INTO Jugador(jugador) values('administrador')";
            String query = "SELECT * FROM jugador";
            //String query = "CALL obtenerRegistro";
            stm = connection.createStatement();
            rs = stm.executeQuery(query);
            while (rs.next()) {
                Jugador jugador = new Jugador();
                jugador.setId_jugador(rs.getInt(1));// o se pude hacer jugador.setIdJugador(rs.getInt("idJugador"));
                jugador.setNombre(rs.getString(2));// o se pude hacer jugador.setJugador(rs.getString("jugador"));
                jugador.setEdad(Integer.parseInt(rs.getString(3)));
                jugador.setSexo(rs.getString(4));
                jugador.setTelefono(rs.getString(5));
                jugador.setDireccion(rs.getString(6));
                jugador.setPuntos(Integer.parseInt(rs.getString(3)));
                listaJugador.add(jugador);
            }

            stm.close();
            connection.close();
            return listaJugador;

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public void imprimir(List<Jugador> lista) {
        for (Jugador jugador : lista) {
            System.out.println("Jugador: " + jugador.getNombre());
        }
    }

    @Override
    public void eliminarRegistro(Jugador jugador) {

        try {
            conexion = new Conexion();//se establecen los valores de la bd
            connection = conexion.getConnection();// se obtiene la conexión a la bd
            String query = "DELETE FROM jugador WHERE id_jugador='" + jugador.getId_jugador() + "'";
            //String query = "CALL eliminarRegistro('" + jugador.getIdJugador() + "')";
            stm = connection.createStatement();
            stm.execute(query);

            connection.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public Jugador buscarRegistro(int id) {
        try {
            Jugador jugador = new Jugador();
            ResultSet rs;
            conexion = new Conexion();//se establecen los valores de la bd
            connection = conexion.getConnection();// se obtiene la conexión a la bd
            //String query="INSERT INTO Jugador(jugador) values('administrador')";
            String query = "SELECT * FROM Jugador where id_jugador=" + id;
            //String query = "CALL buscarRegistro('" + id + "')";
            stm = connection.createStatement();
            rs = stm.executeQuery(query);
            rs.next();
            jugador.setId_jugador(rs.getInt(1));// o se pude hacer jugador.setIdJugador(rs.getInt("idJugador"));
            jugador.setNombre(rs.getString(2));// o se pude hacer jugador.setJugador(rs.getString("jugador"));

            stm.close();
            connection.close();
            return jugador;

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

            return null;
        }

    }

    @Override
    public void actualizarRegistro(Jugador jugadorNuevo, int id) {
        try {
            conexion = new Conexion();//se establecen los valores de la bd
            connection = conexion.getConnection();// se obtiene la conexión a la bd
            String query = "UPDATE Jugador SET nombre='" + jugadorNuevo.getNombre()+ "' WHERE ugador.id_jugador='" + id + "';";
            //String query = "CALL actualizarRegistro('" + jugadorNuevo.getJugador()+"','"+ id+ "')";
            stm = connection.createStatement();
            stm.execute(query);

            connection.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
