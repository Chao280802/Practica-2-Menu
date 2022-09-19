package robot.estados.menus;

public class TeriyakiMango extends Hamburguesa {

    public TeriyakiMango(int id, String nombre, String descripcion, int precio, int conQuesoRespuesta,
            int vegetarianaRespuesta) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        // Adentro del metodo se inicializa la variable OwO
        this.conQueso(conQuesoRespuesta);
        this.vegetariana(vegetarianaRespuesta);
    }

    public TeriyakiMango() {
        this.id = 200;
        this.nombre = "Hamburguesa teriyakiMango";
        this.descripcion = "Hamburguesa de res cortado en finas rebanadas sazonadas con salsa teriyaki, rico mango preparado a la forma de la casa y un toque de especias ";
        this.precio = 55;

    }

    @Override
    public String prepararProteina() {
        return "Estoy preparando las rebanadas de carne";
    }

    @Override
    public String ponerProteina() {
        return "Estoy poniendo las rebanadas de carne";
    }

    public String ponerSalsaTeriyaki() {
        return "Estoy poniendo la salsa teriyaki";
    }

    public String ponerMangoPreparado() {
        return "Estoy poniendo el mango preparado";
    }

    public String ponerEspecias() {
        return "Estoy poniendo las especias";
    }
}
