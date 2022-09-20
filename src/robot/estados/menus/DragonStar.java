package robot.estados.menus;

public class DragonStar extends Hamburguesa {

    public DragonStar(int id, String nombre, String descripcion, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        // Adentro del metodo se inicializa la variable OwO
        this.conQueso = false;
        this.vegetariana = true;
    }

    public DragonStar() {
        this.id = 201;
        this.nombre = "Hamburguesa dragonStar";
        this.descripcion = "Hamburguesa de pastor de soya, con jalapenio, una sazonada de miel para darle una sensacion unica. Empanizada completa";
        this.precio = 60;
        this.conQueso = false;
        this.vegetariana = true;
    }

    @Override
    public String preparar(){
        String preparacion = this.ponerPan()+"\n"+this.ponerMayonesa()+"\n"+this.ponerMostaza()+"\n"+this.ponerJalapenio()+"\n"+this.prepararProteina()+"\n"+this.ponerProteina()+"\n";
        if(this.conQueso)
            preparacion+=this.ponerQueso()+"\n";
        preparacion+=this.ponerVegetales()+"\n"+this.ponerCatsup()+"\n"+this.ponerMiel()+"\n"+this.ponerPan()+"\n"+this.empanizandolaEntera()+"\n";
        return preparacion;
    }

    @Override
    public String prepararProteina() {
        return "Estoy preparando el sustituto de carne al pastor";
    }

    @Override
    public String ponerProteina() {
        return "Estoy poniendo el sustituto de carne al pastor";
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