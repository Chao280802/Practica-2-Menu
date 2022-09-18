package robot.states.menus;

import java.util.ArrayList;
import java.util.Iterator;

public class Versatil implements Menu{
    private String nombre="Hamburguesas del dia";

    private ArrayList<MenuItem> alimentos;

    public String obtenerNombre(){
        return this.nombre;
    }

    public Iterator<MenuItem> obtenerIterador(){
        return alimentos.iterator();
    }
}