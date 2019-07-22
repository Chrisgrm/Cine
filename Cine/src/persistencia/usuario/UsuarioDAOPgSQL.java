/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.usuario;

import java.sql.*;
import persistencia.constantes.Constantes;

/**
 *
 * @author chris
 */
public class UsuarioDAOPgSQL implements UsuarioDAO{

    @Override
    public void crear(UsuarioDTO usuario) {
        try {Connection conection = DriverManager.getConnection(Constantes.URL, Constantes.USER , Constantes.PASSWORD);
            PreparedStatement statement = conection.prepareStatement("INSERT INTO usuario values (?,?,?,?,?,?)");
            statement.setInt(1, usuario.getId());
            statement.setString(2, usuario.getNombre());
            statement.setString(3, usuario.getApellido());
            statement.setString(4, usuario.getCorreo());
            statement.setString(5, usuario.getContraseña());
            statement.setInt(6, usuario.getTarjeta());  
            statement.executeUpdate();            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public UsuarioDTO consultar(int id) {
        UsuarioDTO usuario = new UsuarioDTO();
		try (Connection conection = DriverManager.getConnection(Constantes.URL, Constantes.USER , Constantes.PASSWORD)){
                    PreparedStatement statement = conection.prepareStatement("SELECT* FROM usuario WHERE id_usuario = ?");
                    statement.setInt(1, id);	
                    ResultSet rs = statement.executeQuery();
                    if (rs.next()) {
                        usuario.setId(rs.getInt("id_usuario"));
                        usuario.setNombre(rs.getString("nombre"));
                        usuario.setApellido(rs.getString("apellido"));
                        usuario.setCorreo(rs.getString("correo"));
                        usuario.setContraseña(rs.getString("contraseña"));
                        usuario.setTarjeta(rs.getInt("no_tarjeta"));
                    }
		} catch (SQLException e) {
                    e.printStackTrace();
		} 
		return usuario;   
    }
        public UsuarioDTO consultar(String correo) {
        UsuarioDTO usuario = new UsuarioDTO();
		try (Connection conection = DriverManager.getConnection(Constantes.URL, Constantes.USER , Constantes.PASSWORD)){
                    PreparedStatement statement = conection.prepareStatement("SELECT* FROM usuario WHERE correo = ?");
                    statement.setString(1, correo);	
                    ResultSet rs = statement.executeQuery();
                    if (rs.next()) {
                        usuario.setId(rs.getInt("id_usuario"));
                        usuario.setNombre(rs.getString("nombre"));
                        usuario.setApellido(rs.getString("apellido"));
                        usuario.setCorreo(rs.getString("correo"));
                        usuario.setContraseña(rs.getString("contraseña"));
                        usuario.setTarjeta(rs.getInt("no_tarjeta"));
                    }
		} catch (SQLException e) {
                    e.printStackTrace();
		} 
		return usuario;   
    }

    public void actualizar(UsuarioDTO usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void eliminar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    @Override
    public int usuarioExiste(int id_usuario) {
        return consultar(id_usuario).getId();        
    }
    
}
