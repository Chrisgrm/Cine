/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.vistas;

import static java.awt.Color.WHITE;
import java.awt.event.ActionListener;
import javax.swing.*;
import presentacion.factory.FontFactory;
import presentacion.templates.TemplateButton;


/**
 *
 * @author chris
 */
public class PanelCompra extends JPanel{
    
    private JLabel lblNumeroRef;
    private JLabel lblTitulo;
    private JLabel lblPelicula;
    private JLabel lblFila;
    private JLabel lblAsiento;
    private JLabel lblSala;
    private JLabel lblHora;
    private JComboBox selectFila;
    private JComboBox selectAsiento;
    private JComboBox selectHora;
    private TemplateButton btnComprar;
    private TemplateButton btnAtras;
    
    public PanelCompra(){
        String[] fila = {"","A","B","C","D","E","F"};
        String[] asiento = {"","1","2","3","4","5","6","7","8","9","10"};
        String[] hora = {"","14:00","16:00"};
        lblNumeroRef= new JLabel();
        lblTitulo= new JLabel();
        lblPelicula= new JLabel();
        lblFila= new JLabel();
        lblAsiento= new JLabel();
        lblSala= new JLabel();
        lblHora= new JLabel();
        selectFila= new JComboBox(fila);
        selectHora= new JComboBox(hora);
        selectAsiento= new JComboBox(asiento);
        btnComprar= new TemplateButton();
        btnAtras= new TemplateButton();
        
        
        
    }

    public JLabel getLblPelicula() {
        return lblPelicula;
    }

    public TemplateButton getBtnComprar() {
        return btnComprar;
    }

    public TemplateButton getBtnAtras() {
        return btnAtras;
    }

    public JLabel getLblNumeroRef() {
        return lblNumeroRef;
    }

    public JComboBox getSelectFila() {
        return selectFila;
    }

    public JComboBox getSelectAsiento() {
        return selectAsiento;
    }

    public JComboBox getSelectHora() {
        return selectHora;
    }
    
    
    
    public void addController(ActionListener listener) {
        btnAtras.addActionListener(listener);
        btnComprar.addActionListener(listener);
    }

    public void init() {
        setProperties();
        setComponentsProperties();
        addComponentes();
    }

    private void setProperties() {
        setLayout(null);
        setOpaque(false);
        setVisible(false);

    }

    private void setComponentsProperties() {
        setLblNRefProperties();
        setLblTituloProperties();
        setLblPeliculaProperties();
        setLblFilaProperties();
        setLblAsientoProperties();
        setLblSalaProperties();
        setLblHoraProperties();
        setBtnCompraProperties();
        setBtnAtrasProperties();
        
    }

    private void addComponentes() {
        add(lblNumeroRef);
        add(lblTitulo);
        add(lblPelicula);
        add(lblFila);
        add(lblAsiento);
//        add(lblSala);
        add(lblHora);
        add(selectFila);
        add(selectAsiento);
        add(selectHora);
        add(btnComprar);
        add(btnAtras);
        
    }

    private void setBtnAtrasProperties() {
        btnAtras.setBounds(650, 550, 150, 60);
        btnAtras.setText("Atras");
   
    }

    private void setBtnCompraProperties() {
        btnComprar.setBounds(650 ,470 , 150, 70);
        btnComprar.setText("Comprar");   
    }

    private void setLblHoraProperties() {
        lblHora.setText("Hora:");
        lblHora.setBounds(200, 460, 300, 40);
        lblHora.setFont(FontFactory.getFont("fuente1.ttf", 0, 40));
        lblHora.setForeground(WHITE); 
        selectHora.setBounds(390, 460, 150, 40);;
        selectHora.setFont(FontFactory.getFont("fuente1.ttf", 0, 35));  
    }

    private void setLblSalaProperties() {
        lblSala.setText("Sala:");
        lblSala.setBounds(200, 530, 300, 40);
        lblSala.setFont(FontFactory.getFont("fuente1.ttf", 0, 40));
        lblSala.setForeground(WHITE); 
        
    }

    private void setLblAsientoProperties() {
       
        lblAsiento.setText("Asiento:");        
        lblAsiento.setBounds(200, 390, 150, 40);
        lblAsiento.setFont(FontFactory.getFont("fuente1.ttf", 0, 40));
        lblAsiento.setForeground(WHITE);
        selectAsiento.setBounds(390,390,150,40);
        selectAsiento.setFont(FontFactory.getFont("fuente1.ttf", 0, 35));
    }

    private void setLblFilaProperties() {
        
        lblFila.setText("Fila:");
        lblFila.setBounds(200, 320, 150, 40);
        lblFila.setFont(FontFactory.getFont("fuente1.ttf", 0, 40));
        lblFila.setForeground(WHITE);
        selectFila.setBounds(390,320,150,40);
        selectFila.setFont(FontFactory.getFont("fuente1.ttf", 0, 35));
    }

    private void setLblPeliculaProperties() {
        lblPelicula.setText("Pelicula:");
        lblPelicula.setBounds(200, 250, 500, 40);
        lblPelicula.setFont(FontFactory.getFont("fuente1.ttf", 0, 40));
        lblPelicula.setForeground(WHITE);   
    }

    private void setLblTituloProperties() {
        lblTitulo.setText("BOLETA");
        lblTitulo.setBounds(300, 60, 300, 90);
        lblTitulo.setFont(FontFactory.getFont("fuente1.ttf", 0, 90));
        lblTitulo.setForeground(WHITE);
    }

    private void setLblNRefProperties() {
        lblNumeroRef.setText("Numero:");
        lblNumeroRef.setBounds(200, 180, 500, 40);
        lblNumeroRef.setFont(FontFactory.getFont("fuente1.ttf", 0, 40));
        lblNumeroRef.setForeground(WHITE);
    }

    public void limpiar() {
        lblHora.setText("Hora:");
        lblSala.setText("Sala:");
        lblPelicula.setText("Pelicula:");
        lblNumeroRef.setText("Numero:");
    }
    
}
