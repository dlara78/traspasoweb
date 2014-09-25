package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexion {

    private static String server = "192.168.100.1";
    private static String db = "javatransfer";
    private static String user = "javauser";
    private static String pass = "957104";
    private static String url = "jdbc:mysql://" + server + "/" + db;
    private static Connection conn;

    public static Connection getConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null, "Conexión establecida");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error (david)" + e);
        }
        return conn;
    }

}
