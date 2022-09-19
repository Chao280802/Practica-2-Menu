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
    public String prepararProteina() {

        return "Estoy preparando la carne de alta calidad";
    }

    @Override
    public String ponerProteina() {

        return "Estoy poniendo la carne premium";
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