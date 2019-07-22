/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.pelicula;

import java.sql.*;
import persistencia.constantes.Constantes;

/**
 *
 * @author chris
 */
public class PeliculaDAOPgSQL implements PeliculaDAO{

    @Override
     public void Crear(PeliculaDTO pelicula) {
        try {Connection conection = DriverManager.getConnection(Constantes.URL, Constantes.USER , Constantes.PASSWORD);
            PreparedStatement statement = conection.prepareStatement("INSERT INTO pelicula values (?,?,?,?,?,?,?)");
            statement.setString(1, pelicula.getTitulo());
            statement.setString(2, pelicula.getClasificacion());
            statement.setDate(3, (Date) pelicula.getFechasEstreno());
            statement.setString(4, pelicula.getSinopsis());
            statement.setString(5, pelicula.getGenero());
            statement.setInt(6, pelicula.getDuracion());
            statement.setString(7, pelicula.getProtagonista());
            statement.executeUpdate();    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public PeliculaDTO consultar(int id) {
        PeliculaDTO  pelicula = new PeliculaDTO();
        try (Connection connection = DriverManager.getConnection(Constantes.URL, Constantes.USER, Constantes.PASSWORD)) {
            PreparedStatement statement = connection.prepareStatement("SELECT* FROM pelicula WHERE id_pelicula = ?");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                pelicula.setTitulo(rs.getString("titulo"));
                pelicula.setClasificacion(rs.getString("clasificacion"));
                pelicula.setFechasEstreno(rs.getDate("fecha_estreno"));
                pelicula.setSinopsis(rs.getString("sinopsis"));
                pelicula.setGenero(rs.getString("genero"));
                pelicula.setDuracion(rs.getInt("duracion"));
                pelicula.setProtagonista(rs.getString("protagonista"));
                pelicula.setImagen(rs.getString("imagen"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pelicula;
    }
    
    public int cantidadPeliculas(){
        int count = 0;
        try (Connection connection = DriverManager.getConnection(Constantes.URL, Constantes.USER, Constantes.PASSWORD)) {
            PreparedStatement statement = connection.prepareStatement("SELECT COUNT (*) FROM pelicula");
            
            ResultSet rs = statement.executeQuery();
             while(rs.next()){
                count = rs.getInt("count");
            }
         
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return count;
        
        
    }
        
    

    @Override
    public void actualizar(PeliculaDTO pelicula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
