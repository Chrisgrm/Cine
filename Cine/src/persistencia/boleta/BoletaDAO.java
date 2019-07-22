/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.boleta;



/**
 *
 * @author chris
 */
public interface BoletaDAO {
    void crear(BoletaDTO boleta);    
    BoletaDTO consultar(int id);
    void actualizar (BoletaDTO boleta);
    void eliminar(String id);   

    
}
