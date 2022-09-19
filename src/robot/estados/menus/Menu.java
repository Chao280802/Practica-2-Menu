package robot.estados.menus;

import java.util.Iterator;

import states.menus.Hamburguesa;

public interface Menu {
    String obtenerNombre();

    Iterator<Hamburguesa> obtenerIterador();
}