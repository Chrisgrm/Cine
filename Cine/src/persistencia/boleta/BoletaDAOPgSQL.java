/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.boleta;

import java.sql.*;

import persistencia.constantes.Constantes;

/**
 *
 * @author chris
 */
public class BoletaDAOPgSQL  implements BoletaDAO{

    @Override
     public void crear(BoletaDTO boleta) {
        try {Connection conection = DriverManager.getConnection(Constantes.URL, Constantes.USER , Constantes.PASSWORD);
            PreparedStatement statement = conection.prepareStatement("INSERT INTO boleta values (?,?,?,?,?,?,?,?)");
            statement.setInt(1, boleta.getNo_referencia());
            statement.setString(2, boleta.getPelicula());            
            statement.setInt(3, boleta.getSala());
            statement.setString(8, boleta.getHora());
            statement.setInt(4, boleta.getId_pelicula());
            statement.setString(5, String.valueOf(boleta.getFila()));
            statement.setInt(6, boleta.getAsiento());
            statement.setInt(7, boleta.getNTarjeta());
            statement.executeUpdate();    
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public BoletaDTO consultar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(BoletaDTO boleta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
