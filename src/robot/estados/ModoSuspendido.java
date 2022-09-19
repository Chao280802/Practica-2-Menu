package robot.estados;

import robot.McRobot;

/**
 * Clase que define el comportamiento del robot cuanto esta en modo: "Suspendido".
 */
public class ModoSuspendido implements EstadoRobot{

    McRobot robot;

    /**
     * Constructor del ModoSuspendido asigna al robot que adquirirá este modo
     * @param robot robot que adquirirá el modo
     */
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
            robot.asignaNuevoEstado(robot.getModoActivo());
            System.out.println("**MODO SUSPENDIDO ----> MODO ACTIVO**");
            System.out.println("Ahora el robot está en: **MODO ACTIVO**");
        } else {
            System.out.println("Aún no ha llegado un cliente el robot seguirá en: **MODO SUSPENDIDO**");
        }
    }

    @Override
    public void caminar() {
        System.out.println("El robot está en: **MODO SUSPENDIDO** y NO puede ponerse a Caminar.");
    }

    @Override
    public void tomarOrden() {
        System.out.println("El robot está en: **MODO SUSPENDIDO** y NO puede Tomar ordenes");
    }

    @Override
    public void cocinar() {
        System.out.println("El robot está en: **MODO SUSPENDIDO y NO puede ponerse a Cocinar");        
    }

    @Override
    public void entregarOrden() {
        System.out.println("El robot está en: **MODO SUSPENDIDO y NO puede entregar Ordenes.");
    }
    
}
