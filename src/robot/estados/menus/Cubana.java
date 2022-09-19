package robot.estados.menus;

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
    public String preparar(boolean conQueso, boolean vegetariana) {
        String preparacion = this.ponerPan() + "\n" + this.ponerMayonesa() + "\n" + this.ponerMostaza() + "\n"
                + this.prepararProteina() + "\n" + this.ponerProteina() + "\n";
        if (this.conQueso)
            preparacion += this.ponerQueso() + "\n";
        preparacion += this.ponerVegetales() + "\n" + this.ponerCatsup() + "\n" + this.ponerPan();
        return preparacion;
    }

    @Override
    public String prepararProteina() {
        if (!this.vegetariana)
            return "Estoy preparando la carne";
        return "Estoy preparando el sustituto de carne";

    }

    @Override
    public String ponerProteina() {
        if (!this.vegetariana)
            return "Estoy poniendo la carne\n" + this.ponerSalchicha() + this.ponerHuevo();
        return "Estoy poniendo el sustituto de carne";

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