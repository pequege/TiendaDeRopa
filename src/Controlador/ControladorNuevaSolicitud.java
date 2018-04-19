package Controlador;

import Modelo.*;
import Vista.*;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ControladorNuevaSolicitud {
  static VistaNuevaSolicitud vistaNuevaSolicitud;
  static Catalogo catalogo;
  static ArrayList<LineaDeSolicitud> lineasDeSolicitud;
  static Solicitud solicitud;
  static Sucursal sucursal = new Sucursal();

  public static void crearSolicitud (MenuPrincial menuPrincial, boolean rootPaneCheckingEnabled) {
    lineasDeSolicitud = new ArrayList<>();
    catalogo = new Catalogo();
    vistaNuevaSolicitud = new VistaNuevaSolicitud(menuPrincial, rootPaneCheckingEnabled);
    vistaNuevaSolicitud.setVisible(rootPaneCheckingEnabled);
    cargarPrendas(vistaNuevaSolicitud.getjComboBoxCodigoPrenda());
    cargarColores(vistaNuevaSolicitud.getjComboBoxColor());
    cargarTalles(vistaNuevaSolicitud.getjComboBoxTalle());
  }

  public static void cargarPrendas (JComboBox<String> jComboBoxCodigoPrenda){
    ArrayList<Prenda> prendas = catalogo.getPrendas();
    for(Prenda prenda : prendas){
      jComboBoxCodigoPrenda.addItem(prenda.getCodigo());
    }
  }

  public static void cargarColores (JComboBox<String> jComboBoxColorNombre) {
    ArrayList<Color> colores = catalogo.getColores();
    for(Color color : colores){
      jComboBoxColorNombre.addItem(color.getNombreColor());
    }
  }

  public static void cargarTalles (JComboBox<String> jComboBoxTalleNombre) {
    ArrayList<Talle> talles = catalogo.getTalles();
    for (Talle talle : talles) {
      jComboBoxTalleNombre.addItem(talle.getNombreTalle());
    }
  }

  public static void crearLineaDeSolicitud (String cantidadSolicitada, String codigoPrenda, String colorNombre, String talleNombre) {
    int cantidad = Integer.parseInt(cantidadSolicitada);
    Prenda prenda = buscarPrenda(codigoPrenda);
    Color color = buscarColor(colorNombre);
    Talle talle = buscarTalle(talleNombre);
    LineaDeSolicitud lineaDeSolicitud = new LineaDeSolicitud(cantidad, prenda, color, talle);
    lineasDeSolicitud.add(lineaDeSolicitud);
  }

  public static Prenda buscarPrenda(String codigoPrenda){
    return catalogo.buscarPrenda(codigoPrenda);
  }

  public static Color buscarColor(String colorNombre){
    return catalogo.buscarColor(colorNombre);
  }

  public static Talle buscarTalle(String talleNombre){
    return catalogo.buscarTalle(talleNombre);
  }

  public static Date FechaActual(){
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    Date fecha = new Date();
    String fechaActual = format.format(fecha);
    return fecha;
  }

  public static void generarSolicitud () {
    solicitud = new Solicitud();
    solicitud.setLineasDeSolicitud(lineasDeSolicitud);
    solicitud.mostrarSolicitud();
    String sucursalActual = Main.getSucursalActual();
    sucursal = catalogo.buscarSucursal(sucursalActual);
    sucursal.getSolicitudes().add(solicitud);
  }
}
