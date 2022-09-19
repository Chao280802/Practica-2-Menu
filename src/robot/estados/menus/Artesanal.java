package robot.estados.menus;

public class Artesanal extends Hamburguesa {

    public Artesanal(int id, String nombre, String descripcion, int precio, int conQuesoRespuesta,
            int vegetarianaRespuesta) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        // Adentro del metodo se inicializa la variable OwO
        this.conQueso(conQuesoRespuesta);
        this.vegetariana(vegetarianaRespuesta);
    }

    public Artesanal() {
        this.id = 202;
        this.nombre = "Hamburguesa artesanal";
        this.descripcion = "Hamburguesa de res alta calidad, aderezo de miel de la casa, jamon serrano, gratinada con queso parmesano  ";
        this.precio = 60;

    }

    @Override
    public String preparar(boolean conQueso, boolean vegetariana){
        String preparacion = this.ponerPan()+"\n"+this.ponerMayonesa()+"\n"+this.ponerMostaza()+"\n"+this.prepararProteina()+"\n"+this.ponerProteina()+"\n";
        if(this.conQueso)
            preparacion+=this.ponerQueso()+"\n";
        preparacion+=this.ponerVegetales()+"\n"+this.ponerCatsup()+"\n"+this.ponerPan();
        return preparacion;
    }

    @Override
    public String prepararProteina() {
        if(!this.vegetariana)
            return "Estoy preparando la carne de res premium";
        return "Estoy preparando una carne de soya premium";
    }

    @Override
    public String ponerProteina() {
        if(!this.vegetariana)
            return "Estoy poniendo la carne de res premium";
        return "Estoy poniendo carne de soya premium";
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