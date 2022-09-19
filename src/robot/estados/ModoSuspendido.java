package robot.estados;

import robot.McRobot;

/**
 * Clase que define el comportamiento del robot cuanto esta en modo:
 * "Suspendido".
 */
public class ModoSuspendido implements EstadoRobot {

    McRobot robot;

    /**
     * Constructor del ModoSuspendido asigna al robot que adquirirá este modo
     * 
     * @param robot robot que adquirirá el modo
     */
    public ModoSuspendido(McRobot robot) {
        this.robot = robot;
    }

    /**
     * El robot se suspenderá si su estado actual se lo permite.
     */
    @Override
    public void suspender() {
        System.out.println("El robot ya está suspendido...");
    }

    /**
     * El robot se activará si su estado actual se lo permite.
     */
    @Override
    public void activar() {
        robot.asignaNuevoEstado(robot.getModoActivo());
        System.out.println("**MODO SUSPENDIDO ----> MODO ACTIVO**");
        System.out.println("Ahora el robot está en: **MODO ACTIVO**");
    }

    /**
     * El robot caminará si su estgado actual se lo permite.
     */
    @Override
    public void caminar() {
        System.out.println("El robot está en: **MODO SUSPENDIDO** y NO puede ponerse a Caminar.");
    }

    /**
     * El robot tomará la orden del cliente si su estado actual se lo permite.
     */
    @Override
    public void tomarOrden() {
        System.out.println("El robot está en: **MODO SUSPENDIDO** y NO puede Tomar ordenes");
    }

    /**
     * El robot cocinará lo que el cliente pida, si su estado actual se lo permite.
     */
    @Override
    public void cocinar() {
        System.out.println("El robot está en: **MODO SUSPENDIDO y NO puede ponerse a Cocinar");
    }

    /**
     * Elrobot entregará la orden al cliente si su estado actual se lo permite.
     */
    @Override
    public void entregarOrden() {
        System.out.println("El robot está en: **MODO SUSPENDIDO y NO puede entregar Ordenes.");
    }

    /**
     * Devuelve una cadena describiendo el estado del robot.
     * 
     * @return una cadena describiendo el estado del robot.
     */
    @Override
    public String toString() {
        return "El robot está en modo **SUSPENDIDO**";
    }
}