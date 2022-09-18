package robot.states;

import robot.states.menus.*;

public class ActiveMode implements State {
    public void walkToClientsTable(){}

    public MenuItem takeClientOrder(Menu menus){
	    return null;
    }

    public void cook(MenuItem item){}

    public void suspend(){}
}