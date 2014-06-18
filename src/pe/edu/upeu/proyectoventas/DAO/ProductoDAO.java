

package pe.edu.upeu.proyectoventas.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import pe.edu.upeu.proyectoventas.config.Conexion;
import pe.edu.upeu.proyectoventas.modelo.Categoria;

public class ProductoDAO {
     private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql;
    int op = 0 ;
    public int registrarProducto(int idc,String cate,double pr,int cant){
        sql="INSERT INTO Producto VALUES(null,'"+cate+"','"+pr+"','"+cant+"','"+idc+"')";
        try{
            cx=Conexion.GetConexion();
            st=cx.createStatement();
            op=st.executeUpdate(sql);
            cx.close();
           
            }catch( SQLException | ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "error"+ex);        
        }
        
        return op;
        
    }
    
}
