package states.menus;

public class BigB extends Hamburguesa {

    // Esta hamburguesa es una normal por eso no se ponen metodos extra

    public BigB(int id, String nombre, String descripcion, int precio, int conQuesoRespuesta,
            int vegetarianaRespuesta) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        // Adentro del metodo se inicializa la variable OwO
        this.conQueso(conQuesoRespuesta);
        this.vegetariana(vegetarianaRespuesta);
    }

    public BigB() {
        this.id = 52;
        this.nombre = "Hamburguesa BigB";
        this.descripcion = "Hamburguesa de res basica";
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

}