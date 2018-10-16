/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marce
 */
public class DAO_Nota extends Conexion implements DAO<Nota>{

    public DAO_Nota() throws ClassNotFoundException, SQLException {
        super("ejercicio3BD");
    }

    @Override
    public void create(Nota ob) throws SQLException {
        ejecutar("INSERT INTO nota VALUES (NULL, "+ob.getValor()+");");
        
    }

    @Override
    public List<Nota> read() throws SQLException {
        List<Nota> lista= new ArrayList<>(); 
        
        ResultSet rs= ejecutar("SELECT * FROM nota");
        
        Nota n=null;
        while(rs.next()){
            n=new Nota();
            n.setId(rs.getInt(1));
            n.setValor(rs.getInt(2));
            lista.add(n);
        }
        
        return lista;
    }

    @Override
    public void update(Nota ob) throws SQLException {
        ejecutar("UPDATE SET valor='"+ob.getValor()+"' WHERE id='"+ob.getId()+"'; ");
    }

    @Override
    public void delete(int id) throws SQLException {
        ejecutar("DELETE FROM nota WHERE id='"+id+"'; ");
        }
    
    
    public int getCantNotas() throws SQLException{
        int cant=0;
        
        ResultSet rs=ejecutar("SELECT COUNT(*) FROM nota;");
        
        if(rs.next()){
            cant=rs.getInt(1);
        }
        
        return cant;
    }
    
    
    
    
    
}
