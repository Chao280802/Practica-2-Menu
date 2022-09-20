package robot.estados.menus;

/**
 * Clase que extiende de hamburguesa y representa a una hamburguesa Dragon Star.
 */
public class DragonStar extends Hamburguesa {

    /**
     * Constructor de la clase Dragon Sta, asigna valores por defecto.
     */
    public DragonStar() {
        this.id = 201;
        this.nombre = "Hamburguesa dragonStar";
        this.descripcion = "Hamburguesa de pastor de soya, con jalapenio, una sazonada de miel para darle una sensacion unica. Empanizada completa";
        this.precio = 60;
        this.conQueso = false;
        this.vegetariana = true;
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
                + this.ponerJalapenio() + "\n" + this.prepararProteina() + "\n" + this.ponerProteina() + "\n";
        if (this.conQueso)
            preparacion += this.ponerQueso() + "\n";
        preparacion += this.ponerVegetales() + "\n" + this.ponerCatsup() + "\n" + this.ponerMiel() + "\n"
                + this.ponerPan() + "\n" + this.empanizandolaEntera() + "\n";
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
        return "Estoy preparando el sustituto de carne al pastor";
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
        return "Estoy poniendo el sustituto de carne al pastor";
    }

    /**
     * Coloca Jalapenio a la hamburguesa.
     * 
     * @return cadena colocando Jalapenio a la hamburguesa.
     */
    public String ponerJalapenio() {
        return "Estoy poniendo el jalapenio";
    }

    /**
     * Coloca Miel a la hamburguesa.
     * 
     * @return cadena colocando Miel a la hamburguesa.
     */
    public String ponerMiel() {
        return "Estoy poniendo la miel";
    }

    /**
     * Coloca empanizado a la hamburguesa.
     * 
     * @return cadena colocando empanizado a la hamburguesa.
     */
    public String empanizandolaEntera() {
        return "La estoy empanizando entera";
    }

}