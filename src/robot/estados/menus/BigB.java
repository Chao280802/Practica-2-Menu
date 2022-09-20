package robot.estados.menus;

/**
 * Clase que extiende de hamburguesa y representa a una hamburguesa BigB.
 */
public class BigB extends Hamburguesa {

    // Esta hamburguesa es una normal por eso no se ponen metodos extra

    /**
     * Constructor de la clase BigB, asigna valores por defecto.
     */
    public BigB() {
        this.id = 52;
        this.nombre = "Hamburguesa BigB";
        this.descripcion = "Hamburguesa de res basica";
        this.precio = 40;
        this.conQueso = true;
        this.vegetariana = false;
    }

    /**
     * Método abstracto que llama a todos los métodos de los ingredientes que lleva
     * la hamburguesa según su tipo
     * 
     * @return Devuelve un String detallando toda la preparación
     */
    @Override
    public String preparar() {
        String preparacion = this.ponerPan() + "\n" + this.ponerMayonesa() + "\n" + this.ponerMostaza() + "\n"
                + this.prepararProteina() + "\n" + this.ponerProteina() + "\n";
        if (this.conQueso)
            preparacion += this.ponerQueso() + "\n";
        preparacion += this.ponerVegetales() + "\n" + this.ponerCatsup() + "\n" + this.ponerPan();
        return preparacion;
    }

    /**
     * Método abstracto que anuncia la preparación de la proteina principal de la
     * hamburguesa
     * 
     * @return Devuelve un String que detalla que proteína se esta preparando para
     *         la hamburguesa
     */
    @Override
    public String prepararProteina() {
        return "Estoy preparando la carne";
    }

    /**
     * Método abstracto que anuncia que se esta colocando la proteina principal de
     * la hamburguesa
     * 
     * @return Devuelve un String que detalla que proteína se esta colocando en la
     *         hamburguesa
     */
    @Override
    public String ponerProteina() {
        return "Estoy poniendo la carne";
    }

}