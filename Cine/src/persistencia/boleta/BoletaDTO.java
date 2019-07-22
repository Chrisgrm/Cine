/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.boleta;

import java.sql.Time;
import java.util.Date;



/**
 *
 * @author chris
 */
public class BoletaDTO {
    private int no_referencia;
    private String pelicula;
    private String hora;
    private int sala;
    private int id_pelicula;
    private String fila;
    private int asiento;
    private int nTarjeta;
    public int getNTarjeta() {
        return nTarjeta;
    }

    public void setNTarjeta(int nTarjeta) {
        this.nTarjeta = nTarjeta;
    }

    public int getNo_referencia() {
        return no_referencia;
    }

    public void setNo_referencia(int no_referencia) {
        this.no_referencia = no_referencia;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public int getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }
    
    
}
