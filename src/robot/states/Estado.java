package robot.states;

import robot.states.menus.*;

public interface Estado {
    void walkToClientsTable();
    MenuItem takeClientOrder(Menu menus);
    void cook(MenuItem item);
}