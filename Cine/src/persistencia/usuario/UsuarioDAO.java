
package persistencia.usuario;

/**
 *
 * @author chris
 */
public interface UsuarioDAO {
    void Crear(UsuarioDTO usuario);    
    UsuarioDTO consultar(int id);
    public int usuarioExiste(int id_usuario);
    void actualizar (UsuarioDTO usuario);
    void eliminar(String id);
    
}
