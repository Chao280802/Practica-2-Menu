package robot.estados.menus;

/**
 * Clase que extiende de hamburguesa y representa a una hamburguesa Cubana.
 */
public class Cubana extends Hamburguesa {

    /**
     * Constructor de la clase Cubana, asigna valores por defecto.
     */
    public Cubana() {
        this.id = 101;
        this.nombre = "Hamburguesa Cubana";
        this.descripcion = "Hamburguesa de res combinada con huevo y salchicha. Con una porcion de salsa picante ";
        this.precio = 50;
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
                + this.ponerHuevo() + "\n" + this.prepararProteina() + "\n" + this.ponerProteina() + "\n"
                + this.ponerHuevo() + "\n";
        if (this.conQueso)
            preparacion += this.ponerQueso() + "\n";
        preparacion += this.ponerVegetales() + "\n" + this.ponerCatsup() + "\n" + this.ponerSalsaPicante() + "\n"
                + this.ponerPan();
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
        return "Estoy poniendo la carne\n" + this.ponerSalchicha();
    }

    /**
     * Coloca Salchicha a la hamburguesa.
     * 
     * @return cadena colocando Salchicha a la hamburguesa.
     */
    public String ponerSalchicha() {
        return "Estoy poniendo las salchichas";
    }

    /**
     * Coloca Huevo a la hamburguesa.
     * 
     * @return cadena colocando Huevo a la hamburguesa.
     */
    public String ponerHuevo() {
        return "Estoy poniendo el huevo";
    }

    /**
     * Coloca Salsa Picante a la hamburguesa.
     * 
     * @return cadena colocando Salsa Picante a la hamburguesa.
     */
    public String ponerSalsaPicante() {
        return "Estoy poniendo la salsa picante";
    }
}