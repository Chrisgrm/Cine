
package cine;

import presentacion.controlador.Controlador;
import presentacion.vistas.VistaPrincipal;

public class Launcher {
    private static VistaPrincipal vista = new VistaPrincipal();
    private static Controlador controladorPrincipal = new Controlador();
    
    private static void setViewsToController() {        
        controladorPrincipal.setPanelPrincipal(vista.getPanelPrincipal());
    }

  
    public static void main(String[] args) {
        vista.init();
        setViewsToController();
        controladorPrincipal.startListening();        
      
    }
    
}
