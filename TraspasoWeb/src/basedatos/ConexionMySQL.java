package BaseDatos;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexionMySQL {

    private String servidor;
    private String db;
    public String url;
    private String user;
    private String pass;
    private static Connection con;

    public ConexionMySQL(String server, String dataBase, String usuario, String password) {
        
        this.servidor = server;
        this.db = dataBase;
        this.user = usuario;
        this.pass = password;
        this.url = "jdbc:mysql://" + server + "/" + dataBase;

    }
    
    public Connection Conectar() {

        try {
            Class.forName("com.mysql.jdbc.Driver"); //Cargamos el Driver MySQL
            //Creamos el enlace hacia la base de datos
            con = DriverManager.getConnection(this.url, this.user, this.pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        }

        return con;
    }

    public Connection Conectar(String servidor, String baseDatos, String user, String pass) {

        try {
            Class.forName("com.mysql.jdbc.Driver"); //Cargamos el Driver MySQL
            //Creamos el enlace hacia la base de datos
            con = DriverManager.getConnection(this.url, user, pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        }

        return con;
    }

}
