package robot.estados.menus;

/**
 * Clase que extiende de hamburguesa y representa a una hamburguesa Artesanal.
 */
public class Artesanal extends Hamburguesa {

    /**
     * Constructor de la clase Artesanal, asigna valores por defecto.
     */
    public Artesanal() {
        this.id = 202;
        this.nombre = "Hamburguesa artesanal";
        this.descripcion = "Hamburguesa de res alta calidad, aderezo de miel de la casa, jamon serrano, gratinada con queso parmesano  ";
        this.precio = 60;
        this.conQueso = true;
        this.vegetariana = false;
    }

    /**
     * Método abstracto que llama a todos los métodos de los ingredientes que lleva
     * la hamburguesa según su tipo.
     * 
     * @return Devuelve un String detallando toda la preparación.
     */
    @Override
    public String preparar() {
        String preparacion = this.ponerPan() + "\n" + this.ponerMayonesa() + "\n" + this.ponerAderezoMiel() + "\n"
                + this.ponerMostaza() + "\n" + this.prepararProteina() + "\n" + this.ponerProteina() + "\n";
        if (this.conQueso)
            preparacion += this.ponerParmesano() + "\n";
        preparacion += this.ponerVegetales() + "\n" + this.ponerCatsup() + "\n" + this.ponerPan();
        return preparacion;
    }

    /**
     * Método abstracto que anuncia la preparación de la proteina principal de la
     * hamburguesa.
     * 
     * @return Devuelve un String que detalla que proteína se esta preparando para
     *         la hamburguesa.
     */
    @Override
    public String prepararProteina() {
        return "Estoy preparando la carne de res premium\n";
    }

    /**
     * Método abstracto que anuncia que se esta colocando la proteina principal de
     * la hamburguesa.
     * 
     * @return Devuelve un String que detalla que proteína se esta colocando en la
     *         hamburguesa.
     */
    @Override
    public String ponerProteina() {
        return "Estoy poniendo la carne de res premium" + this.ponerJamonSerrano();
    }

    /**
     * Coloca aderezo miel a la hamburguesa.
     * 
     * @return cadena colocando miel a la hamburguesa.
     */
    public String ponerAderezoMiel() {
        return "Estoy poniendo el aderezo de miel";
    }

    /**
     * Coloca Jamón serrano a la hamburguesa.
     * 
     * @return cadena colocando Jamon serrano a la hamburguesa.
     */
    public String ponerJamonSerrano() {
        return "Estoy poniendo el jamon serrano";
    }

    /**
     * Coloca Parmesano a la hamburguesa.
     * 
     * @return cadena colocando Parmesano a la hamburguesa.
     */
    public String ponerParmesano() {
        return "Estoy gratinando todo de queso parmesano";
    }

}