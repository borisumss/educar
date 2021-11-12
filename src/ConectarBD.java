
import java.sql.Connection;
import java.sql.DriverManager;

public class ConectarBD {

    public static final String URL = "jdbc:mysql://broxmlmxhcp1au0rycty-mysql.services.clever-cloud.com:3306/broxmlmxhcp1au0rycty";
    public static final String USER = "ug3ik4c1a2nb7o8d";
    public static final String CLAVE = "uAiugnzOXmOkIMjUPgwo";

    public Connection getConexion() {
        Connection con = null;
        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, CLAVE);
            System.out.println("conectado con exito");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }

}
