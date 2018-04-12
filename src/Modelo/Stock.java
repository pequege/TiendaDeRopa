package Modelo;

public class Stock {
  private Talle talle;
  private Color color;
  private Prenda prenda;
  private int cantidad;

    public Talle getTalle() {
        return talle;
    }

    public Color getColor() {
        return color;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    public Stock(int cantidad, Prenda prenda, Talle talle, Color color) {
        this.cantidad = cantidad;
        this.prenda = prenda;
        this.talle = talle;
        this.color = color;
    }
}
