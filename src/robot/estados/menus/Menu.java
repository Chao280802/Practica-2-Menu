package robot.estados.menus;

import java.util.Iterator;

public interface Menu {
    String obtenerNombre();
    
    Iterator<MenuItem> obtenerIterador();
}