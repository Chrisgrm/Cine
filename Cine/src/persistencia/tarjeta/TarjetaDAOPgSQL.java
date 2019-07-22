/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.tarjeta;

import java.sql.*;
import persistencia.constantes.Constantes;

/**
 *
 * @author chris
 */
public class TarjetaDAOPgSQL implements TarjetaDAO{



    public TarjetaDTO consultar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void actualizarSaldo(int n_tarjeta) {
        TarjetaDTO tarjeta = new TarjetaDTO();
        try (Connection connection = DriverManager.getConnection(Constantes.URL, Constantes.USER, Constantes.PASSWORD)) {
          
            PreparedStatement statement = connection.prepareStatement("UPDATE tarjeta SET saldo = ? WHERE no_tarjeta = ?");
            statement.setInt(1, tarjeta.getSaldo());
            statement.setInt(2, n_tarjeta);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

 



}
