/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.pelicula;

import persistencia.usuario.UsuarioDTO;

/**
 *
 * @author chris
 */
public interface PeliculaDAO {
    void Crear(PeliculaDTO pelicula);    
    PeliculaDTO consultar(int id);
    void actualizar (PeliculaDTO pelicula);
    void eliminar(String id);    
}
