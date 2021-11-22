package funciones;

import ventanas.ConectarBD;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class GuardarArchivo {
    FileInputStream archivo = null;
    Connection con;
    String subirArchivo = "INSERT INTO TRABAJO_INDIVIDUAL VALUES (null,?,?,?)";
    int[] codigos = new int[2];
    String buscarEstudianteMatriculado = "SELECT M.COD_MATERIA, E.COD_ESTUDIANTE FROM MATERIA M, ESTUDIANTE E,ESTUDIANTE_MATRICULADO EM WHERE E.COD_ESTUDIANTE=EM.COD_ESTUDIANTE AND M.COD_MATERIA=EM.COD_MATERIA AND E.NOMBRE=? AND E.COD_SIS=? AND M.NOMBRE_MATERIA=? AND M.GRUPO=?";

    public void guardarArchivo(File archivoSeleccionado,String nombreMateria,int grupo,String nombreEstudiante,int codSis){
        con = new ConectarBD().getConnection();
        consultaEstudiante(nombreEstudiante,codSis,nombreMateria,grupo);
        if(codigos[0] != 0 && codigos[1] != 0){
            if (archivoSeleccionado != null){
                if(archivoSeleccionado.getName().contains(".pdf") || archivoSeleccionado.getName().contains(".zip") || archivoSeleccionado.getName().contains(".docx")){
                    if((((float)archivoSeleccionado.length()/1024)/1024) <= 50.0f){
                        try {
                            archivo = new FileInputStream(archivoSeleccionado);
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
                        try{
                            PreparedStatement subirTrabajo = con.prepareStatement(subirArchivo);
                            subirTrabajo.setInt(1, codigos[0]);
                            subirTrabajo.setInt(2, codigos[1]);
                            subirTrabajo.setBinaryStream(3, archivo);
                            subirTrabajo.executeUpdate();
                            subirTrabajo.close();
                        }catch(SQLException e){
                            System.out.println(e);
                        }
                    }
                }
            }
        }
    }

    public void consultaEstudiante(String nombreEstudiante,int codSis,String nombreMateria,int grupo){
        try{
            PreparedStatement consulta = con.prepareStatement(buscarEstudianteMatriculado);
            consulta.setString(1, nombreEstudiante);
            consulta.setInt(2, codSis);
            consulta.setString(3, nombreMateria);
            consulta.setInt(4, grupo);
            ResultSet registroObtenido = consulta.executeQuery();
            if(registroObtenido != null){
                codigos[0] = registroObtenido.getInt(1);
                codigos[1] =registroObtenido.getInt(2);
            }else{
                codigos[0] = 0;
                codigos[1] = 0;
            }
            registroObtenido.close();
            consulta.close();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
