package robot.estados.menus;

public class DosCarnes extends Hamburguesa {

    public DosCarnes(int id, String nombre, String descripcion, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        // Adentro del metodo se inicializa la variable OwO
        this.conQueso=false;
        this.vegetariana=false;
    }

    public DosCarnes() {
        this.id = 100;
        this.nombre = "Hamburguesa dos carnes";
        this.descripcion = "Hamburguesa de res combinada con pechuga de pollo endulzada con salsa agridulce";
        this.precio = 50;
        this.conQueso=false;
        this.vegetariana=false;
    }

    @Override
    public String preparar(){
        String preparacion = this.ponerPan()+"\n"+this.ponerMayonesa()+"\n"+this.ponerMostaza()+"\n"+this.prepararProteina()+"\n"+this.ponerProteina()+"\n";
        if(this.conQueso)
            preparacion+=this.ponerQueso()+"\n";
        preparacion+=this.ponerVegetales()+"\n"+this.ponerCatsup()+"\n"+this.ponerSalsaAgrigulce()+"\n"+this.ponerPan()+"\n";
        return preparacion;
    }

    @Override
    public String prepararProteina() {
        return "Estoy preparando la carne";
    }

    @Override
    public String ponerProteina() {
            return "Estoy poniendo la  carne \n" + this.ponerPollo();
    }

    public String ponerPollo() {
        return "Estoy poniendo el pollo";
    }

    public String ponerSalsaAgrigulce() {
        return "Estoy poniendo la salsa agridulce";
    }

}