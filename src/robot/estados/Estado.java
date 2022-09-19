package robot.estados;

import robot.estados.menus.*;
import states.menus.Hamburguesa;

public interface Estado {
    void caminarHaciaElCliente();

    Hamburguesa tomarOrden(Menu menus);

    void cocinar(Hamburguesa item);
}