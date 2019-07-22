/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.vistas;

import static java.awt.Color.WHITE;
import java.awt.Component;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JTextField;
import presentacion.factory.FontFactory;
import presentacion.templates.TemplateButton;

/**
 *
 * @author chris
 */
public class PanelRegistrar extends JPanel{
    private JLabel titulo;
    private JLabel lblNombre;
    private JLabel lblApellido;
    private JLabel lblCorreo;
    private JLabel lblContraseña;
    private JLabel lblNTarjeta;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtCorreo;
    private JPasswordField txtContraseña;
    private JPasswordField txtIContraseña;
    private JTextField txtICorreo;
    private JTextField txtTarjeta;
    private TemplateButton btnRegistrar;
    private TemplateButton btnIngresar;
    private TemplateButton btnSalir;
    private JLabel tituloIngresar;
    private JLabel lblICorreo;
    private JLabel lblIContraseña;
    private JLabel lblId;
    private JTextField txtId;

    public PanelRegistrar() {
        titulo = new JLabel();
        lblNombre = new JLabel();
        lblApellido = new JLabel();
        lblCorreo = new JLabel();
        lblContraseña = new JLabel();
        lblNTarjeta = new JLabel();
        txtNombre = new JTextField();
        txtApellido = new JTextField();
        txtCorreo = new JTextField();
        txtContraseña = new JPasswordField();
        txtTarjeta = new JTextField();
        btnRegistrar = new TemplateButton();
        btnIngresar = new TemplateButton();
        btnSalir = new TemplateButton();
        tituloIngresar = new JLabel();
        lblIContraseña = new JLabel();
        lblICorreo = new JLabel();
        txtIContraseña = new JPasswordField();
        txtICorreo = new JTextField();
        txtId = new JTextField();
        lblId = new JLabel();
        
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public JTextField getTxtCorreo() {
        return txtCorreo;
    }

    public JPasswordField getTxtContraseña() {
        return txtContraseña;
    }

    public JPasswordField getTxtIContraseña() {
        
        return txtIContraseña;
        
    }

    public JTextField getTxtICorreo() {
        return txtICorreo;
    }

    public JTextField getTxtTarjeta() {
        return txtTarjeta;
    }
    
    public JTextField getTxtId() {
        return txtId;
    }
    
    
    
    public TemplateButton getBtnSalir(){
        return btnSalir;
    }
     public TemplateButton getBtnRegistrar(){
        return btnRegistrar;
    }
      public TemplateButton getBtnIngresar(){
        return btnIngresar;
    }

    public void init() {
        setProperties();
        setComponentsProperties();
        addComponents();
    }

    public void cambiarEstado(boolean estado) {
        for (Component component : this.getComponents()) {
            component.setVisible(estado);
        }   
    }

    public void addController(ActionListener listener) {
        btnRegistrar.addActionListener(listener);
        btnIngresar.addActionListener(listener);
        btnSalir.addActionListener(listener);
    }

    private void setProperties() {
        setLayout(null);
        setOpaque(false);
        setVisible(false);
        
    }

    private void addComponents() {
        add(titulo);
        add(lblNombre);
        add(lblApellido);
        add(lblCorreo);
        add(lblContraseña);
        add(lblNTarjeta);
        add(txtNombre);
        add(txtApellido);
        add(txtCorreo);
        add(txtContraseña);
        add(txtTarjeta);
        add(btnRegistrar); 
        add(btnIngresar);
        add(btnSalir);
        add(tituloIngresar);
        add(txtIContraseña);
        add(txtICorreo);
        add(lblIContraseña);
        add(lblICorreo);
        add(txtId);
        add(lblId);
        }

    private void setComponentsProperties() {
        setTituloNuevoProperties();
        setTituloIngresarProperties();
        setLblNombreProperties();
        setLblApellidoProperties();
        setLblCorreoProperties();
        setLblContraseñaProperties();
        setLblNTarjetaProperties(); 
        setIContraseñaProperties();
        setICorreoproperties();
        setBtnIngresarProperties();
        setBtnRegistrarProperties();
        setBtnSalir();
        setlblIdProperties();
        
    }



    private void setLblContraseñaProperties() {
        lblContraseña.setBounds(60,350,150,30);
        lblContraseña.setText("Contraseña:");
        lblContraseña.setFont(FontFactory.getFont("fuente1.ttf", 0, 30));
        lblContraseña.setForeground(WHITE);
        txtContraseña.setBounds(220, 350, 180, 30);
        txtContraseña.setFont(FontFactory.getFont("fuente1.ttf", 0, 20));
    }

    private void setLblCorreoProperties() {
        lblCorreo.setBounds(60,290,150,30);
        lblCorreo.setText("Correo:");
        lblCorreo.setFont(FontFactory.getFont("fuente1.ttf", 0, 30));
        lblCorreo.setForeground(WHITE);
        txtCorreo.setBounds(220, 290, 180, 30);
        txtCorreo.setFont(FontFactory.getFont("fuente1.ttf", 0, 20));
    }

    private void setLblApellidoProperties() {
        lblApellido.setBounds(60,230,150,30);
        lblApellido.setText("Apellido:");
        lblApellido.setFont(FontFactory.getFont("fuente1.ttf", 0, 30));
        lblApellido.setForeground(WHITE);
        txtApellido.setBounds(220, 230, 180, 30);
        txtApellido.setFont(FontFactory.getFont("fuente1.ttf", 0, 20));
    }

    private void setLblNombreProperties() {
        lblNombre.setBounds(60,170,150,30);
        lblNombre.setText("Nombre:");
        lblNombre.setFont(FontFactory.getFont("fuente1.ttf", 0, 30));
        lblNombre.setForeground(WHITE);
        txtNombre.setBounds(220, 170, 180, 30);
        txtNombre.setFont(FontFactory.getFont("fuente1.ttf", 0, 20));
    }


    private void setLblNTarjetaProperties() {
        lblNTarjeta.setBounds(60,410,150,30);
        lblNTarjeta.setText("Tarjeta:");
        lblNTarjeta.setFont(FontFactory.getFont("fuente1.ttf", 0, 30));
        lblNTarjeta.setForeground(WHITE);
        txtTarjeta.setBounds(220, 410, 180, 30);
        txtTarjeta.setFont(FontFactory.getFont("fuente1.ttf", 0, 20));
    }
    

    private void setTituloNuevoProperties() {
        titulo.setBounds(100,70,400,60);
        titulo.setText("Nuevo usuario");
        titulo.setFont(FontFactory.getFont("fuente1.ttf", 0, 60));
        titulo.setForeground(WHITE);
        
    }
    private void setTituloIngresarProperties() {
        tituloIngresar.setBounds(560,200,400,60);
        tituloIngresar.setText("Ingresar");
        tituloIngresar.setFont(FontFactory.getFont("fuente1.ttf", 0, 60));
        tituloIngresar.setForeground(WHITE);
    }

    private void setIContraseñaProperties() {
        lblIContraseña.setBounds(500,350,150,30);
        lblIContraseña.setText("Contraseña:");
        lblIContraseña.setFont(FontFactory.getFont("fuente1.ttf", 0, 30));
        lblIContraseña.setForeground(WHITE);
        txtIContraseña.setBounds(660, 350, 180, 30);
        txtIContraseña.setFont(FontFactory.getFont("fuente1.ttf", 0, 20));  
    }

    private void setICorreoproperties() {
        lblICorreo.setBounds(500,310,150,30);
        lblICorreo.setText("Correo:");
        lblICorreo.setFont(FontFactory.getFont("fuente1.ttf", 0, 30));
        lblICorreo.setForeground(WHITE);
        txtICorreo.setBounds(660, 310, 180, 30);
        txtICorreo.setFont(FontFactory.getFont("fuente1.ttf", 0, 20)); 
    }

    private void setBtnIngresarProperties() {
        btnIngresar.setText("Ingresar");
        btnIngresar.setBounds(580, 420, 160, 40);
    }

    private void setBtnRegistrarProperties() {
        btnRegistrar.setText("Registrarse");
        btnRegistrar.setBounds(240, 540, 160, 40);
    }

    private void setBtnSalir() {
        btnSalir.setText("Salir");
        btnSalir.setBounds(60, 540, 120, 40);
    }

    private void setlblIdProperties() {
        lblId.setBounds(60,470,150,30);
        lblId.setText("Id:");
        lblId.setFont(FontFactory.getFont("fuente1.ttf", 0, 30));
        lblId.setForeground(WHITE);
        txtId.setBounds(220, 470, 180, 30);
        txtId.setFont(FontFactory.getFont("fuente1.ttf", 0, 20));
    }
    
    public void limpiar(){
        txtId.setText("");
        txtICorreo.setText("");
        txtIContraseña.setText("");
        txtTarjeta.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtCorreo.setText("");
        txtContraseña.setText("");
    }

    
}
