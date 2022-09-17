package robot.estados;

import robot.McRobot;

public class ModoSuspendido implements EstadoRobot{

    McRobot robot;

    public ModoSuspendido(McRobot robot){
        this.robot = robot;
    }

    @Override
    public void suspender() {
        System.out.println("El robot ya está suspendido...");
    }

    @Override
    public void activar() {
        if(robot.getHayCliente()){
           // robot.asignaNuevoEstado();
        }
    }

    @Override
    public void caminar() {
        
    }

    @Override
    public void tomarOrden() {
        
    }

    @Override
    public void cocinar() {
        
    }

    @Override
    public void entregarOrden() {
        
    }
    
}
