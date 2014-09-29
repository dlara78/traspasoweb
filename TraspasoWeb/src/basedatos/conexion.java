package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexion {

    static Connection conn;

    public static Connection getConnection(String servidor, String baseDatos, String usuario, String password) {

        String url = "jdbc:mysql://" + servidor + "/" + baseDatos;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, usuario, password);
            JOptionPane.showMessageDialog(null, "Conexión establecida");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error (david)" + e);
        }
        return conn;
    }

}
