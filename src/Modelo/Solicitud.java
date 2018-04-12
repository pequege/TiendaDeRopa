package Modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Solicitud {
  static Date fecha;
  private ArrayList<LineaDeSolicitud> lineasDeSolicitud = new ArrayList<LineaDeSolicitud>();
  private Estado estado;
  static SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
  

  public static void GenerarSolicitud(String cantidad, String codigo, String color, String talle) {
      fecha = new Date();
      
      String fechaActual = format.format(fecha);
      System.out.println(fechaActual);
   }

  //CREAR SOLICITUD
  public Solicitud (Date fecha, ArrayList<LineaDeSolicitud> lineasDeSolicitud, Estado estado) {
    this.fecha = fecha;
    this.lineasDeSolicitud = lineasDeSolicitud;
    this.estado = estado;
  }
}
