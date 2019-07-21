/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.vistas;

import java.awt.*;
import javax.swing.*;
import presentacion.factory.DimensionFactory;

public class VistaPrincipal extends JFrame  {
    
    private JTabbedPane tabbedPane;
    private PanelPrincipal panelPrincipal;
    private PanelRegistrar panelRegistrar;
    
    public VistaPrincipal() {
        tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        panelPrincipal = new PanelPrincipal();
        panelRegistrar = new PanelRegistrar();
    }
    
    public PanelPrincipal getPanelPrincipal(){
        return panelPrincipal;
    }
    public PanelRegistrar getPanelRegistrar(){
        return panelRegistrar;
    }
    
    public void setProperties() {
        setTitle("UCineD");
        setBackground(Color.BLACK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        setSize(DimensionFactory.getWidth(47),DimensionFactory.getHeight(65));
        setVisible(true);
    }  
  
    private void setTabbedPaneProperties() {
        tabbedPane.setSize(DimensionFactory.getHeight(47),DimensionFactory.getWidth(65));
    }  
    private void setComponentsProperties() {
        setTabbedPaneProperties();   
    }

    private void addComponents() {
        add(tabbedPane);
    }

    private void initializePanels() {
        panelPrincipal.init();       
    }

    private void addTabs() {
        tabbedPane.add("Usuario", panelPrincipal);
    }
    
    public void init() {
        setProperties();
        setComponentsProperties();
        addComponents();
        initializePanels();
        addTabs();
    }


}
