package ventanas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
public class ConectarBD {


  
    public static final String URL = "jdbc:mysql://bbid848puqylxajofwmn-mysql.services.clever-cloud.com:3306/bbid848puqylxajofwmn";
    public static final String USER = "ubnaz9ilslowrglt";
    public static final String CLAVE = "sQWJXFBLojALuA6NS9f5";
    Connection con=null;
    public ConectarBD(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, CLAVE);
            System.out.println("conectado con exito");
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public int ejecutarSentenciaSQL(String strSentenciaSQL){
        try {
            PreparedStatement pstm= con.prepareStatement(strSentenciaSQL);
            pstm.execute();
            return 1;
        
        } catch(SQLException e){
        System.out.println(e);
            return 0;
        }
    }
    
    public ResultSet consultarRegistro(String strSentenciaSQL){
    
        try{
        
            PreparedStatement pstm= con.prepareStatement(strSentenciaSQL);
            ResultSet respuesta = pstm.executeQuery();
            return respuesta;
            
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }



}
