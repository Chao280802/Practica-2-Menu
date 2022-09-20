package robot.estados.menus;

/**
 * Clase Krisp que extiende la clase abstracta Hamburguesa e implementa las caracteristicas principales de una hamburguesa krisp
 * @author Chao2808 Heigz RodrigoSanchez06
 * @version (19 Septiembre 2022)
 * @see Menu
 * @see Hamburguesa
 */
public class Krisp extends Hamburguesa {

    /**
     * Constructor por omisión que instancia una hamburguesa Krisp con sus caracteristicas predefinidas
     */
    public Krisp() {
        this.id = 51;
        this.nombre = "Hamburguesa Krisp";
        this.descripcion = "Hamburguesa de res con aros de cebolla y crujiente tocino";
        this.precio = 45;
        this.conQueso = false;
        this.vegetariana = false;
    }

    /**
     * Método abstracto que llama a todos los métodos de los ingredientes que lleva la hamburguesa según su tipo
     * @return Devuelve un String detallando toda la preparación
     */
    @Override
    public String preparar(){
        String preparacion = this.ponerPan()+"\n"+this.ponerMayonesa()+"\n"+this.ponerMostaza()+"\n"+this.prepararProteina()+"\n"+this.ponerProteina()+"\n";
        if(this.conQueso)
            preparacion+=this.ponerQueso()+"\n";
        preparacion+=this.ponerVegetales()+"\n"+this.ponerArosDeCebolla()+"\n"+this.ponerCatsup()+"\n"+this.ponerPan();
        return preparacion;
    }

    /**
     * Método abstracto que anuncia la preparación de la proteina principal de la hamburguesa
     * @return Devuelve un String que detalla que proteína se esta preparando para la hamburguesa
     */
    @Override
    public String prepararProteina() {
        return "Estoy preparando la carne";
    }

    /**
     * Método abstracto que anuncia que se esta colocando la proteina principal de la hamburguesa
     * @return Devuelve un String que detalla que proteína se esta colocando en la hamburguesa
     */
    @Override
    public String ponerProteina() {
        return "Estoy poniendo la carne\n" + this.ponerTocino();
    }

    /**
     * Método que simboliza agregarle aros de cebolla a la hamburguesa
     * @return Devuelve un String que anuncia que se le esta agregando aros de cebolla a la hamburguesa
     */
    public String ponerArosDeCebolla() {
        return "Estoy poniendo los aros de cebolla";
    }

    /**
     * Método que simboliza agregarle tocino a la hamburguesa
     * @return Devuelve un String que anuncia que se le esta agregando tocino a la hamburguesa
     */
    public String ponerTocino() {
        return "Estoy poniendo el tocino";
    }
}