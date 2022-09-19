package states.menus;

import states.menus.Hamburguesa;

public class Cubana extends Hamburguesa {

    public Cubana(int id, String nombre, String descripcion, int precio, int conQuesoRespuesta,
            int vegetarianaRespuesta) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        // Adentro del metodo se inicializa la variable OwO
        this.conQueso(conQuesoRespuesta);
        this.vegetariana(vegetarianaRespuesta);
    }

    public Cubana() {
        this.id = 101;
        this.nombre = "Hamburguesa Cubana";
        this.descripcion = "Hamburguesa de res combinada con huevo y salchicha. Con una porcion de salsa picante ";
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

    public String ponerSalchicha() {
        return "Estoy poniendo las salchichas";
    }

    public String ponerHuevo() {
        return "Estoy poniendo el huevo";
    }

    public String ponerSalsaPicante() {
        return "Estoy poniendo la salsa picante";
    }

}