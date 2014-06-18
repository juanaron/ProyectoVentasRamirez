
package pe.edu.upeu.proyectoventas.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import pe.edu.upeu.proyectoventas.config.Conexion;
import pe.edu.upeu.proyectoventas.modelo.Categoria;


public class CategoriaDAO {
    private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql;
    private int id ;
//    Categoria cd=new Categoria();
            
    public ArrayList<Categoria>listarCategoria(){
        ArrayList<Categoria> lista=new ArrayList();
      
        sql="SELECT * From Categoria";
        try{
            cx=Conexion.GetConexion();
            st=cx.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                lista.add(Categoria.loadCategoria(rs));
            }
            
            }catch( SQLException | ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "error"+ex);        
        }
        
        return lista;
        
    }
    public int devolverIdCategoria(String cat){
        sql="SELECT * From Categoria WHERE categoria = '"+cat+"'";
        try{
            cx=Conexion.GetConexion();
            st=cx.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                id = rs.getInt("idCategoria");
            }
            cx.close();
            }catch( SQLException | ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "error"+ex);        
        }
        
        return id ;
    }
         
}
