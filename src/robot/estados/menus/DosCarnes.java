package robot.estados.menus;

public class DosCarnes extends Hamburguesa {

    public DosCarnes(int id, String nombre, String descripcion, int precio, int conQuesoRespuesta,
            int vegetarianaRespuesta) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        // Adentro del metodo se inicializa la variable OwO
        this.conQueso(conQuesoRespuesta);
        this.vegetariana(vegetarianaRespuesta);
    }

    public DosCarnes() {
        this.id = 100;
        this.nombre = "Hamburguesa dos carnes";
        this.descripcion = "Hamburguesa de res combinada con pechuga de pollo endulzada con salsa agridulce";
        this.precio = 50;

    }

    @Override
    public String prepararProteina() {

        return "Estoy preparando la carne";
    }

    @Override
    public String ponerProteina() {

        return "Estoy poniendo la carne";
    }

    public String ponerPollo() {
        return "Estoy poniendo el pollo";
    }

    public String ponerSalsaAgrigulce() {
        return "Estoy poniendo la salsa agridulce";
    }

}