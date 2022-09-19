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
            System.out.println("Ahora el robot esta en: **MODO CAMINAR**");
        } else {
            System.out.println("No ha llegado ningún cliente, el  robot  no puede caminar, permanecerá " + 
                "en: **MODO ACTIVO** ");
        }
    }

    @Override
    public void tomarOrden() {
        System.out.println("El  robot no está en la mesa de ningún cliente y no puede tomar " +
            "ninguna orden");
        System.out.println("El robot  permanecerá en: **MODO ACTIVO**");
    }

    @Override
    public void cocinar() {
        System.out.println("El robot no ha tomado ningunan orden y por lo tanto no puede cocinar " +
            " permanecerá en: **MODO ACTIVO**");
    }

    @Override
    public void entregarOrden() {
        System.out.println("El robot no ha cocinado nada y por lo tanto " + 
            " permanerá en: **MODO ACTIVO**");

    }

    @Override
    public String toString() {
        return "El robot está en modo: **ACTIVO**";
    }

}
