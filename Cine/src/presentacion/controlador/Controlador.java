/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import persistencia.pelicula.PeliculaDTO;
import persistencia.usuario.UsuarioDTO;
import presentacion.modelo.Modelo;
import presentacion.vistas.PanelPrincipal;
import presentacion.vistas.PanelRegistrar;
import presentacion.vistas.PanelUsuario;

/**
 *
 * @author chris
 */
public class Controlador implements ActionListener{
    private PanelUsuario panelUsuario;
    private PanelPrincipal panelPrincipal;
    private PanelRegistrar panelRegistrar;
    private Modelo modelo;
    private int siguiente;
    private int anterior;
    private int sesionActiva;
    
    public Controlador(){
        modelo = new Modelo();
        siguiente = 2;
        anterior=1;
        sesionActiva= 0;
    }
    public void setPanelPrincipal(PanelPrincipal panelPrincipal) {
        this.panelPrincipal = panelPrincipal;
        panelUsuario = this.panelPrincipal.getPanelUsuario();
        panelRegistrar = this.panelPrincipal.getPanelRegistrar();
    }
    public void cambiarTexto(JLabel label, String text){
        label.setText(text);        
    }
    public void cambiarImagen(JLabel label , String text){
        label.setIcon(new ImageIcon(text));
    }
    public void cambiarSinopsis(JLabel label, String text){
        label.setText("<html>"+text+"</html>");
    }

    public void startListening() {
        panelPrincipal.addController(this);        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==panelUsuario.getBtnSiguiente()){
            PeliculaDTO pelicula = modelo.obtenerPeliculaSiguiente(siguiente);
            cambiarTexto(panelUsuario.getTituloPelicula() , String.valueOf(pelicula.getTitulo()));
            cambiarImagen(panelUsuario.getImagen(), String.valueOf(pelicula.getImagen()));
            cambiarSinopsis(panelUsuario.getDescripcion(), String.valueOf(pelicula.getSinopsis()));
            if (siguiente ==2){
                siguiente=1; 
            }else
                siguiente++;
           
        }
        if (e.getSource()==panelUsuario.getBtnAtras()){
            PeliculaDTO pelicula = modelo.obtenerPeliculaSiguiente(anterior);
            cambiarTexto(panelUsuario.getTituloPelicula() , String.valueOf(pelicula.getTitulo()));
            cambiarImagen(panelUsuario.getImagen(), String.valueOf(pelicula.getImagen()));
            cambiarSinopsis(panelUsuario.getDescripcion(), String.valueOf(pelicula.getSinopsis()));
            if (anterior ==1){
                anterior=2;
            }else
                anterior--;
            System.out.println(anterior);
        }
        if (e.getSource()== panelUsuario.getBtnCompra()){
            UsuarioDTO usuario = modelo.sesionExiste(sesionActiva);
            if(usuario.getId() == 0 ){                
                JOptionPane.showMessageDialog(panelUsuario, "No esta loggeado");                
             }else{
                
            }
         if (e.getSource() == panelUsuario.getBtnRegristrar()){
             
         }
                
            
        }
    }
    
}
