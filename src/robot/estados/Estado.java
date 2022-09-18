package robot.estados;

import robot.estados.menus.*;

public interface Estado {
    void caminarHaciaElCliente();
    MenuItem tomarOrden(Menu menus);
    void cocinar(MenuItem item);
}