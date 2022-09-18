package states.menus;

public abstract class Hamburguesa {

    int id, precio;
    String nombre, descripcion;
    boolean conQueso = false;
    boolean vegetariana = false;

    // Getters

    public abstract int obtenerId();

    public abstract String obtenerNombre();

    public abstract String obtenerDescripcion();

    public abstract int obtenerPrecio();

    // Setters

    public abstract void asignarId();

    public abstract void asignarNombre();

    public abstract void asignarDescripcion();

    public abstract void asignarPrecio();

    // Hookers

    public boolean conQueso(int respuesta) {

        return this.conQueso = respuesta == 1;

    }

    public boolean vegetariana(int respuesta) {
        return this.vegetariana = respuesta == 1;
    }

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
        return "Estoy poniendo el queso";
    }

    public String ponerVegetales() {
        return "Estoy poniendo los vegetales";
    }

    public String ponerCatsup() {
        return "Estoy poniendo la catsup";
    }

    // Diferentes metodos de preparacion de hamburguesas

}
