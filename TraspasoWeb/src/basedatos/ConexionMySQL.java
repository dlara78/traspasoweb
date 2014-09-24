package BaseDatos;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexionMySQL {

    public String db = "empleado";
    public String url = "jdbc:mysql://84.127.225.30/" + db;
    public String user = "usuario";
    public String pass = "012345";
    
    public ConexionMySQL(){
        
    }
    
    public Connection Conectar(){
        
        Connection link = null;
        try
        {
            //Cargamos el Driver MySQL
            Class.forName("org.gjtmm.mysql.Driver");
            //Creamos el enlace hacia la base de datos
            link = DriverManager.getConnection(this.url, this.user, this.pass);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        return link;
    }

}
