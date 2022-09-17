package states;

import states.menus.*;

public class SuspendMode implements State {
    public void walkToClientsTable(){}

    public MenuItem takeClientOrder(Menu menus){
	    return null;
    }

    public void cook(MenuItem item){}

    public void activate(){}
}
