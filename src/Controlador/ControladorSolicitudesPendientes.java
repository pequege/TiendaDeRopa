package Controlador;

import Vista.MenuPrincial;
import Vista.VistaSolicitudesPendientes;

public class ControladorSolicitudesPendientes {
	static VistaSolicitudesPendientes vistaSolicitudesPendientes;
	public static void MostrarSolicitudes(MenuPrincial menuPrincial, boolean rootPaneCheckingEnabled) {
		vistaSolicitudesPendientes = new VistaSolicitudesPendientes(menuPrincial, rootPaneCheckingEnabled);
		vistaSolicitudesPendientes.setVisible(rootPaneCheckingEnabled);
	}	
}
