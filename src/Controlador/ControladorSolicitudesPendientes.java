package Controlador;

import Modelo.Catalogo;
import Modelo.Solicitud;
import Vista.MenuPrincial;
import Vista.VistaSolicitudesPendientes;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class ControladorSolicitudesPendientes {
	static VistaSolicitudesPendientes vistaSolicitudesPendientes;
	static ArrayList<Solicitud> solicitudes;
	static Catalogo catalogo = new Catalogo();



	public static void MostrarSolicitudes(MenuPrincial menuPrincial, boolean rootPaneCheckingEnabled) {
		vistaSolicitudesPendientes = new VistaSolicitudesPendientes(menuPrincial, rootPaneCheckingEnabled);
		vistaSolicitudesPendientes.setVisible(rootPaneCheckingEnabled);
	}

  public static void cargarSolicitudes (DefaultTableModel modeloTablaSolicitudes) {

  }

//  public static void cargarSolicitudes (DefaultTableModel modeloTablaSolicitudes) {
//	  solicitudes = catalogo.getStocks();
//  }
}
