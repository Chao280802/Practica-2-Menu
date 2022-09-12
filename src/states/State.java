package states;

import menus.*;

public interface State {
    void walkToClientsTable();
    MenuItem takeClientOrder(Menu menus);
    void cook(MenuItem item);
}
