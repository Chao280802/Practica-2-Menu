package robot.estados.menus;

import java.util.Iterator;

/**
 * Interfaz que define las propiedades de los menus que implementaremos en la práctica
 * @author Chao2808 Heigz RodrigoSanchez06
 * @version (19 Septiembre 2022)
 * @see Hamburguesa
 */
public interface Menu {

    /**
     * Método consultor del titulo del menu
     * @return Devuelve un String con el titulo del menu
     */
    String obtenerNombre();

    /**
     * Método que devuelve un iterador que permite recorrer las hamburguesas contenidas en el menu
     * @return Devuelve un iterador del menu en cuestion
     */
    Iterator<Hamburguesa> obtenerIterador();
}