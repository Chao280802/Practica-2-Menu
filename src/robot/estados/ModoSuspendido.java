package robot.estados;

import robot.estados.menus.*;
import states.menus.Hamburguesa;

public class ModoSuspendido implements Estado {
    public void caminarHaciaElCliente() {
    }

    public Hamburguesa tomarOrden(Menu menus) {
        return null;
    }

    public void cocinar(Hamburguesa item) {
    }

    public void activar() {
    }
}
