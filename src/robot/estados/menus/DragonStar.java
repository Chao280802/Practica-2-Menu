package robot.estados.menus;

public class DragonStar extends Hamburguesa {

    public DragonStar(int id, String nombre, String descripcion, int precio, int conQuesoRespuesta,
            int vegetarianaRespuesta) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        // Adentro del metodo se inicializa la variable OwO
        this.conQueso(conQuesoRespuesta);
        this.vegetariana(vegetarianaRespuesta);
    }

    public DragonStar() {
        this.id = 201;
        this.nombre = "Hamburguesa dragonStar";
        this.descripcion = "Hamburguesa de pastor, con jalapenio, una sazonada de miel para darle una sensacion unica. Empanizada completa  ";
        this.precio = 60;

    }

    @Override
    public String prepararProteina() {
        return "Estoy preparando el pastor";
    }

    @Override
    public String ponerProteina() {

        return "Estoy poniendo el pastor";
    }

    public String ponerJalapenio() {
        return "Estoy poniendo el jalapenio";
    }

    public String ponerMiel() {
        return "Estoy poniendo la miel";
    }

    public String empanizandolaEntera() {
        return "La estoy empanizando entera";
    }

}