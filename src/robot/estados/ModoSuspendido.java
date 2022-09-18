package robot.estados;

import robot.estados.menus.*;

public class ModoSuspendido implements Estado {
    public void caminarHaciaElCliente(){}

    public MenuItem tomarOrden(Menu menus){
	    return null;
    }

    public void cocinar(Hamburgesa item){}

    public void activar(){}
}
