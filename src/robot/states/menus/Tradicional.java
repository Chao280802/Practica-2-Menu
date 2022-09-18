package robot.states.menus;

import java.util.Iterator;

public class Tradicional implements Menu{
    private String nombre="Hamburguesas Tradicionales";
    private MenuItem[] alimentos;

    public String obtenerNombre(){
        return this.nombre;
    }

    public Iterator<MenuItem> obtenerIterador(){
        return new Iterador();
    }

    private class Iterador implements Iterator<MenuItem> {
        int indiceActual=0;

        public boolean hasNext(){
            return indiceActual<alimentos.length-1;
        }

        public MenuItem next(){
            return alimentos[indiceActual++];
        }
    }
}
