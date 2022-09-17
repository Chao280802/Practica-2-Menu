package robot;
import robot.estados.*;

/**
 * Clase que representa a un Robot del restaurante McHamburgesas.
 */
public class McRobot{

    private EstadoRobot estadoActual;

    private boolean hayCliente;
    
    public McRobot(){
        hayCliente = false;
    }

    public boolean getHayCliente(){
        return this.hayCliente;
    }

    public void asignaNuevoEstado(EstadoRobot nuevoEstado){
        this.estadoActual = nuevoEstado;
    }

}