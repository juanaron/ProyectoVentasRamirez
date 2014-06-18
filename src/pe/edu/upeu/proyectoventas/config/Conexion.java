

package pe.edu.upeu.proyectoventas.config;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexion {
    public static Connection GetConexion() throws ClassNotFoundException, SQLException{
        Connection conex=null;
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost/bd_ventas";
        String usuario="root";
        String pass ="root";
        conex =(Connection) DriverManager.getConnection(url,usuario,pass);
    
    return conex;
    }
}

//    Connection cx;
//    public static Connection getConexion(){
//        Connection cx=null;
//        String url="jdbc:mysql://localhost/bd_ventas";
//        String usuario="root";
//        String pass="root";
//        try{
//            Class.forName("com.mysql.jdbc.driver");
//            cx = DriverManager.getConnection(url,usuario,pass);
//        }
//        catch(ClassNotFoundException|SQLException e){
//            JOptionPane.showMessageDialog(null,"error"+e);
//        }
//               
//        return cx;        
//    }
    