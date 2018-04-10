package Modelo;

import java.util.ArrayList;
import java.util.Date;

public class Solicitud {

    public static void GenerarSolicitud(String cantidad, String codigo, String color, String talle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  private Date fecha;
  private ArrayList<LineaDeSolicitud> lineasDeSolicitud = new ArrayList<LineaDeSolicitud>();
  private Estado estado;


  //CREAR SOLICITUD
  public Solicitud (Date fecha, ArrayList<LineaDeSolicitud> lineasDeSolicitud, Estado estado) {
    this.fecha = fecha;
    this.lineasDeSolicitud = lineasDeSolicitud;
    this.estado = estado;
  }
}
