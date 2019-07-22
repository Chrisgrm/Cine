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
public class TarjetaDTO {
    private int no_tarjeta;
    private String titular;
    private int clave;
    private int saldo;

    public int getNo_tarjeta() {
        return no_tarjeta;
    }

    public void setNo_tarjeta(int no_tarjeta) {
        this.no_tarjeta = no_tarjeta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
    
}
