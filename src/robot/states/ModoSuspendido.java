package robot.states;

import robot.states.menus.*;

public class ModoSuspendido implements Estado {
    public void walkToClientsTable(){}

    public MenuItem takeClientOrder(Menu menus){
	    return null;
    }

    public void cook(MenuItem item){}

    public void activate(){}
}
