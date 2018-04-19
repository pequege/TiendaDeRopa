package Modelo;

import java.util.ArrayList;

public class Sucursal {
  private ArrayList<Stock> stock;
  private ArrayList<Solicitud> solicitudes;
  private String nombreSucursal;
  static int contador = 1;
  static int idSucursal = 0;

  public static int getIdSucursal() {
    return idSucursal;
  }

  public ArrayList<Stock> getStock () {
    return stock;
  }

  public String getNombreSucursal () {
    return nombreSucursal;
  }

  public ArrayList<Solicitud> getSolicitudes () {
    return solicitudes;
  }

  public Sucursal (String nombreSucursal, ArrayList<Stock> stock) {
    this.stock = stock;
    this.nombreSucursal = nombreSucursal;
    this.idSucursal = contador++;
  }

  public Sucursal () {
    this.solicitudes = new ArrayList<>();
  }
}
