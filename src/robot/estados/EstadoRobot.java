package robot.estados;
import robot.McRobot;
/**
 * Interfaz que define los estados que puede adquierir un McRobot
 */
public interface EstadoRobot {
    
    /**
     * El robot se suspenderá si su estado actual se lo permite.
     */
    public void suspender();

    /**
     * El robot se activará si su estado actual se lo permite.
     * @param robot referencia al robot que esta queriendo acceder a este estado.
     */
    public void activar();

    /**
     * El robot caminará si su estgado actual se lo permite.
     * @param robot referencia al robot que esta queriendo acceder a este estado.
     */
    public void caminar();

    /**
     * El robot tomará la orden del cliente si su estado actual se lo permite.
     * @param robot referencia al robot que esta queriendo acceder a este estado.
     */
    public void tomarOrden();

    /**
     * El robot cocinará lo que el cliente pida, si su estado actual se lo permite.
     * @param robot referencia al robot que esta queriendo acceder a este estado.
    */
    public void cocinar();

    /**
     * Elrobot entregará la orden al cliente si su estado actual se lo permite.
     * @param robot referencia al robot que esta queriendo acceder a este estado.
     */
    public void entregarOrden();
}
