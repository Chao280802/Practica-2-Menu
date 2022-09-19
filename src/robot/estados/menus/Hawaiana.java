package robot.estados.menus;

public class Hawaiana extends Hamburguesa {

    public Hawaiana(int id, String nombre, String descripcion, int precio, int conQuesoRespuesta,
            int vegetarianaRespuesta) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        // Adentro del metodo se inicializa la variable OwO
        this.conQueso(conQuesoRespuesta);
        this.vegetariana(vegetarianaRespuesta);
    }

    public Hawaiana() {
        this.id = 50;
        this.nombre = "Hamburguesa Hawaiana";
        this.descripcion = "Hamburguesa de res, jamon y pinia";
        this.precio = 40;

    }

    @Override
    public String prepararProteina() {

        return "Estoy preparando la carne";
    }

    @Override
    public String ponerProteina() {

        return "Estoy poniendo la carne";
    }

    public String ponerJamon() {
        return "Estoy poniendo jamon";
    }

    public String ponerPinia() {
        return "Estoy poniendo pinia";
    }

}