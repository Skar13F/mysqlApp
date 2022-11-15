package bd;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Conexion {

    private String driver;
    private String user;
    private String pwd;
    private String url;
    private String ip;
    private String puerto;
    private String db;

    private Connection connection;

    public Conexion() {
        this.driver = "com.mysql.cj.jdbc.Driver";
        this.user = "root";
        this.pwd = "root123";
        this.url = "jdbc:mysql://";
        this.ip = "localhost";//172.0.0.1
        this.puerto = "3306";
        this.db = "Juego";
    }

    public Connection getConnection() throws ClassNotFoundException {
        try {
            Class.forName(this.driver);
            connection = DriverManager.getConnection(this.url
                    + this.ip + ":" + this.puerto + "/" + this.db, this.user, this.pwd);
            //System.out.println(this.url
            //        + this.ip + ":" + this.puerto + "/" + this.db+ this.user+ this.pwd);
            //System.out.println("Conexión exitosa");
            return connection;
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
        return null;
    }

}
