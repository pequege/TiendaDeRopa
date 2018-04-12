package Modelo;

public class Prenda {
  private String codigo;
  private double precio;
  private String descripcion;
  private Material material;

    public Prenda() {
    }

  public String getCodigo() {
      return codigo;
  }

  public Prenda (String codigo, double precio, String descripcion, Material material) {
    this.codigo = codigo;
    this.precio = precio;
    this.descripcion = descripcion;
    this.material = material;
  }
}
