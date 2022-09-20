package robot.estados.menus;

/**
 * Clase Hawaiana que extiende la clase abstracta Hamburguesa e implementa las caracteristicas principales de una hamburguesa hawaiana
 * @author Chao2808 Heigz RodrigoSanchez06
 * @version (19 Septiembre 2022)
 * @see Menu
 * @see Hamburguesa
 */
public class Hawaiana extends Hamburguesa {

    /**
     * Constructor por omisión que instancia una hamburguesa hawaiana con sus caracteristicas predefinidas
     */
    public Hawaiana() {
        this.id = 50;
        this.nombre = "Hamburguesa Hawaiana";
        this.descripcion = "Hamburguesa de res, jamon y pinia";
        this.precio = 40;
        this.conQueso=true;
        this.vegetariana=false;
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
        preparacion+=this.ponerPinia()+"\n"+this.ponerVegetales()+"\n"+this.ponerCatsup()+"\n"+this.ponerPan()+"\n";
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
        return "Estoy poniendo la carne\n" + this.ponerJamon();
    }

    /**
     * Método que simboliza agregarle jamon a la hamburguesa
     * @return Devuelve un String que anuncia que se le esta agregando jamon a la hamburguesa
     */
    public String ponerJamon() {
        return "Estoy poniendo jamon";
    }

    /**
     * Método que simboliza agregarle pinia a la hamburguesa
     * @return Devuelve un String que anuncia que se le esta agregando pinia a la hamburguesa
     */
    public String ponerPinia() {
        return "Estoy poniendo pinia";
    }

}