import states.menus.Hamburguesa;
package states.menus;

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
    public String prepararProteina() {
        return "Estoy preparando la arrachera";
    }

    @Override
    public String ponerProteina() {
        return "Estoy poniendo la arrachera";
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