package robot.estados.menus;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase que implementa la interfaz Menu y enlista las hamburguesas versatiles
 * @author Chao2808 Heigz RodrigoSanchez06
 * @version (19 Septiembre 2022)
 * @see Hamburguesa
 * @see Menu
 */
public class Versatil implements Menu {

    private String nombre = "Hamburguesas del dia";
    private ArrayList<Hamburguesa> alimentos = new ArrayList<Hamburguesa>();

    /**
     * Constructor por omision que inicializa la lista con 3 tipos de hamburguesas
     */
    public Versatil() {
        alimentos.add(new DosCarnes());
        alimentos.add(new Cubana());
        alimentos.add(new Mexicana());
    }

    /**
     * Método consultor del titulo del menu
     * @return Devuelve un String con el titulo del menu
     */
    public String obtenerNombre() {
        return this.nombre;
    }

    /**
     * Método que devuelve un iterador que permite recorrer las hamburguesas contenidas en el menu
     * @return Devuelve un iterador del menu en cuestion
     */
    public Iterator<Hamburguesa> obtenerIterador() {
        return alimentos.iterator();
    }
}