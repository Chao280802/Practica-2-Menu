import robot.McRobot;
import java.util.Scanner;

/**
 * Clase principal del restaurante McHamburgesas
 */
public class Main {

    public static void main(String[] args) {
        McRobot robot = new McRobot();

        System.out.println("Bienvenido al restaurante McHamburgesas...");
        System.out.println("Nuestro McRobot lo estará atendiendo");
        System.out.println("Actualmenete " + robot.getEstadoActual());
        System.out.println("Por favor elige la opción que deseas ejecutar: ");
        Scanner sc = new Scanner(System.in); 
        int opcion;

        do {
            System.out.println(
                "1 .- **MODO ACTIVO** \n" + 
                "2 .- **MODO SUSPENDIDO** \n" + 
                "3 .- **MODO CAMINAR** \n" +  
                "4 .- **MODO TOMAR ORDEN** \n" +
                "5 .- **MODO COCINAR** \n" +
                "6 .- **MODO ENTREGAR ORDEN \n" + 
                "7 .- **SALIR** \n");

                while (true) {
                    try {
                        String opcionUsser = sc.nextLine();
                        opcion = Integer.parseInt(opcionUsser);
                        break;
                    } catch (NumberFormatException nfe) {
                        System.out.println("Por favor elige una opción VALIDA \n" +
                            "1 .- **MODO ACTIVO** \n" + 
                            "2 .- **MODO SUSPENDIDO** \n" + 
                            "3 .- **MODO CAMINAR** \n" +  
                            "4 .- **MODO TOMAR ORDEN** \n" +
                            "5 .- **MODO COCINAR** \n" +
                            "6 .- **MODO ENTREGAR ORDEN** \n" + 
                            "7 .- **SALIR** \n"); 
                    }
                }

            switch (opcion) {
                case 1:
                    robot.activar();
                    break;
                case 2:
                    robot.suspender();
                    break;

                case 3:
                    robot.caminar();
                    break;

                case 4:
                    robot.tomarOrden();
                    break;

                case 5:
                    robot.cocinar();
                    break;

                case 6:
                    robot.entregarOrden();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Por favor elige la opción que deseas ejecutar " );
                    break;
            }

        } while (opcion != 7);
    }
}