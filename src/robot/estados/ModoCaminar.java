package robot.estados;

import robot.McRobot;

public class ModoCaminar implements EstadoRobot{

    McRobot robot;

    /**
     * Constructor del ModoCaminar asigna al robot que adquirirá este modo
     * @param robot robot que adquirirá el modo
     */
    public ModoCaminar(McRobot robot){
        this.robot = robot;
    }

    @Override
    public void suspender() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void activar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void caminar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void tomarOrden() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void cocinar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void entregarOrden() {
        // TODO Auto-generated method stub
        
    }
    
}
