package robot.estados.menus;

import java.util.ArrayList;
import java.util.Iterator;

import states.menus.Hamburguesa;

public class Versatil implements Menu {
    private String nombre = "Hamburguesas del dia";

    private ArrayList<Hamburguesa> alimentos;

    public String obtenerNombre() {
        return this.nombre;
    }

    public Iterator<Hamburguesa> obtenerIterador() {
        return alimentos.iterator();
    }
}