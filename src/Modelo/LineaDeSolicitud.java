package Modelo;

public class LineaDeSolicitud {
  private int cantidad;
  private Prenda prenda;
  private Talle talle;
  private Color color;

  public LineaDeSolicitud (int cantidad, Prenda prenda, Talle talle, Color color) {
    this.cantidad = cantidad;
    this.prenda = prenda;
    this.talle = talle;
    this.color = color;
  }
}
