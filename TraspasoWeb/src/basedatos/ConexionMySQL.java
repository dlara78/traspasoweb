package BaseDatos;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexionMySQL {

    public String db = "empleado";
    public String url = "jdbc:mysql://192.168.100.1/" + db;
    public String user = "javauser";
    public String pass = "Dlr012345";
    private static Connection con;

    public ConexionMySQL() {

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

}
