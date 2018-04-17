package Modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Solicitud {
  static Date fecha;
  static ArrayList<LineaDeSolicitud> lineasDeSolicitud;
  static Estado estado;

  //CREAR SOLICITUD
  public Solicitud () {
    this.fecha = new Date();
    this.lineasDeSolicitud = lineasDeSolicitud;
    this.estado = Estado.PENDIENTE;
  }

  public static Date getFecha () {
    return fecha;
  }

  public static void setLineasDeSolicitud (ArrayList<LineaDeSolicitud> lineasDeSolicitud) {
    Solicitud.lineasDeSolicitud = lineasDeSolicitud;
  }

  //SALIDA POR PANTALLA
  public static void mostrarSolicitud(){
    System.out.println("Fecha: " + getFecha().toString());
    System.out.println("Estado: " + estado.toString());
    for (LineaDeSolicitud lineaSolicitud : lineasDeSolicitud) {
      System.out.println(lineaSolicitud.toString());
    }
  }
}
