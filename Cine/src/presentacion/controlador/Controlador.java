/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import persistencia.boleta.BoletaDTO;
import persistencia.pelicula.PeliculaDTO;
import persistencia.usuario.UsuarioDTO;
import presentacion.modelo.Modelo;
import presentacion.vistas.PanelCompra;
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
    private PanelCompra panelCompra;
    private Modelo modelo;
    private int siguiente;
    private int anterior;
    private int sesionActiva;
    private int id_pelicula;
    private Random rand;
    private int n;
    
    
    public Controlador(){
        modelo = new Modelo();
        siguiente = 2;
        anterior=modelo.getCantidadPeliculas();
        sesionActiva= 1;
        id_pelicula = 1;
        rand = new Random();
        
    }
    public int random (){
        n =  rand.nextInt(100000);
        return n ;
    }
    public int getN(){
        return n;
    }
    public void setPanelPrincipal(PanelPrincipal panelPrincipal) {
        this.panelPrincipal = panelPrincipal;
        panelUsuario = this.panelPrincipal.getPanelUsuario();
        panelRegistrar = this.panelPrincipal.getPanelRegistrar();
        panelCompra = this.panelPrincipal.getPanelCompra();
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
    public void cambiarBoleta(JLabel label, String text){
        label.setText(label.getText() + "           "+ text);
    }


    @Override
   
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==panelUsuario.getBtnSiguiente()){
            PeliculaDTO pelicula = modelo.obtenerPeliculaSiguiente(siguiente);
            cambiarTexto(panelUsuario.getTituloPelicula() , String.valueOf(pelicula.getTitulo()));
            cambiarImagen(panelUsuario.getImagen(), String.valueOf(pelicula.getImagen()));
            cambiarSinopsis(panelUsuario.getDescripcion(), String.valueOf(pelicula.getSinopsis()));
            if (siguiente == modelo.getCantidadPeliculas()){
                siguiente=1; 
                
            }else
                siguiente++;
            if(id_pelicula == modelo.getCantidadPeliculas() ){
                id_pelicula = 1;
            }else 
                id_pelicula++;
          
           
        }
        if (e.getSource()==panelUsuario.getBtnAtras()){
            PeliculaDTO pelicula = modelo.obtenerPeliculaSiguiente(anterior);
            cambiarTexto(panelUsuario.getTituloPelicula() , String.valueOf(pelicula.getTitulo()));
            cambiarImagen(panelUsuario.getImagen(), String.valueOf(pelicula.getImagen()));
            cambiarSinopsis(panelUsuario.getDescripcion(), String.valueOf(pelicula.getSinopsis()));
            
            if (anterior ==1){
                anterior=modelo.getCantidadPeliculas();
                
            }else
                anterior--;
            if (id_pelicula == 1){
                id_pelicula = modelo.getCantidadPeliculas();
            }else
                id_pelicula--;
            
        }
        if (e.getSource()== panelUsuario.getBtnCompra()){
            UsuarioDTO usuario = modelo.sesionExiste(sesionActiva);
            if(usuario.getId() == 0 ){                
                JOptionPane.showMessageDialog(panelUsuario, "No esta loggeado");                
             }else{
                PeliculaDTO pelicula = modelo.obtenerPeliculaSiguiente(id_pelicula);

                panelUsuario.setVisible(false);
                panelCompra.setVisible(true);
                cambiarBoleta(panelCompra.getLblPelicula(), String.valueOf(pelicula.getTitulo()));
                cambiarBoleta(panelCompra.getLblNumeroRef(), String.valueOf("    "+random()) );
                
            }
        }
        if (e.getSource() == panelUsuario.getBtnRegristrar()){
            panelRegistrar.setVisible(true);
            panelUsuario.setVisible(false);
            
        }
        if (e.getSource() == panelRegistrar.getBtnSalir()){
            panelRegistrar.setVisible(false);
            panelUsuario.setVisible(true);
            panelRegistrar.limpiar();
        }
        if (e.getSource() == panelRegistrar.getBtnIngresar()){
            UsuarioDTO usuario = modelo.correoExiste(panelRegistrar.getTxtICorreo().getText());
            if (usuario.getCorreo() == null){
                JOptionPane.showMessageDialog(panelRegistrar, "No existe el correo especificado");
            }else if(!(usuario.getContraseña().equalsIgnoreCase(String.valueOf(panelRegistrar.getTxtIContraseña().getPassword())))){
                JOptionPane.showMessageDialog(panelRegistrar, "contraseña Incorrecta");
         
            }
            else{
                panelRegistrar.setVisible(false);
                panelUsuario.setVisible(true);
                sesionActiva = usuario.getId();    
                panelRegistrar.limpiar();
            }
        }
        if (e.getSource() == panelRegistrar.getBtnRegistrar()){
            crearUsuario();
            JOptionPane.showMessageDialog(panelRegistrar, "Usuario Registrado");
            panelRegistrar.limpiar();
        }
        if (e.getSource() == panelCompra.getBtnAtras()){
            panelCompra.setVisible(false);
            panelUsuario.setVisible(true);
            panelCompra.limpiar();
        }
        if (e.getSource() == panelCompra.getBtnComprar()){
            int sala = 0;
            panelCompra.limpiar();
            if (String.valueOf(panelCompra.getSelectHora().getSelectedItem()).equalsIgnoreCase("14:00")){                
                sala = 1;
                try {
                    crearBoleta(sala);
                } catch (ParseException ex) {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(panelCompra, "Compra realizada, su sala es la numero 1");
            }else{
                sala =2;
                JOptionPane.showMessageDialog(panelCompra, "Compra realizada, su sala es la numero 2");
                try {
                    crearBoleta(sala);
                } catch (ParseException ex) {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                }
   
            } 
            panelCompra.setVisible(false);
            panelUsuario.setVisible(true);
        }
        
    }

    private void crearUsuario() {
        UsuarioDTO usuario = new UsuarioDTO();
        usuario.setId(Integer.parseInt(panelRegistrar.getTxtId().getText()));
        usuario.setNombre(panelRegistrar.getTxtNombre().getText());
        usuario.setApellido(panelRegistrar.getTxtApellido().getText());
        usuario.setCorreo(panelRegistrar.getTxtCorreo().getText());
        usuario.setContraseña(panelRegistrar.getTxtContraseña().getText());
        usuario.setTarjeta(Integer.parseInt(panelRegistrar.getTxtTarjeta().getText()));
        modelo.crearUsuario(usuario);
    }

    private void crearBoleta(int sala) throws ParseException {
      

    
 
        BoletaDTO boleta = new BoletaDTO();
        boleta.setNo_referencia(getN());
        System.out.println(getN());
        boleta.setPelicula(panelCompra.getLblPelicula().getText());
        boleta.setHora((Date) panelCompra.getSelectHora().getSelectedItem());
        boleta.setSala(sala);
        boleta.setId_pelicula(id_pelicula);
        boleta.setFila((char)panelCompra.getSelectFila().getSelectedItem());
        boleta.setAsiento( (int) panelCompra.getSelectAsiento().getSelectedItem());
        modelo.crearBoleta(boleta);
    }


}