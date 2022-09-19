package robot.estados;

import robot.estados.menus.*;

public interface Estado {
    void caminarHaciaElCliente();

    Hamburguesa tomarOrden(Menu menus);

    void cocinar(Hamburguesa item);
}