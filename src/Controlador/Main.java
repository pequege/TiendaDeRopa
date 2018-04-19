package Controlador;

import Modelo.Catalogo;
import Modelo.Sucursal;
import Vista.*;

import java.util.ArrayList;

public class Main {
  private static String sucursalActual;

  public static void main(String[] args) {
    Vista.MenuPrincial menu = new MenuPrincial();
    menu.setVisible(true);
  }

  public static String getSucursalActual () {
    return sucursalActual;
  }

  public static void setSucursalActual (String sucursalActual) {
    Main.sucursalActual = sucursalActual;
  }
}
