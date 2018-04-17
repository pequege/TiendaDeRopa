package Controlador;

import Vista.MenuPrincial;
import Vista.VistaConsultaStock;

public class ControladorConsultarStock {
  static VistaConsultaStock vistaConsultaStock;


  public static void consultarStock (MenuPrincial menuPrincial, boolean rootPaneCheckingEnabled) {
    vistaConsultaStock = new VistaConsultaStock(menuPrincial, rootPaneCheckingEnabled);
    vistaConsultaStock.setVisible(rootPaneCheckingEnabled);
  }
}
