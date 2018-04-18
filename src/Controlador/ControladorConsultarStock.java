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
  }

  public static DefaultTableModel cargarStock (DefaultTableModel modeloTabla){
    DefaultTableModel modelo = modeloTabla;
    stocks = catalogo.getStocks();
    for (Stock stock : stocks) {
      String cantidad = String.valueOf(stock.getCantidad());
      String codigoPrenda = stock.getPrenda().getCodigo();
      String color = stock.getColor().getNombreColor();
      String talle = stock.getTalle().getNombreTalle();
      modelo.addRow(new Object[] {cantidad, codigoPrenda, color, talle});
      System.out.println(cantidad + codigoPrenda + color + talle);
    }
    return modelo;
  }
}
