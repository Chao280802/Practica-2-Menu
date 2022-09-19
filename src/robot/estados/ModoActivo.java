package robot.estados;

import robot.McRobot;
import java.util.LinkedList;
import robot.estados.menus.Menu;

/**
 * Clase que define el comportamiento del robot cuanto esta en modo: "Activo".
 */
public class ModoActivo implements EstadoRobot {

    McRobot robot;

    /**
     * Constructor del ModoActivo asigna al robot que adquirirá este modo.
     * 
     * @param robot robot que adquirirá el modo.
     */
    public ModoActivo(McRobot robot) {
        this.robot = robot;
    }

    /**
     * El robot se suspenderá si su estado actual se lo permite.
     */
    @Override
    public void suspender() {
            robot.asignaNuevoEstado(robot.getModoSuspendido());    
            System.out.println("El Robot ha completado todas sus tareas: **MODO ACTIVO -----> MODO SUSPENDIDO**");
            System.out.println("Ahora el Robot está en: **MODO SUSPENDIDO**");
    }

    /**
     * El robot se activará si su estado actual se lo permite.
     */
    @Override
    public void activar() {
        
        System.out.println("El Robot ya está en: **MODO ACTIVO**");
    }

    /**
     * El robot caminará si su estgado actual se lo permite.
     */
    @Override
    public void caminar() {
        robot.asignaNuevoEstado(robot.getModoCaminar());
        System.out.println("El robot caminará hacia la mesa del cliente:");
        System.out.println("Ahora el robot esta en: **MODO CAMINAR**");
    }

    /**
     * El robot tomará la orden del cliente si su estado actual se lo permite.
     */
    @Override
    public void tomarOrden() {
        System.out.println("El  robot no está en la mesa de ningún cliente y no puede tomar " +
            "ninguna orden");
        System.out.println("El robot  permanecerá en: **MODO ACTIVO**");
    }

    /**
     * El robot cocinará lo que el cliente pida, si su estado actual se lo permite.
     */
    @Override
    public void cocinar() {
        System.out.println("El robot no ha tomado ningunan orden y por lo tanto no puede cocinar " +
            " permanecerá en: **MODO ACTIVO**");
    }

    /**
     * Elrobot entregará la orden al cliente si su estado actual se lo permite.
     */
    @Override
    public void entregarOrden() {
        System.out.println("El robot no ha cocinado nada y por lo tanto " + 
            " permanerá en: **MODO ACTIVO**");

    }

    /**
     * Devuelve una cadena describiendo el estado del robot.
     * 
     * @return una cadena describiendo el estado del robot.
     */
    @Override
    public String toString() {
        return "El robot está en modo: **ACTIVO**";
    }

}