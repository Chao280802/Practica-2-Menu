package robot.estados;

import robot.McRobot;

/**
 * Clase que define el comportamiento del robot cuanto esta en modo:
 * "EntregarOrden".
 */
public class ModoEntregarOrden implements EstadoRobot {

    McRobot robot;

    /**
     * Constructor del ModoEntregarOrden asigna al robot que adquirirá este modo
     * 
     * @param robot robot que adquirirá el modo
     */
    public ModoEntregarOrden(McRobot robot) {
        this.robot = robot;
    }

    @Override
    public void suspender() {
        System.out.println("El robot  está entregandno una orden  y no puede suspenderse, permanecera en: ");
        System.out.println("**MODO ENTREGAR ORDEN**");
    }

    @Override
    public void activar() {
        System.out.println("El robot ya esta activo y esta en: ");
        System.out.println("**MODO  ENTREGAR ORDEN**");

    }

    @Override
    public void caminar() {
        System.out.println("El robot no puede caminar porque no ha terminado de entregar la orden: ");
        System.out.println("**MODO ENTREGAR ORDEN**");
    }

    @Override
    public void tomarOrden() {
        System.out.println("EL robot no puede tomar una orden, porque ya está entregando una permanecerá en: ");
        System.out.println("**MODO ENTREGAR ORDEN**");
    }

    @Override
    public void cocinar() {
        System.out.println("El robot no puede cocinar porque está entregando una orden, permanecerá en: ");
        System.out.println("**MODO ENTREGAR ORDEN**");
    }

    @Override
    public void entregarOrden() {
        System.out.println("El robot ya está en: ");
        System.out.println("**MODO ENTREGAR ORDEN**");
    }

    @Override
    public String toString() {
        return "El robot está en modo: **MODO ENTREGAR ORDEN**";
    }

}
