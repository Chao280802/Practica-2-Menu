package robot.estados.menus;

import java.util.ArrayList;
import java.util.Iterator;

public class Versatil implements Menu {

    private String nombre = "Hamburguesas del dia";
    private ArrayList<Hamburguesa> alimentos = new ArrayList<Hamburguesa>();

    public Versatil() {
        alimentos.add(new DosCarnes());
        alimentos.add(new Cubana());
        alimentos.add(new Mexicana());
    }

    public String obtenerNombre() {
        return this.nombre;
    }

    public Iterator<Hamburguesa> obtenerIterador() {
        return alimentos.iterator();
    }
}