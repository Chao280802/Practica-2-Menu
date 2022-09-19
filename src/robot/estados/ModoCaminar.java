package robot.estados;

import robot.McRobot;

public class ModoCaminar implements EstadoRobot {

    McRobot robot;

    /**
     * Constructor del ModoCaminar asigna al robot que adquirirá este modo
     * 
     * @param robot robot que adquirirá el modo
     */
    public ModoCaminar(McRobot robot) {
        this.robot = robot;
    }

    @Override
    public void suspender() {
        System.out.println("El robot pasará a modo suspendido ");
        System.out.println("**MODO CAMINAR** ----> **MODO SUSPENDER**");
        robot.asignaNuevoEstado(robot.getModoSuspendido());
    }

    @Override
    public void activar() {
        System.out.println("El robot ya está encendido, permanecerá en: " + 
            "**MODO CAMINANR**");

    }

    @Override
    public void caminar() {
        System.out.println("El  robot  ya  está en:  **MODO CAMINANNDO**");

    }

    @Override
    public void tomarOrden() {
        if(robot.getRobotMesaCliente()){
            System.out.println("El robot  ha llegado a  la mesa del cliente y tomará su orden.");
            robot.asignaNuevoEstado(robot.getModoTomarOrden());
            System.out.println("**MODO CAMINAR** ----> **MODO TOMAR ORDEN**");
        } else {
            System.out.println("El robot aún no llega a la mesa del cliente permanecerá en: ");
            System.out.println(" **MODO CAMINAR**");
        }
    }

    @Override
    public void cocinar() {
        System.out.println("El robot no puede cocinar mientras camina, permanecerá en:");
        System.out.println("**MODO CAMINAR**");

    }

    @Override
    public void entregarOrden() {
        System.out.println("El  robot  aun no está en la mesa del cliente.");
    }

    @Override
    public String toString() {
        return "El robot está en modo: **CAMINAR**";
    }

}
