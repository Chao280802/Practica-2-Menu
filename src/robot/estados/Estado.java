package robot.estados;

import robot.estados.menus.*;

public interface Estado {
    void walkToClientsTable();
    MenuItem takeClientOrder(Menu menus);
    void cook(MenuItem item);
}