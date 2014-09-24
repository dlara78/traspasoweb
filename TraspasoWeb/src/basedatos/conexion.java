package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexion {

    private static String db = "java";
    private static String user = "java";
    private static String pass = "012345";
    private static String url = "jdbc:mysql://localhost/" + db;
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
