package robot.estados.menus;

/**
 * Clase Mexicana que extiende la clase abstracta Hamburguesa e implementa las caracteristicas principales de una hamburguesa mexicana
 * @author Chao2808 Heigz RodrigoSanchez06
 * @version (19 Septiembre 2022)
 * @see Menu
 * @see Hamburguesa
 */
public class Mexicana extends Hamburguesa {

    /**
     * Constructor por omisión que instancia una hamburguesa mexicana con sus caracteristicas predefinidas
     */
    public Mexicana() {
        this.id = 102;
        this.nombre = "Hamburguesa Mexicana";
        this.descripcion = "Hamburguesa de arrachera, guacamole totopos y crema con especias haciendo referencia a los chilaquiles  ";
        this.precio = 55;
        this.conQueso = false;
        this.vegetariana = false;
    }

    /**
     * Método abstracto que llama a todos los métodos de los ingredientes que lleva la hamburguesa según su tipo
     * @return Devuelve un String detallando toda la preparación
     */
    @Override
    public String preparar(){
        String preparacion = this.ponerPan()+"\n"+this.ponerCremaConEspecias()+"\n"+this.ponerMayonesa()+"\n"+this.ponerMostaza()+"\n"+this.prepararProteina()+"\n"+this.ponerProteina()+"\n";
        if(this.conQueso)
            preparacion+=this.ponerQueso()+"\n";
        preparacion+=this.ponerTotopos()+"\n"+this.ponerVegetales()+"\n"+this.ponerGuacamole()+"\n"+this.ponerCatsup()+"\n"+this.ponerPan();
        return preparacion;
    }

    /**
     * Método abstracto que anuncia la preparación de la proteina principal de la hamburguesa
     * @return Devuelve un String que detalla que proteína se esta preparando para la hamburguesa
     */
    @Override
    public String prepararProteina() {
        return "Estoy preparando la arrachera";
    }

    /**
     * Método abstracto que anuncia que se esta colocando la proteina principal de la hamburguesa
     * @return Devuelve un String que detalla que proteína se esta colocando en la hamburguesa
     */
    @Override
    public String ponerProteina() {
        return "Estoy poniendo la arrachera";
    }

    /**
     * Método que simboliza agregarle guacamole a la hamburguesa
     * @return Devuelve un String que anuncia que se le esta agregando guacamole a la hamburguesa
     */
    public String ponerGuacamole() {
        return "Estoy poniendo el guacamole";
    }

    /**
     * Método que simboliza agregarle totopos a la hamburguesa
     * @return Devuelve un String que anuncia que se le esta agregando totopos a la hamburguesa
     */
    public String ponerTotopos() {
        return "Estoy poniendo los totopos";
    }

    /**
     * Método que simboliza agregarle crema con especias a la hamburguesa
     * @return Devuelve un String que anuncia que se le esta agregando crema con especies a la hamburguesa
     */
    public String ponerCremaConEspecias() {
        return "Estoy poniendo la crema con especias";
    }
}