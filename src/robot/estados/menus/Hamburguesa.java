package robot.estados.menus;

/**
 * Clase abstracta que implementa las caracteristicas principales de una
 * hamburguesa
 * 
 * @author Chao2808 Heigz RodrigoSanchez06
 * @version (19 Septiembre 2022)
 * @see Menu
 * @see
 */
public abstract class Hamburguesa {

    int id, precio;
    String nombre, descripcion;
    boolean conQueso;
    boolean vegetariana;

    // Getters

    /**
     * Metodo consultor del id de este tipo de hamburguesa
     * 
     * @return Devuelve un integer que representa el id de la hamburguesa
     */
    public int obtenerId() {
        return this.id;
    }

    /**
     * Metodo consultor del nombre de esta hamburguesa
     * 
     * @return Devuelve el String que contiene el nombre de la hamburguesa
     */
    public String obtenerNombre() {
        return this.nombre;
    }

    /**
     * Metodo consultor de la descripción de este tipo de hamburguesas
     * 
     * @return Devuelve un String con una breve explicación de los detalles de la
     *         hamburguesa
     */
    public String obtenerDescripcion() {
        return this.descripcion;
    }

    /**
     * Método consultor del precio de esta hamburguesa
     * 
     * @return Devuelve un integer que es el precio de la hamburguesa
     */
    public int obtenerPrecio() {
        return this.precio;
    }

    // Setters

    /**
     * Método modificador del id de este tipo de hamburguesas
     * 
     * @param id Nuevo id por asignar
     */
    public void asignarId(int id) {
        this.id = id;
    }

    /**
     * Método modificador del nombre de este tipo de hamburguesas
     * 
     * @param nombre Nuevo nombre por asignar
     */
    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método modificador de la descripción de este tipo de hamburguesa
     * 
     * @param descripcion Nueva descripción por asignar
     */
    public void asignarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Método modificador del precio de una hamburguesa
     * 
     * @param precio Nuevo precio por asignar
     */
    public void asignarPrecio(int precio) {
        if (precio <= 0)
            throw new IllegalArgumentException();
        this.precio = precio;
    }

    // Hookers

    /**
     * Método que indica si este tipo de hamburguesas lleva queso
     * 
     * @return Devuelve true o false dependiendo del tipo de hamburguesa
     */
    public boolean conQueso() {
        return this.conQueso;
    }

    /**
     * Método que indica si este tipo de hamburguesas es vegetariana
     * 
     * @return Devuelve true o false dependiendo de si la hamburguesa es vegetariana
     */
    public boolean vegetariana() {
        return this.vegetariana;
    }

    /**
     * Método abstracto que llama a todos los métodos de los ingredientes que lleva
     * la hamburguesa según su tipo
     * 
     * @return Devuelve un String detallando toda la preparación
     */
    public abstract String preparar();

    // Prototipo que describe como sera la preparacion de la hamburguesas:

    /**
     * Método que simboliza poner el pan de la hamburguesa
     * 
     * @return Devuelve un String anunciando que esta poniendo una rodaja de pan
     *         para hamburguesas
     */
    public String ponerPan() {
        return "Estoy poniendo pan";
    }

    /**
     * Método que simboliza agregarle mayonesa a la hamburguesa
     * 
     * @return Devuelve un String que anuncia que esta colocando la mayonesa a la
     *         hamburguesa
     */
    public String ponerMayonesa() {
        return "Estoy poniendo Mayonesa";
    }

    /**
     * Método que simboliza agregarle mostaza a la hamburguesa
     * 
     * @return Devuelve un String que anuncia que esta colocando la mostaza a la
     *         hamburguesa
     */
    public String ponerMostaza() {
        return "Estoy poniendo Mostaza";
    }

    /**
     * Método abstracto que anuncia la preparación de la proteina principal de la
     * hamburguesa
     * 
     * @return Devuelve un String que detalla que proteína se esta preparando para
     *         la hamburguesa
     */
    public abstract String prepararProteina();

    /**
     * Método abstracto que anuncia que se esta colocando la proteina principal de
     * la hamburguesa
     * 
     * @return Devuelve un String que detalla que proteína se esta colocando en la
     *         hamburguesa
     */
    public abstract String ponerProteina();

    /**
     * Método que anuncia que se esta colocando queso en la hamburguesa
     * 
     * @return Devuelve un String que anuncia que se esta colocando queso
     */
    public String ponerQueso() {
        return "Estoy poniendo queso";
    }

    /**
     * Método que anuncia que se estan poniendo vegetales en la hamburguesa
     * 
     * @return Devuelve un String que anuncia que se estan agregando vegetales a la
     *         hamburguesa
     */
    public String ponerVegetales() {
        return "Estoy poniendo los vegetales";
    }

    /**
     * Método que anuncia que se esta agregando catsup a la hamburguesa
     * 
     * @return Devuelve un String que anuncia que se esta poniendo catsup
     */
    public String ponerCatsup() {
        return "Estoy poniendo la catsup";
    }

    /**
     * Método que compone un String que representa un objeto de esta clase para
     * imprimir en pantalla
     * 
     * @return Devuelve el String que representa a este objeto
     */
    public String toString() {
        return "Nombre: " + nombre + "\n"
                + "ID: " + id + "\n"
                + "Queso: " + (this.conQueso ? "si" : "no") + "\n"
                + "Vegetariano: " + (this.vegetariana ? "si" : "no") + "\n"
                + "Descripción: " + descripcion + "\n"
                + "Precio: $" + precio + "\n";
    }

    // Diferentes metodos de preparacion de hamburguesas

}
