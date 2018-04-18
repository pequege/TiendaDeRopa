package Controlador;

import Modelo.Catalogo;
import Vista.MenuPrincial;
import Vista.VistaConsultaStock;
import Modelo.Stock;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class ControladorConsultarStock {
  static VistaConsultaStock vistaConsultaStock;
  static ArrayList<Stock> stocks;
  static Catalogo catalogo = new Catalogo();

  public static void consultarStock (MenuPrincial menuPrincial, boolean rootPaneCheckingEnabled) {
    vistaConsultaStock = new VistaConsultaStock(menuPrincial, rootPaneCheckingEnabled);
    vistaConsultaStock.setVisible(rootPaneCheckingEnabled);
    stocks = catalogo.getStocks();
    cargarStock();
  }

  public static void cargarStock (){
    DefaultTableModel modeloTabla = (DefaultTableModel) vistaConsultaStock.getjTableStock().getModel();
    for(Stock stock: stocks){
      modeloTabla.addRow(new Object[] {stock.getCantidad(), stock.getPrenda().getCodigo(), stock.getColor().getNombreColor(), stock.getTalle().getNombreTalle()});
    }
  }
}
