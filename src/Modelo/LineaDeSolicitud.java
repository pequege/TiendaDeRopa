package Modelo;

public class LineaDeSolicitud {
  private int cantidad;
  private Prenda prenda;
  private Talle talle;
  private Color color;

  public LineaDeSolicitud (int cantidad, Prenda prenda, Color color, Talle talle) {
    this.cantidad = cantidad;
    this.prenda = prenda;
    this.color = color;
    this.talle = talle;
  }

  @Override
  public String toString() {
      return "LineaDeSolicitud\n" + "cantidad: " + cantidad + ", prenda: " + prenda.getCodigo() + ", color: " + color.getNombreColor() +", talle: " + talle.getNombreTalle() +  "\n";
  }
}
