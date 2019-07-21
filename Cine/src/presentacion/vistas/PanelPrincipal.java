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
    
    public PanelPrincipal(){
        panelRegistar = new PanelRegistrar();
        panelUsuario = new PanelUsuario();
    }
    public PanelUsuario getPanelUsuario(){
        return panelUsuario;
    }
    public PanelRegistrar getPanelRegistrar(){
        return panelRegistar;
    }
    
    public void setProperties(){
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));  
    }
    public void addComponents(){
        add(panelRegistar);
        add(panelUsuario);
    }
    
    public void init(){
        panelRegistar.init();
        panelUsuario.init();
        setProperties();
        addComponents();
        setBackground("src/recursos/imagenes/jugadores.jpg");
    }
    public void activarPanelRegistrar(){
        panelRegistar.cambiarEstado(true);
    }
    public void addController (ActionListener listener){
        panelRegistar.addController(listener);
        panelUsuario.addController(listener);               
    }


}
