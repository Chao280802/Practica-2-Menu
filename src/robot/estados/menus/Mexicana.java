package robot.estados.menus;

public class Mexicana extends Hamburguesa {

    public Mexicana(int id, String nombre, String descripcion, int precio, int conQuesoRespuesta,
            int vegetarianaRespuesta) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        // Adentro del metodo se inicializa la variable OwO
        this.conQueso(conQuesoRespuesta);
        this.vegetariana(vegetarianaRespuesta);
    }

    public Mexicana() {
        this.id = 102;
        this.nombre = "Hamburguesa Mexicana";
        this.descripcion = "Hamburguesa de arrachera, guacamole totopos y crema con especias haciendo referencia a los chilaquiles  ";
        this.precio = 55;

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
            return "Estoy preparando la arrachera";
        return "Estoy preparando el sustituto de arrachera";
    }

    @Override
    public String ponerProteina() {
        if (!this.vegetariana)
            return "Estoy poniendo la arrachera";
        return "Estoy poniendo el sustituto de carne";
    }

    public String ponerGuacamole() {
        return "Estoy poniendo el guacamole";
    }

    public String ponerTotopos() {
        return "Estoy poniendo los totopos";
    }

    public String ponerCremaConEspecias() {
        return "Estoy poniendo la crema con especias";
    }

}