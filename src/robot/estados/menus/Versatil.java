package robot.estados.menus;

import java.util.ArrayList;
import java.util.Iterator;

import states.menus.Cubana;
import states.menus.DosCarnes;
import states.menus.Hamburguesa;
import states.menus.Hawaiana;
import states.menus.Krisp;

public class Versatil implements Menu {

    public Versatil() {
        alimentos.add(new DosCarnes());
        alimentos.add(new Cubana());
        alimentos.add(new Mexicana());
    }

    private String nombre = "Hamburguesas del dia";

    private ArrayList<Hamburguesa> alimentos;

    public String obtenerNombre() {
        return this.nombre;
    }

    public Iterator<Hamburguesa> obtenerIterador() {
        return alimentos.iterator();
    }
}