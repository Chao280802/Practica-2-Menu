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
            return "Estoy preparando el pastor";
        return "Estoy preparando el sustituto de carne";
    }

    @Override
    public String ponerProteina() {
        if (!this.vegetariana)

            return "Estoy poniendo el pastor";
        return "Estoy poniendo el sustituto de carne";
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