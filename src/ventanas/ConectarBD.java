package ventanas;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
public class ConectarBD {


  
    public static final String URL = "jdbc:mysql://broxmlmxhcp1au0rycty-mysql.services.clever-cloud.com:3306/broxmlmxhcp1au0rycty";
    public static final String USER = "ug3ik4c1a2nb7o8d";
    public static final String CLAVE = "uAiugnzOXmOkIMjUPgwo";
    Connection con=null;
     
    /*public Connection getConexion(){
        Connection con = null;
        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, CLAVE);
            System.out.println("conectado con exito");
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }*/
    public ConectarBD(){

        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");
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
