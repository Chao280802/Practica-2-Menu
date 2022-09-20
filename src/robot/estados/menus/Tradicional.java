package robot.estados.menus;

import java.util.Iterator;

public class Tradicional implements Menu {

    private String nombre = "Hamburguesas Tradicionales";
    private Hamburguesa[] alimentos = new Hamburguesa[3];

    public Tradicional() {
        alimentos[0] = new Hawaiana();
        alimentos[1] = new Krisp();
        alimentos[2] = new BigB();
    }

    public String obtenerNombre() {
        return this.nombre;
    }

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
