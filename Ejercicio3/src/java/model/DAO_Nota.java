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
public class DAO_Nota extends Conexion implements DAO<Nota> {

    public DAO_Nota() throws ClassNotFoundException, SQLException {
        super("ejercicio3BD");
    }

    @Override
    public void create(Nota ob) throws SQLException {
        ejecutar("INSERT INTO nota VALUES (NULL, " + ob.getValor() + ");");

    }

    @Override
    public List<Nota> read() throws SQLException {
        List<Nota> lista = new ArrayList<>();

        ResultSet rs = ejecutar("SELECT * FROM nota");

        Nota n = null;
        while (rs.next()) {
            n = new Nota();
            n.setId(rs.getInt(1));
            n.setValor(rs.getInt(2));
            lista.add(n);
        }

        return lista;
    }

    @Override
    public void update(Nota ob) throws SQLException {
        ejecutar("UPDATE SET valor='" + ob.getValor() + "' WHERE id='" + ob.getId() + "'; ");
    }

    @Override
    public void delete(int id) throws SQLException {
        ejecutar("DELETE FROM nota WHERE id='" + id + "'; ");
    }

    public int getCantNotas() throws SQLException {
        int cant = 0;

        ResultSet rs = ejecutar("SELECT COUNT(*) FROM nota;");

        if (rs.next()) {
            cant = rs.getInt(1);
        }

        return cant;
    }

    public int getCantRojos() throws SQLException {
        int cant = 0;

        ResultSet rs = ejecutar("SELECT COUNT(*) FROM nota WHERE valor<40;");

        if (rs.next()) {
            cant = rs.getInt(1);
        }

        return cant;
    }

    public int getCantAzules() throws SQLException {
        int cant = 0;

        ResultSet rs = ejecutar("SELECT COUNT(*) FROM nota WHERE valor>=40;");

        if (rs.next()) {
            cant = rs.getInt(1);
        }

        return cant;
    }

    public int getCantSietes() throws SQLException {
        int cant = 0;

        ResultSet rs = ejecutar("SELECT COUNT(*) FROM nota WHERE valor=70;");

        if (rs.next()) {
            cant = rs.getInt(1);
        }

        return cant;
    }

    public int getNotaMasAlta() throws SQLException {
        int cant = 0;

        ResultSet rs = ejecutar("SELECT MAX(valor) FROM nota;");

        if (rs.next()) {
            cant = rs.getInt(1);
        }

        return cant;
    }

    public int getNotaMasBaja() throws SQLException {
        int cant = 0;

        ResultSet rs = ejecutar("SELECT MIN(valor) FROM nota;");

        if (rs.next()) {
            cant = rs.getInt(1);
        }

        return cant;
    }

    public double getPorcRojos() throws SQLException {
        double porc = 0;

        int cantN=getCantNotas();
        int cantR=getCantRojos();
        porc=((double)cantR/(double)cantN)*100;


        return porc;
    }
    
        public double getPorcAzules() throws SQLException {
        double porc = 0;

        int cantN=getCantNotas();
        int cantA=getCantAzules();
        porc=((double)cantA/(double)cantN)*100;


        return porc;
    }
        
        public int getPromedioDeNotas() throws SQLException{
            int cant=0;
            
            ResultSet rs=ejecutar("SELECT AVG(valor) FROM nota;");
            
            if(rs.next()){
                cant=rs.getInt(1);
            }
            return cant;
            
            
        }

}
