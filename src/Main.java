import robot.McRobot;
import robot.estados.menus.DeLujo;
import robot.estados.menus.Menu;
import robot.estados.menus.Tradicional;
import robot.estados.menus.Versatil;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Práctica 2 -- Mc Hamborgesa
 * 
 * Created on Sep 19, 2022.
 * 
 * @author Aguirre Morales Gael Alejandro 319165704
 * @author Romero Cruz Fernando 319314256
 * @author Sánchez Nava Rodrigo 319222571
 */
public class Main {

    public static void main(String[] args) {

        Menu deLujoMenu = new DeLujo();// Creamos menu de lujo
        Menu versatilMenu = new Versatil(); // Creamos menu versátil
        Menu tradicionalMenu = new Tradicional(); // Creamos menu tradicional

        LinkedList<Menu> subMenus = submenus(deLujoMenu, versatilMenu, tradicionalMenu);

        McRobot robot = new McRobot(subMenus); // Le pasamos la estructura de los menús

        System.out.println("Bienvenido al restaurante McHamburgesas...");
        System.out.println("Nuestro McRobot lo estará atendiendo");
        System.out.println("Actualmenete " + robot.getEstadoActual());
        System.out.println("Por favor elige la opción que deseas ejecutar: ");
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println( // Valida entrada.
                    "1 .- **MODO ACTIVO** \n" +
                            "2 .- **MODO SUSPENDIDO** \n" +
                            "3 .- **MODO CAMINAR** \n" +
                            "4 .- **MODO TOMAR ORDEN** \n" +
                            "5 .- **MODO COCINAR** \n" +
                            "6 .- **MODO ENTREGAR ORDEN** \n" +
                            "7 .- **SALIR** \n");

            while (true) {
                try {
                    String opcionUsser = sc.nextLine();
                    opcion = Integer.parseInt(opcionUsser);
                    break;
                } catch (NumberFormatException nfe) { // Valida entrada.
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
                    System.out.println("Por favor elige la opción que deseas ejecutar ");
                    break;
            }

        } while (opcion != 7);
        sc.close();
    }

    /**
     * Crea una linkedList con los diferentes menus que existen.
     * 
     * @param deLujo      menu de lujo.
     * @param versatil    menu versatil.
     * @param Tradicional menu tradicional.
     * @return lista con todos los menus que existen.
     */
    public static LinkedList<Menu> submenus(Menu deLujo, Menu versatil, Menu Tradicional) {
        LinkedList<Menu> sMenus = new LinkedList<Menu>();
        sMenus.add(deLujo);
        sMenus.add(versatil);
        sMenus.add(Tradicional);
        return sMenus;
    }
}