package robot.estados.menus;

public class Cubana extends Hamburguesa {

    public Cubana(int id, String nombre, String descripcion, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        // Adentro del metodo se inicializa la variable OwO
        this.conQueso = true;
        this.vegetariana = false;
    }

    public Cubana() {
        this.id = 101;
        this.nombre = "Hamburguesa Cubana";
        this.descripcion = "Hamburguesa de res combinada con huevo y salchicha. Con una porcion de salsa picante ";
        this.precio = 50;
        this.conQueso = true;
        this.vegetariana = false;
    }

    @Override
    public String preparar(){
        String preparacion = this.ponerPan()+"\n"+this.ponerMayonesa()+"\n"+this.ponerMostaza()+"\n"+this.ponerHuevo()+"\n"+this.prepararProteina()+"\n"+this.ponerProteina()+"\n"+this.ponerHuevo()+"\n";
        if(this.conQueso)
            preparacion+=this.ponerQueso()+"\n";
        preparacion+=this.ponerVegetales()+"\n"+this.ponerCatsup()+"\n"+this.ponerSalsaPicante()+"\n"+this.ponerPan();
        return preparacion;
    }

    @Override
    public String prepararProteina() {
        return "Estoy preparando la carne";
    }

    @Override
    public String ponerProteina() {
        return "Estoy poniendo la carne\n" + this.ponerSalchicha();
    }

    public String ponerSalchicha() {
        return "Estoy poniendo las salchichas";
    }

    public String ponerHuevo() {
        return "Estoy poniendo el huevo";
    }

    public String ponerSalsaPicante() {
        return "Estoy poniendo la salsa picante";
    }
}