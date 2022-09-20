package robot.estados.menus;

public class Hawaiana extends Hamburguesa {

    public Hawaiana(int id, String nombre, String descripcion, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        // Adentro del metodo se inicializa la variable OwO
        this.conQueso = true;
        this.vegetariana = false;
    }

    public Hawaiana() {
        this.id = 50;
        this.nombre = "Hamburguesa Hawaiana";
        this.descripcion = "Hamburguesa de res, jamon y pinia";
        this.precio = 40;
        this.conQueso=true;
        this.vegetariana=false;
    }

    @Override
    public String preparar(){
        String preparacion = this.ponerPan()+"\n"+this.ponerMayonesa()+"\n"+this.ponerMostaza()+"\n"+this.prepararProteina()+"\n"+this.ponerProteina()+"\n";
        if(this.conQueso)
            preparacion+=this.ponerQueso()+"\n";
        preparacion+=this.ponerPinia()+"\n"+this.ponerVegetales()+"\n"+this.ponerCatsup()+"\n"+this.ponerPan()+"\n";
        return preparacion;
    }

    @Override
    public String prepararProteina() {
        return "Estoy preparando la carne";
    }

    @Override
    public String ponerProteina() {
        return "Estoy poniendo la carne\n" + this.ponerJamon();
    }

    public String ponerJamon() {
        return "Estoy poniendo jamon";
    }

    public String ponerPinia() {
        return "Estoy poniendo pinia";
    }

}