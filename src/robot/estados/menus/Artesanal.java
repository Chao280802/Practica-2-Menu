package robot.estados.menus;

public class Artesanal extends Hamburguesa {

    public Artesanal(int id, String nombre, String descripcion, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        // Adentro del metodo se inicializa la variable OwO
        this.conQueso = true;
        this.vegetariana = false;
    }

    public Artesanal() {
        this.id = 202;
        this.nombre = "Hamburguesa artesanal";
        this.descripcion = "Hamburguesa de res alta calidad, aderezo de miel de la casa, jamon serrano, gratinada con queso parmesano  ";
        this.precio = 60;
        this.conQueso = true;
        this.vegetariana = false;
    }

    @Override
    public String preparar(){
        String preparacion = this.ponerPan()+"\n"+this.ponerMayonesa()+"\n"+this.ponerAderezoMiel()+"\n"+this.ponerMostaza()+"\n"+this.prepararProteina()+"\n"+this.ponerProteina()+"\n";
        if(this.conQueso)
            preparacion+=this.ponerParmesano()+"\n";
        preparacion+=this.ponerVegetales()+"\n"+this.ponerCatsup()+"\n"+this.ponerPan();
        return preparacion;
    }

    @Override
    public String prepararProteina() {
        return "Estoy preparando la carne de res premium\n";
    }

    @Override
    public String ponerProteina() {
        return "Estoy poniendo la carne de res premium" + this.ponerJamonSerrano();
    }

    public String ponerAderezoMiel() {
        return "Estoy poniendo el aderezo de miel";
    }

    public String ponerJamonSerrano() {
        return "Estoy poniendo el jamon serrano";
    }

    public String ponerParmesano() {
        return "Estoy gratinando todo de queso parmesano";
    }

}