package robot.estados;

import robot.McRobot;

/**
 * Clase que define el comportamiento del robot cuanto esta en modo: "Activo".
 */
public class ModoActivo implements EstadoRobot {

    McRobot robot;

    /**
     * Constructor del ModoActivo asigna al robot que adquirirá este modo
     * 
     * @param robot robot que adquirirá el modo
     */
    public ModoActivo(McRobot robot) {
        this.robot = robot;
    }

    @Override
    public void suspender() {
        if (!robot.getHayCliente()) {
            robot.asignaNuevoEstado(robot.getModoSuspendido());
            System.out.println("El Robot ha completado todas sus tareas: **MODO ACTIVO -----> MODO SUSPENDIDO**");
            System.out.println("Ahora el Robot está en: **MODO SUSPENDIDO**");
        } else {
            System.out.println("Aún hay tareas en curso y el robot no se puede suspender seguirá en: **MODO ACTIVO**.");
        }
    }

    @Override
    public void activar() {
        System.out.println("El Robot ya está en: **MODO ACTIVO**");
    }

    @Override
    public void caminar() {
        if (robot.getHayCliente()) {
            robot.asignaNuevoEstado(robot.getModoCaminar());
            System.out.println("El robot caminará hacia la mesa del cliente:");
        }
    }

    @Override
    public void tomarOrden() {
        if (robot.getRobotMesaCliente()) {
            System.out.println("El robot tomará la orden del cliente: ");
        }

    }

    @Override
    public void cocinar() {
        // TODO Auto-generated method stub

    }

    @Override
    public void entregarOrden() {
        // TODO Auto-generated method stub

    }

    @Override
    public String toString() {
        return "El robot está en modo: **ACTIVO**";
    }

}
