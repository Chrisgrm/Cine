/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.modelo;

import persistencia.boleta.BoletaDAO;
import persistencia.boleta.BoletaDAOPgSQL;
import persistencia.boleta.BoletaDTO;
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
    private UsuarioDAO usuarioDAO;
    private int cantidadPeliculas;
    private BoletaDAO boletaDAO;
    
  
    
    public Modelo(){
        usuarioDAO = new UsuarioDAOPgSQL();
        boletaDAO = (BoletaDAO) new BoletaDAOPgSQL();
        PeliculaDAO DAO = new PeliculaDAOPgSQL();
        cantidadPeliculas=DAO.cantidadPeliculas();
        
    }
    public int getCantidadPeliculas(){        
        return cantidadPeliculas;
    }
    public void crearUsuario(UsuarioDTO usuario){
        usuarioDAO.crear(usuario);
    }
    public void crearBoleta(BoletaDTO boleta) {
        boletaDAO.crear(boleta);
    }
    
    public PeliculaDTO obtenerPeliculaSiguiente(int pelicula){        
        PeliculaDAO DAO = new PeliculaDAOPgSQL();        
        return DAO.consultar(pelicula);        
    }
    public UsuarioDTO sesionExiste(int id_usuario){
        UsuarioDAO uDAO = new UsuarioDAOPgSQL();
        return uDAO.consultar(id_usuario);         
    }
    public UsuarioDTO correoExiste (String correo){
        UsuarioDAO uDAO = new UsuarioDAOPgSQL();
        return uDAO.consultar(correo);
    } 

  

    
}
