
package persistencia.usuario;

/**
 *
 * @author chris
 */
public interface UsuarioDAO {
    void crear(UsuarioDTO usuario);    
    UsuarioDTO consultar(int id);
    UsuarioDTO consultar(String correo);
    public int usuarioExiste(int id_usuario);
    void actualizar (UsuarioDTO usuario);
    void eliminar(String id);
    
}
