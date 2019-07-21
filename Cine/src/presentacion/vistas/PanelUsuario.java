/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.vistas;

import static java.awt.Color.*;
import java.awt.Component;
import java.awt.event.ActionListener;
import javax.swing.*;
import persistencia.pelicula.*;
import presentacion.factory.FontFactory;
import presentacion.templates.*;


/**
 *
 * @author chris
 */
public class PanelUsuario extends JPanel{
    private JLabel tituloPelicula;
    private TemplateButton btnSiguiente;
    private TemplateButton btnCompra;
    private TemplateButton btnAtras;
    private JLabel descripcion;
    private JLabel imagen;
    private PeliculaDTO pelicula;
    private TemplateButton btnRegistrar;
    private TemplateButton btnIngresar;
   
    
    PanelUsuario (){
        tituloPelicula = new JLabel();
        btnSiguiente= new TemplateButton();
        btnAtras = new TemplateButton();
        btnCompra= new TemplateButton();
        descripcion = new JLabel();
        imagen = new JLabel(); 
        pelicula = new PeliculaDTO();
        btnIngresar = new TemplateButton();
        btnRegistrar = new TemplateButton();
     
    }

    public JLabel getTituloPelicula() {
        return tituloPelicula;
    }

    public JLabel getDescripcion() {
        return descripcion;
    }

    public JLabel getImagen() {
        return imagen;
    }
    

    public TemplateButton getBtnSiguiente() {
        return btnSiguiente;
    }

    public TemplateButton getBtnCompra() {
        return btnCompra;
    }

    public TemplateButton getBtnAtras() {
        return btnAtras;
    }
    public TemplateButton getBtnRegristrar(){
        return btnRegistrar;
    }
     public TemplateButton getBtnIngresar(){
        return btnIngresar;
    }
    
    public void setProperties() {     
        setLayout(null);
        setOpaque(false);
    }
    public void setComponentsProperties(){
        setBtnSiguienteProperties();
        setBtnAtrasProperties();
        setBtnCompraProperties(); 
        setDescripcionProperties();
        setImagenProperties();
        setiTituloProperties();
        setBtnRegistrarProperties();
        setBtnIngresarProperties();
    }
    private void addComponents() {
        add(btnAtras);
        add(btnCompra);
        add(btnSiguiente);
        add(imagen);
        add(descripcion);
        add(tituloPelicula);  
        add(btnIngresar);
        add(btnRegistrar);
    }

    private void setBtnSiguienteProperties() {
        btnSiguiente.setText("Siguiente");
        btnSiguiente.setBounds(280, 250, 170, 70);
    }
    
    private void setBtnAtrasProperties() {
        btnAtras.setText("Atras");
        btnAtras.setBounds(80, 250, 170, 70);  
    }

    private void setBtnCompraProperties() {
        btnCompra.setText("COMPRAR");
        btnCompra.setBounds(80, 170, 370, 70);
    }

    private void setDescripcionProperties() {
         
        descripcion.setBounds(80, 320, 400,270 );
        descripcion.setFont(FontFactory.getFont("fuente1.ttf", 0, 25));
        descripcion.setText("<html>El super asesino John Wick está huyendo luego de matar a un miembro del gremio internacional de asesinos, y con un precio de $ 14 millones en su cabeza, es el objetivo de los hombres y mujeres sicarios de todo el mundo.</html>");
        descripcion.setForeground(WHITE);

    }

    private void setImagenProperties() {
       
        imagen.setBounds(520, 85, 370, 470);
        imagen.setIcon(new ImageIcon("src/recursos/imagenes/jhonWick.jpg"));
    }

    private void setiTituloProperties() {
        tituloPelicula.setBounds(100,70,400,100);
        tituloPelicula.setText("JHON WICK 3");
        tituloPelicula.setFont(FontFactory.getFont("fuente1.ttf", 0, 90));
        tituloPelicula.setForeground(WHITE);
    }


    public void addController(ActionListener listener) {
        btnSiguiente.addActionListener(listener);
        btnAtras.addActionListener(listener);
        btnCompra.addActionListener(listener);
        btnIngresar.addActionListener(listener);
        btnRegistrar.addActionListener(listener);
        
    }
    public void init() {    
        setProperties();
        setComponentsProperties();
        addComponents();
          
    }

    private void setBtnRegistrarProperties() {
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBounds(680, 20, 140, 40);
    }

    private void setBtnIngresarProperties() {
        btnIngresar.setText("Ingresar");
        btnIngresar.setBounds(530, 20, 140, 40);
    }

    private void cambiarEstado(boolean estado) {
        for (Component component : this.getComponents()) {
            component.setVisible(estado);
        }   
    }
    
    
}
