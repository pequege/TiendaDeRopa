package Controlador;

import Modelo.Catalogo;
import Modelo.Sucursal;
import Vista.MenuPrincial;
import Vista.VistaConsultaStock;
import Modelo.Stock;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class ControladorConsultarStock {
  static VistaConsultaStock vistaConsultaStock;
  static ArrayList<Stock> stocks;
  static Catalogo catalogo = new Catalogo();
  static Sucursal sucursal;

  public static void consultarStock (MenuPrincial menuPrincial, boolean rootPaneCheckingEnabled) {
    vistaConsultaStock = new VistaConsultaStock(menuPrincial, rootPaneCheckingEnabled);
    vistaConsultaStock.setVisible(rootPaneCheckingEnabled);
    DefaultTableModel modelo = (DefaultTableModel) vistaConsultaStock.getjTableStock().getModel();
    modelo.addRow(new Object[] {"asd", "asd", "asd", "asd"});
  }

  public static DefaultTableModel cargarStock (DefaultTableModel modeloTabla){
    sucursal = catalogo.buscarSucursal(Main.getSucursalActual());
    stocks = sucursal.getStock();
    DefaultTableModel modelo = modeloTabla;
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
