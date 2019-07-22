/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.vistas;

import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import presentacion.templates.PanelWithBackground;

/**
 *
 * @author chris
 */
public class PanelPrincipal extends PanelWithBackground {
    private PanelRegistrar panelRegistar;
    private PanelUsuario panelUsuario;
    private PanelCompra panelCompra;
    
    public PanelPrincipal(){
        panelRegistar = new PanelRegistrar();
        panelUsuario = new PanelUsuario();
        panelCompra = new PanelCompra();
    }
    public PanelUsuario getPanelUsuario(){
        return panelUsuario;
    }
    public PanelRegistrar getPanelRegistrar(){
        return panelRegistar;
    }
    public PanelCompra getPanelCompra(){
        return panelCompra;
    }
    
    public void setProperties(){
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));  
    }
    public void addComponents(){
        add(panelRegistar);
        add(panelUsuario);
        add(panelCompra);
    }
    
    public void init(){
        panelRegistar.init();
        panelUsuario.init();
        panelCompra.init();
        setProperties();
        addComponents();
        setBackground("src/recursos/imagenes/fondo.jpg");
    }

    public void addController (ActionListener listener){
        panelRegistar.addController(listener);
        panelUsuario.addController(listener);
        panelCompra.addController(listener);
    }


}
