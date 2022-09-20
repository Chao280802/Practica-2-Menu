package robot.estados;

import robot.McRobot;
import java.util.LinkedList;
import robot.estados.menus.Menu;

/**
 * Clase que define el comportamiento del robot cuanto esta en modo:
 * "Caminar".
 */
public class ModoCaminar implements EstadoRobot {

    McRobot robot;

    /**
     * Constructor del ModoCaminar asigna al robot que adquirirá este modo.
     * 
     * @param robot robot que adquirirá el modo.
     */
    public ModoCaminar(McRobot robot) {
        this.robot = robot;
    }

    /**
     * El robot se suspenderá si su estado actual se lo permite.
     */
    @Override
    public void suspender() {
        System.out.println("El robot pasará a modo suspendido ");
        System.out.println("**MODO CAMINAR** ----> **MODO SUSPENDER**");
        robot.asignaNuevoEstado(robot.getModoSuspendido());
    }

    /**
     * El robot se activará si su estado actual se lo permite.
     */
    @Override
    public void activar() {
        System.out.println("El robot ya está encendido, permanecerá en: " + 
            "**MODO CAMINANR**");

    }

    /**
     * El robot caminará si su estgado actual se lo permite.
     */
    @Override
    public void caminar() {
        System.out.println("El  robot  ya  está en:  **MODO CAMINANNDO**");

    }

    /**
     * El robot tomará la orden del cliente si su estado actual se lo permite.
     */
    @Override
    public void tomarOrden() {
        System.out.println("El robot  ha llegado a  la mesa del cliente y tomará su orden.");
        robot.asignaNuevoEstado(robot.getModoTomarOrden());
        System.out.println("**MODO CAMINAR** ----> **MODO TOMAR ORDEN**");
        ModoTomarOrden modoTomarOrden = (ModoTomarOrden) robot.getModoTomarOrden();
        modoTomarOrden.leerMenu();
        modoTomarOrden.registraOrden();
    }

    /**
     * El robot cocinará lo que el cliente pida, si su estado actual se lo permite.
     */
    @Override
    public void cocinar() {
        System.out.println("El robot no puede cocinar mientras camina, permanecerá en:");
        System.out.println("**MODO CAMINAR**");

    }

    /**
     * Elrobot entregará la orden al cliente si su estado actual se lo permite.
     */
    @Override
    public void entregarOrden() {
        System.out.println("El  robot  aun no está en la mesa del cliente.");
    }

    /**
     * Devuelve una cadena describiendo el estado del robot.
     * 
     * @return una cadena describiendo el estado del robot.
     */
    @Override
    public String toString() {
        return "El robot está en modo: **CAMINAR**";
    }

}
