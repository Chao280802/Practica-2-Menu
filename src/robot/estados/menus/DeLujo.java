package robot.estados.menus;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * Clase que implementa la interfaz Menu y enlista las hamburguesas deluxe
 * @author Chao2808 Heigz RodrigoSanchez06
 * @version (19 Septiembre 2022)
 * @see Hamburguesa
 * @see Menu
 */
public class DeLujo implements Menu{
    private String nombre="Hamburguesas de lujo";
    private Hashtable<Integer,Hamburguesa> alimentos = new Hashtable<Integer,Hamburguesa>();

    /**
     * Constructor por omision que inicializa la lista con 3 tipos de hamburguesas
     */
    public DeLujo(){
        this.alimentos.put(Integer.valueOf(0),new DragonStar());
        this.alimentos.put(Integer.valueOf(1),new TeriyakiMango());
        this.alimentos.put(Integer.valueOf(2),new Artesanal());
    }

    /**
     * Método consultor del titulo del menu
     * @return Devuelve un String con el titulo del menu
     */
    public String obtenerNombre(){
        return this.nombre;
    }

    /**
     * Método que devuelve un iterador que permite recorrer las hamburguesas contenidas en el menu
     * @return Devuelve un iterador del menu en cuestion
     */
    public Iterator<Hamburguesa> obtenerIterador(){
        return new Iterador();
    }

    private class Iterador implements Iterator<Hamburguesa> {
        int indiceActual = 0;

        public boolean hasNext(){
            return indiceActual < alimentos.size();
        }

        public Hamburguesa next(){
            return alimentos.get(Integer.valueOf(indiceActual++));
        }
    }
}
