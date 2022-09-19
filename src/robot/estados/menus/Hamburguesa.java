package robot.estados.menus;

public abstract class Hamburguesa {

    int id, precio;
    String nombre, descripcion;
    boolean conQueso = false;
    boolean vegetariana = false;

    // Getters

    public int obtenerId() {
        return this.id;
    }

    public String obtenerNombre() {
        return this.nombre;
    }

    public String obtenerDescripcion() {
        return this.descripcion;
    }

    public int obtenerPrecio() {
        return this.precio;
    }

    // Setters

    public void asignarId(int id) {
        this.id = id;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public void asignarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void asignarPrecio(int precio) {
        if(precio <= 0)
            throw new IllegalArgumentException();
        this.precio = precio;
    }

    // Hookers

    public boolean conQueso(int respuesta) {
        if(respuesta != 0 && respuesta != 1)
            throw new IllegalArgumentException();
        return this.conQueso = respuesta == 1;

    }

    public boolean vegetariana(int respuesta) {
        if(respuesta != 0 && respuesta != 1)
            throw new IllegalArgumentException();
        return this.vegetariana = respuesta == 1;
    }

    public abstract String preparar(boolean conQueso, boolean vegetariana);

    // Prototipo que describe como sera la preparacion de la hamburguesas:

    public String ponerPan() {
        return "Estoy poniendo pan";
    }

    public String ponerMayonesa() {
        return "Estoy poniendo Mayonesa";
    }

    public String ponerMostaza() {
        return " Estoy poniendo Mostaza";
    }

    public abstract String prepararProteina();

    public abstract String ponerProteina();

    public String ponerQueso() {
        return "Estoy poniendo queso manchego";
    }

    public String ponerVegetales() {
        return "Estoy poniendo los vegetales";
    }

    public String ponerCatsup() {
        return "Estoy poniendo la catsup";
    }

    // Diferentes metodos de preparacion de hamburguesas

}
