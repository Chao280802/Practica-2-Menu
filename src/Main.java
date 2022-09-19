import robot.McRobot;
import java.util.Scanner;

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
        System.out.println("Por favor elige la opción que deseas ejecutar: ");
        Scanner sc = new Scanner(System.in); 
        int opcion;

        do {
            System.out.println(
                "1 .- **MODO ACTIVO**" + 
                "2 .- **MODO SUSPENDIDO**" + 
                "3 .- **MODO CAMINAR**" +  
                "4 .- **MODO TOMAR ORDEN**" +
                "5 .- **MODO COCINAR**" +
                "6 .- **MODO ENTREGAR ORDEN" + 
                "7 .- **SALIR**");

                while (true) {
                    try {
                        String opcionUsser = sc.nextLine();
                        opcion = Integer.parseInt(opcionUsser);
                        break;
                    } catch (NumberFormatException nfe) {
                        System.out.println("Por favor elige una opción VALIDA " +
                            "1 .- **MODO ACTIVO**" + 
                            "2 .- **MODO SUSPENDIDO**" + 
                            "3 .- **MODO CAMINAR**" +  
                            "4 .- **MODO TOMAR ORDEN**" +
                            "5 .- **MODO COCINAR**" +
                            "6 .- **MODO ENTREGAR ORDEN" + 
                            "7 .- **SALIR**"); 
                    }
                }

            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;
                case 7:

                    break;
                default:
                    System.out.println("Por favor elige la opción que deseas ejecutar " );
                    break;
            }

        } while (true);
    }
}