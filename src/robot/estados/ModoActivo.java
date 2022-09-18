package robot.estados;

import robot.estados.menus.*;

public class ModoActivo implements Estado {
    public void caminarHaciaElCliente(){}

    public MenuItem tomarOrden(Menu menus){
	    return null;
    }

    public void cocinar(MenuItem item){}

    public void suspender(){}
}