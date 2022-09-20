package robot.estados.menus;

import java.util.Iterator;

/**
 * Clase que implementa la interfaz Menu y enlista las hamburguesas tradicionales
 * @author Chao2808 Heigz RodrigoSanchez06
 * @version (19 Septiembre 2022)
 * @see Hamburguesa
 * @see Menu
 */
public class Tradicional implements Menu {

    private String nombre = "Hamburguesas Tradicionales";
    private Hamburguesa[] alimentos = new Hamburguesa[3];

    /**
     * Constructor por omision que inicializa la lista con 3 tipos de hamburguesas
     */
    public Tradicional() {
        alimentos[0] = new Hawaiana();
        alimentos[1] = new Krisp();
        alimentos[2] = new BigB();
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
        return new Iterador();
    }

    private class Iterador implements Iterator<Hamburguesa> {
        int indiceActual = 0;

        public boolean hasNext() {
            return indiceActual < alimentos.length;
        }

        public Hamburguesa next() {
            return alimentos[indiceActual++];
        }
    }
}
