package robot.estados.menus;

public class Hawaiana extends Hamburguesa {

    public Hawaiana(int id, String nombre, String descripcion, int precio, int conQuesoRespuesta,
            int vegetarianaRespuesta) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        // Adentro del metodo se inicializa la variable OwO
        this.conQueso(conQuesoRespuesta);
        this.vegetariana(vegetarianaRespuesta);
    }

    public Hawaiana() {
        this.id = 50;
        this.nombre = "Hamburguesa Hawaiana";
        this.descripcion = "Hamburguesa de res, jamon y pinia";
        this.precio = 40;

    }

    @Override
    public String preparar(boolean conQueso, boolean vegetariana){
        String preparacion = this.ponerPan()+"\n"+this.ponerMayonesa()+"\n"+this.ponerMostaza()+"\n"+this.prepararProteina()+"\n"+this.ponerProteina()+"\n";
        if(this.conQueso)
            preparacion+=this.ponerQueso()+"\n";
        preparacion+=this.ponerPinia()+"\n"+this.ponerVegetales()+"\n"+this.ponerCatsup()+"\n"+this.ponerPan()+"\n";
        return preparacion;
    }

    @Override
    public String prepararProteina() {
        if (!this.vegetariana)
            return "Estoy preparando la carne";
        return "Estoy preparando el sustituto de carne";
    }

    @Override
    public String ponerProteina() {
        if (!this.vegetariana)
            return "Estoy poniendo la carne\n" + this.ponerJamon();
        return "Estoy poniendo el sustituto de carne";
    }

    public String ponerJamon() {
        return "Estoy poniendo jamon";
    }

    public String ponerPinia() {
        return "Estoy poniendo pinia";
    }

}