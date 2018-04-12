package Modelo;

import java.util.ArrayList;

public class Sucursal {
    private ArrayList<Stock> stock = new ArrayList<>();
    Catalogo catalogo = new Catalogo();
    
    public ArrayList<Stock> cargarStock(){
        stock.add(new Stock(20, catalogo.inicializarCatalogo().get(0), catalogo.InicializarTalles().get(3), catalogo.InicializarColores().get(4)));
        stock.add(new Stock(30, catalogo.inicializarCatalogo().get(1), catalogo.InicializarTalles().get(2), catalogo.InicializarColores().get(3)));
        stock.add(new Stock(20, catalogo.inicializarCatalogo().get(0), catalogo.InicializarTalles().get(3), catalogo.InicializarColores().get(1)));
        stock.add(new Stock(15, catalogo.inicializarCatalogo().get(2), catalogo.InicializarTalles().get(4), catalogo.InicializarColores().get(2)));
        return stock;
    }    
}
