package robot.estados.menus;

/**
 * Clase TeriyakiMango que extiende la clase abstracta Hamburguesa e implementa las caracteristicas principales de una hamburguesa teriyakimango
 * @author Chao2808 Heigz RodrigoSanchez06
 * @version (19 Septiembre 2022)
 * @see Menu
 * @see Hamburguesa
 */
public class TeriyakiMango extends Hamburguesa {

    /**
     * Constructor por omisión que instancia una hamburguesa TeriyakiMango con sus caracteristicas predefinidas
     */
    public TeriyakiMango() {
        this.id = 200;
        this.nombre = "Hamburguesa teriyakiMango";
        this.descripcion = "Hamburguesa de sustituto de res cortado en finas rebanadas sazonadas con salsa teriyaki, rico mango preparado a la forma de la casa y un toque de especias ";
        this.precio = 55;
        this.conQueso = false;
        this.vegetariana=true;
    }

    /**
     * Método abstracto que llama a todos los métodos de los ingredientes que lleva la hamburguesa según su tipo
     * @return Devuelve un String detallando toda la preparación
     */
    @Override
    public String preparar(){
        String preparacion = this.ponerPan()+"\n"+this.ponerMayonesa()+"\n"+this.ponerEspecias()+"\n"+this.ponerSalsaTeriyaki()+"\n"+this.ponerMostaza()+"\n"+this.prepararProteina()+"\n"+this.ponerProteina()+"\n";
        if(this.conQueso)
            preparacion+=this.ponerQueso()+"\n";
            preparacion+=this.ponerVegetales()+"\n"+this.ponerMangoPreparado()+"\n"+this.ponerCatsup()+"\n"+this.ponerPan()+"\n";
        return preparacion;
    }

    /**
     * Método abstracto que anuncia la preparación de la proteina principal de la hamburguesa
     * @return Devuelve un String que detalla que proteína se esta preparando para la hamburguesa
     */
    @Override
    public String prepararProteina() {
        return "Estoy preparando la rebanadas vegetarianas de res";
    }

    /**
     * Método abstracto que anuncia que se esta colocando la proteina principal de la hamburguesa
     * @return Devuelve un String que detalla que proteína se esta colocando en la hamburguesa
     */
    @Override
    public String ponerProteina() {
        return "Estoy poniendo las rebanadas vegetarianas de res";
    }

    /**
     * Método que simboliza agregarle salsa Teriyaki a la hamburguesa
     * @return Devuelve un String que anuncia que se le esta agregando salsa Teriyaki a la hamburguesa
     */
    public String ponerSalsaTeriyaki() {
        return "Estoy poniendo la salsa teriyaki";
    }

    /**
     * Método que simboliza agregarle mango preparado a la hamburguesa
     * @return Devuelve un String que anuncia que se le esta agregando mango preparado a la hamburguesa
     */
    public String ponerMangoPreparado() {
        return "Estoy poniendo el mango preparado";
    }

    /**
     * Método que simboliza agregarle especias a la hamburguesa
     * @return Devuelve un String que anuncia que se le esta agregando especias a la hamburguesa
     */
    public String ponerEspecias() {
        return "Estoy poniendo las especias";
    }
}
