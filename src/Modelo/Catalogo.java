package Modelo;

import java.util.ArrayList;

public class Catalogo {
  Material material1 = new Material("Algodón");
  Material material2 = new Material("Poliéster");
  Material material3 = new Material("Lino");

  private ArrayList<Prenda> prendas;
  private ArrayList<Talle> talles;
  private ArrayList<Color> colores;
  private ArrayList<Stock> stocks;

  public void cargarStock () {
    stocks.add(new Stock(9, buscarPrenda("101"), buscarColor("Azul"), buscarTalle("L")));
    stocks.add(new Stock(10, buscarPrenda("202"), buscarColor("Azul"), buscarTalle("L")));
    stocks.add(new Stock(7, buscarPrenda("101"), buscarColor("Blanco"), buscarTalle("S")));
    stocks.add(new Stock(5, buscarPrenda("303"), buscarColor("Rojo"), buscarTalle("L")));
  }

  public void cargarPrendas (){
    prendas.add(new Prenda("101", 599.99, "Remera mangas corta", material1));
    prendas.add(new Prenda("202", 1599.99, "Camisa mangas larga", material3));
    prendas.add(new Prenda("303", 1999.99, "Campera con capucha", material2));
  }

  public void cargarTalles () {
    talles.add(new Talle("XS"));
    talles.add(new Talle("S"));
    talles.add(new Talle("M"));
    talles.add(new Talle("L"));
    talles.add(new Talle("XL"));
  }

  public void cargarColores () {
    colores.add(new Color("Azul"));
    colores.add(new Color("Blanco"));
    colores.add(new Color("Gris"));
    colores.add(new Color("Naranja"));
    colores.add(new Color("Rojo"));
    colores.add(new Color("Verde"));
  }

  public ArrayList<Prenda> getPrendas () {
    return prendas;
  }

  public ArrayList<Talle> getTalles () {
    return talles;
  }

  public ArrayList<Color> getColores () {
    return colores;
  }

  public ArrayList<Stock> getStocks () {
    return stocks;
  }

  public Catalogo () {
    prendas = new ArrayList<>();
    colores = new ArrayList<>();
    talles = new ArrayList<>();
    cargarPrendas();
    cargarColores();
    cargarTalles();
  }

  public Prenda buscarPrenda (String codigoPrenda) {
    Prenda prendaEncontrada = new Prenda();
    for (Prenda prenda : prendas) {
      if(codigoPrenda == prenda.getCodigo()){
        prendaEncontrada = prenda;
      }
    }
    return prendaEncontrada;
  }

  public Color buscarColor (String colorNombre) {
    Color colorEncontrado = new Color();
    for (Color color : colores) {
      if(colorNombre == color.getNombreColor()){
        colorEncontrado = color;
      }
    }
    return colorEncontrado;
  }

  public Talle buscarTalle (String talleNombre){
    Talle talleEncontrado = new Talle();
    for (Talle talle : talles) {
      if(talleNombre == talle.getNombreTalle()){
        talleEncontrado = talle;
      }
    }
    return talleEncontrado;
  }
}
