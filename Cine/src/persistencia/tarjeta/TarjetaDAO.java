/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.tarjeta;

/**
 *
 * @author chris
 */
public interface TarjetaDAO {   
    TarjetaDTO consultar(int id);
    void actualizarSaldo(int n_tarjeta);
    
  
    
}
