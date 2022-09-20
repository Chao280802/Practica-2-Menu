package robot.estados.menus;

/**
 * Clase que extiende de hamburguesa y representa a una hamburguesa Dos Carnes.
 */
public class DosCarnes extends Hamburguesa {

    /**
     * Constructor de la clase Dos Carnes, asigna valores por defecto.
     */
    public DosCarnes() {
        this.id = 100;
        this.nombre = "Hamburguesa dos carnes";
        this.descripcion = "Hamburguesa de res combinada con pechuga de pollo endulzada con salsa agridulce";
        this.precio = 50;
        this.conQueso = false;
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
        preparacion += this.ponerVegetales() + "\n" + this.ponerCatsup() + "\n" + this.ponerSalsaAgrigulce() + "\n"
                + this.ponerPan() + "\n";
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
        return "Estoy poniendo la  carne \n" + this.ponerPollo();
    }

    /**
     * Coloca Pollo a la hamburguesa.
     * 
     * @return cadena colocando Pollo a la hamburguesa.
     */
    public String ponerPollo() {
        return "Estoy poniendo el pollo";
    }

    /**
     * Coloca Salsa Agrigulce a la hamburguesa.
     * 
     * @return cadena colocando Salsa Agrigulce a la hamburguesa.
     */
    public String ponerSalsaAgrigulce() {
        return "Estoy poniendo la salsa agridulce";
    }

}