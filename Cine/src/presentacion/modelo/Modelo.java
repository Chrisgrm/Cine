/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.modelo;

import persistencia.pelicula.PeliculaDAO;
import persistencia.pelicula.PeliculaDAOPgSQL;
import persistencia.pelicula.PeliculaDTO;
import persistencia.usuario.UsuarioDAO;
import persistencia.usuario.UsuarioDAOPgSQL;
import persistencia.usuario.UsuarioDTO;

/**
 *
 * @author chris
 */
public class Modelo {
  
    
    public Modelo(){
        
    }
    
    public PeliculaDTO obtenerPeliculaSiguiente(int pelicula){        
        PeliculaDAO DAO = new PeliculaDAOPgSQL();  
        return DAO.consultar(pelicula);
        
    }
    public UsuarioDTO sesionExiste(int id_usuario){
        UsuarioDAO uDAO = new UsuarioDAOPgSQL();
        return uDAO.consultar(id_usuario); 
        
    }

    
}
