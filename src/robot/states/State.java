package robot.states;

import robot.states.menus.*;

public interface State {
    void walkToClientsTable();
    MenuItem takeClientOrder(Menu menus);
    void cook(MenuItem item);
}