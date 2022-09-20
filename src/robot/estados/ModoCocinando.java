package robot.estados;

import robot.McRobot;

/**
 * Clase que define el comportamiento del robot cuanto esta en modo:
 * "Cocinando".
 */
public class ModoCocinando implements EstadoRobot {

    McRobot robot;

    /**
     * Constructor del ModoCocinando asigna al robot que adquirirá este modo.
     * 
     * @param robot robot que adquirirá el modo.
     */
    public ModoCocinando(McRobot robot) {
        this.robot = robot;
    }

    /**
     * El robot se suspenderá si su estado actual se lo permite.
     */
    @Override
    public void suspender() {
        System.out.println("El robot no puede suspenderse si está cocinando y permanecerá en: ");
        System.out.println("**MODO COCINANDO**");
    }

    /**
     * El robot se activará si su estado actual se lo permite.
     */
    @Override
    public void activar() {
        System.out.println("El robot ya está activo y se encuentra en: ");
        System.out.println("**MODO COCINANDO**");
    }

    /**
     * El robot caminará si su estgado actual se lo permite.
     */
    @Override
    public void caminar() {
        System.out.println("El robot no puede caminar mientras está cocinando, permanecerá en: ");
        System.out.println("**MODO COCINANDO**");

    }

    /**
     * El robot tomará la orden del cliente si su estado actual se lo permite.
     */
    @Override
    public void tomarOrden() {
        System.out.println("El robot  aún sigue cocinando  y no puede tomar una nueva orden,  permanecerá en: ");
        System.out.println("**MODO COCINANDO**");

    }

    /**
     * El robot cocinará lo que el cliente pida, si su estado actual se lo permite.
     */
    @Override
    public void cocinar() {
        System.out.println("El robot ya se encuentra en: ");
        System.out.println("**MODO COCINANDO**");
    }

    /**
     * Elrobot entregará la orden al cliente si su estado actual se lo permite.
     */
    @Override
    public void entregarOrden() {
        System.out.println("El robot ha terminando de preparar el platillo, ahora lo entregará al cliente ");
        System.out.println("ñam ñam, el cliente se la come entera.");
        System.out.println("**MODO COCINANDO** ----> **MODO ENTREGAR ORDEN**");
        robot.asignaNuevoEstado(robot.getModoEntregarOrden());// Cambia a modo entregar orden
        System.out.println("Por el momento el robot no tiene pedidos y permanecerá en:");
        System.out.println("**MODO ENTREGAR ORDEN** ----> **MODO SUSPENDIDO**");
        robot.asignaNuevoEstado(robot.getModoSuspendido());// Pasa a suspendido
    }

    /**
     * Devuelve una cadena describiendo el estado del robot.
     * 
     * @return una cadena describiendo el estado del robot.
     */
    @Override
    public String toString() {
        return "El robot está en modo: **COCINANDO**";
    }

    /**
     * Imprime en pantalla como es que se va preparando el pedido del cliente.
     */
    public void prepararPedido() {
        System.out.println(robot.getOrden().preparar(robot.getOrden().conQueso(0), robot.getOrden().vegetariana(1)));
    }

}
