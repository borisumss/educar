
import java.sql.Connection;
import java.sql.DriverManager;
public class ConectarBD {


  
    public static final String URL = "jdbc:mysql://bbid848puqylxajofwmn-mysql.services.clever-cloud.com:3306/bbid848puqylxajofwmn";
    public static final String USER = "ubnaz9ilslowrglt";
    public static final String CLAVE = "sQWJXFBLojALuA6NS9f5";
     
    public Connection getConexion(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, CLAVE);
            System.out.println("conectado con exito");
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }


}
