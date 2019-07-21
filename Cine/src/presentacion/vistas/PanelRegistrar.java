/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.vistas;

import java.awt.Component;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
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
    private JTextField txtContraseña;
    private JTextField txtTarjeta;
    private TemplateButton btnSiguiente;

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
        txtContraseña = new JTextField();
        txtTarjeta = new JTextField();
        btnSiguiente = new TemplateButton();                
    }

    void init() {
        setProperties();
        setComponentsProperties();
        addComponents();       
        setVisible(false);
    }

    void cambiarEstado(boolean estado) {
        for (Component component : this.getComponents()) {
            component.setVisible(estado);
        }   
    }

    void addController(ActionListener listener) {
        btnSiguiente.addActionListener(listener);
    }

    private void setProperties() {
        setLayout(null);
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
        add(btnSiguiente);     
        
        
        }

    private void setComponentsProperties() {
//        setTituloProerties();
//        setLblNombreProperties();
//        setLblApellidoProperties();
//        setLblCorreoProperties();
//        setLblContraseñaProperties();
//        setLblNTarjetaProperties(); 
//        setTxtNombreProperties();
//        setTxtApellidoProperties();
//        setTxtCorreoProperties();
//        setTxtContraseñaProperties();
//        setTxtTarjetaProperties();
//        setTxtCorreoProperties();
//        setBtnSiguienteProperties();
        
        
        
    }

//    private void setBtnSiguienteProperties() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void setTxtCorreoProperties() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void setTxtTarjetaProperties() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void setTxtContraseñaProperties() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void setTxtApellidoProperties() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void setTxtNombreProperties() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void setLblContraseñaProperties() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void setLblCorreoProperties() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void setLblApellidoProperties() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void setLblNombreProperties() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void setTituloProerties() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void setLblNTarjetaProperties() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
    
}
