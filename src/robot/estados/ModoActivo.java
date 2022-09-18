package robot.estados;

import robot.estados.menus.*;

public class ModoActivo implements Estado {
    public void walkToClientsTable(){}

    public MenuItem takeClientOrder(Menu menus){
	    return null;
    }

    public void cook(MenuItem item){}

    public void suspend(){}
}