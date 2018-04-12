package Modelo;

import java.util.ArrayList;

public class Catalogo {
  Material material1 = new Material("Algodón");
  Material material2 = new Material("Poliéster");
  Material material3 = new Material("Lino");

  private final ArrayList<Prenda> prendas = new ArrayList<>();
  private final ArrayList<Talle> talles = new ArrayList<>();
  private final ArrayList<Color> colores = new ArrayList<>();

  public ArrayList<Prenda> inicializarCatalogo(){
    prendas.add(new Prenda("101", 599.99, "Remera mangas corta", material1));
    prendas.add(new Prenda("202", 1599.99, "Camisa mangas larga", material3));
    prendas.add(new Prenda("303", 1999.99, "Campera con capucha", material2));
    return prendas;
  }

  public void mostrarCatalogo(){
    for (Prenda prenda : prendas){
      //System.out.println("COD: ");
    }
  }

  public ArrayList<Talle> InicializarTalles () {
    talles.add(new Talle("XS"));
    talles.add(new Talle("S"));
    talles.add(new Talle("M"));
    talles.add(new Talle("L"));
    talles.add(new Talle("XL"));
    return talles;
  }

  public ArrayList<Color> InicializarColores () {
    colores.add(new Color("Azul"));
    colores.add(new Color("Blanco"));
    colores.add(new Color("Gris"));
    colores.add(new Color("Naranja"));
    colores.add(new Color("Rojo"));
    colores.add(new Color("Verde"));
    return colores;
  }
}
