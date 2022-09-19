package robot.estados.menus;

import java.util.Hashtable;
import java.util.Iterator;

public class DeLujo implements Menu{
    private String nombre="Hamburguesas de lujo";
    private Hashtable<Integer,Hamburguesa> alimentos = new Hashtable<Integer,Hamburguesa>();

    public DeLujo(){
        this.alimentos.put(Integer.valueOf(0),new DragonStar());
        this.alimentos.put(Integer.valueOf(1),new DragonStar());
        this.alimentos.put(Integer.valueOf(2),new DragonStar());
    }

    public String obtenerNombre(){
        return this.nombre;
    }

    public Iterator<Hamburguesa> obtenerIterador(){
        return new Iterador();
    }

    private class Iterador implements Iterator<Hamburguesa> {
        int indiceActual = 0;

        public boolean hasNext(){
            return indiceActual < alimentos.size();
        }

        public Hamburguesa next(){
            return alimentos.get(Integer.valueOf(indiceActual));
        }
    }
}
