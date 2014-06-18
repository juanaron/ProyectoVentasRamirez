
package pe.edu.upeu.proyectoventas.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Categoria {
    private int idc;
    private String cat;

    public Categoria() {
    }

    public Categoria(String cat) {
        this.cat = cat;
    }

    public int getIdc() {
        return idc;
    }

    public void setIdc(int idc) {
        this.idc = idc;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }
 

    public static Categoria loadCategoria(ResultSet rs)throws SQLException{
        Categoria categoria=new Categoria();    
       
            categoria.setIdc(rs.getInt("idCategoria"));
            categoria.setCat(rs.getString("categoria"));
            
        
        return categoria;
    }
}
