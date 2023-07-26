
package controller;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    private static final String  driver="con.mysql.jdbc.Driver";
    private static final String  user="root";
    private static final String  pass="";
    private static final String  url="jdbc:mysqul://localhost:8080//estudiante";
    
    
    Connection conectar=null;
    
    
    public Connection conexion(){
        try{
            Class.forName(driver);
            conectar=(Connection) DriverManager.getConnection("url,user,pass");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "error de conexion"+e.getMessage());
        }
        return conectar;
    }
     
}
