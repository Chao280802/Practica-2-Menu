package robot.estados;

import robot.McRobot;

/**
 * Clase que define el comportamiento del robot cuanto esta en modo:
 * "TomarOrden".
 */
public class ModoTomarOrden implements EstadoRobot {

    McRobot robot;

    /**
     * Constructor del ModoEntregarOrden asigna al robot que adquirirá este modo.
     * 
     * @param robot robot que adquirirá el modo.
     */
    public ModoTomarOrden(McRobot robot) {
        this.robot = robot;
    }

    /**
     * El robot se suspenderá si su estado actual se lo permite.
     */
    @Override
    public void suspender() {
        System.out.println("El robot está  tomado una orden y no puede suspenderse, permanecera en: ");
        System.out.println("**MODO TOMAR ORDEN**");

    }

    /**
     * El robot se activará si su estado actual se lo permite.
     */
    @Override
    public void activar() {
        System.out.println("El robot ya está activo y está en: ");
        System.out.println("**MODO TOMAR ORDEN**");

    }

    /**
     * El robot caminará si su estgado actual se lo permite.
     */
    @Override
    public void caminar() {
        System.out.println("El robot no puede caminar mientras toma una orden permanencerá en: ");
        System.out.println("**MODO TOMAR ORDEN**");
    }

    /**
     * El robot tomará la orden del cliente si su estado actual se lo permite.
     */
    @Override
    public void tomarOrden() {
        System.out.println("El robot ya está tomando una orden");
    }

    /**
     * El robot cocinará lo que el cliente pida, si su estado actual se lo permite.
     */
    @Override
    public void cocinar() {
        System.out.println("El robot ya termió de tomar la orden y se pondrá a cocinar: ");
        robot.asignaNuevoEstado(robot.getModoCocinar());
        System.out.println("MODO TOMAR ORDENN ----> MODO COCINAR");
    }

    /**
     * Elrobot entregará la orden al cliente si su estado actual se lo permite.
     */
    @Override
    public void entregarOrden() {
        System.out.println("El robot no puede entregar una orden porque está tomando una orden, permanecerá en: ");
        System.out.println("**MODO TOMAR ORDEN**");
    }

    /**
     * Devuelve una cadena describiendo el estado del robot.
     * 
     * @return una cadena describiendo el estado del robot.
     */
    @Override
    public String toString() {
        return "El robot está en modo **MODO TOMAR ORDEN**";
    }

}
