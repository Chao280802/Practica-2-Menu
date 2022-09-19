import robot.McRobot;

public class Main {

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        McRobot robot = new McRobot();

        System.out.println("Bienvenido al restaurante McHamburgesas...");
        System.out.println("Nuestro McRobot lo estará atendiendo");
        System.out.println("Actualmenete el robot esta en modo " + robot.getEstadoActual());
    }
}