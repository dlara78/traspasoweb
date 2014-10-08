package BaseDatos;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conector {

    private String servidor;
    private String db;
    private String table;
    private String url;
    private String user;
    private String pass;
    private static Connection con;

    /*
     Esta clase se usa para crear objetos de tipo Conector, que albergarán los parámetros de la conexión.
     Y además disponen de los métodos Conectar() (de tipo Connection) para realizar la conexión a la base de datos MySQL.    
     */
    public Conector(String servidor, String baseDatos, String tabla, String usuario, String password) {

        this.servidor = servidor;
        this.db = baseDatos;
        this.table = tabla;
        this.user = usuario;
        this.pass = password;
        this.url = "jdbc:mysql://" + servidor + "/" + baseDatos + "?zeroDateTimeBehavior=convertToNull";
        //la cadena ?zeroDateTimeBehavior=convertToNull evita el fallo que provocan los años '0000' en la base de datos.
    }

    public Connection Conectar() {
        /*
         Este método carga los drivers sql, recoge los parámetros de conexión
         y devuelve un objeto de tipo Connection para realizar la conexión con la
         base de datos.
         */
        try {
            Class.forName("com.mysql.jdbc.Driver"); //Cargamos el Driver MySQL
            con = DriverManager.getConnection(this.url, this.user, this.pass); //Creamos el enlace.
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        }

        return con; //Creamos el enlace.
    }

//    public Connection Conectar(String servidor, String user, String pass) {
//        /*
//         Este método carga los drivers sql, recoge los parámetros de conexión
//         y devuelve un objeto de tipo Connection para realizar la conexión con la
//         base de datos.
//         */
//        try {
//            Class.forName("com.mysql.jdbc.Driver"); //Cargamos el Driver MySQL
//            //Creamos el enlace hacia la base de datos
//            con = DriverManager.getConnection(servidor, user, pass); //Creamos el enlace.
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Error" + e);
//        }
//
//        return con; //Creamos el enlace.
//    }
}
