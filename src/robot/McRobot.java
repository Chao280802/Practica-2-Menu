package robot;

import java.util.LinkedList;
import robot.estados.menus.Hamburguesa;
import robot.estados.menus.Menu;

import robot.estados.*;

/**
 * Clase que representa a un Robot del restaurante McHamburgesas.
 */
public class McRobot {

    private EstadoRobot estadoActual;

    private ModoSuspendido modoSuspendido;
    private ModoActivo modoActivo;
    private ModoCaminar modoCaminar;
    private ModoTomarOrden modoTomarOrden;
    private ModoCocinando modoCocinando;
    private ModoEntregarOrden modoEntregarOrden;

    private Hamburguesa hamburguesa;

    /**
     * Constructor de un McRobot, inicializa el robot en un estado suspendido.
     */
    public McRobot(LinkedList<Menu> menu) {
        modoSuspendido = new ModoSuspendido(this);
        modoActivo = new ModoActivo(this);
        modoCaminar = new ModoCaminar(this);
        modoTomarOrden = new ModoTomarOrden(this, menu);
        modoCocinando = new ModoCocinando(this);
        modoEntregarOrden = new ModoEntregarOrden(this);

        this.estadoActual = this.modoSuspendido;
    }

    /**
     * El robot se suspenderá si su estado actual se lo permite.
     */
    public void suspender() {
        estadoActual.suspender();
    }

    /**
     * El robot se activará si su estado actual se lo permite.
     */
    public void activar() {
        estadoActual.activar();
    }

    /**
     * El robot caminará si su estgado actual se lo permite.
     */
    public void caminar() {
        estadoActual.caminar();
    }

    /**
     * El robot tomará la orden del cliente si su estado actual se lo permite.
     */
    public void tomarOrden() {
        estadoActual.tomarOrden();
    }

    /**
     * El robot cocinará lo que el cliente pida, si su estado actual se lo permite.
     */
    public void cocinar() {
        estadoActual.cocinar();
    }

    /**
     * Elrobot entregará la orden al cliente si su estado actual se lo permite.
     */
    public void entregarOrden() {
        estadoActual.entregarOrden();
    }

    /**
     * El robot asignara un nuevo estado a su estado actual.
     * 
     * @param nuevoEstado nuevo estado a cambiar.
     */
    public void asignaNuevoEstado(EstadoRobot nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    /**
     * Regresa el Estado suspendido del robot.
     * 
     * @return estado suspendido.
     */
    public EstadoRobot getModoSuspendido() {
        return this.modoSuspendido;
    }

    /**
     * Regresa el Estado Activo del robot.
     * 
     * @return estado activo.
     */
    public EstadoRobot getModoActivo() {
        return this.modoActivo;
    }

    /**
     * Regresa el Estado Caminar del robot.
     * 
     * @return estado caminar.
     */
    public EstadoRobot getModoCaminar() {
        return this.modoCaminar;
    }

    /**
     * Regresa el Estado tomar orden del robot.
     * 
     * @return estado tomar orden.
     */
    public EstadoRobot getModoTomarOrden() {
        return this.modoTomarOrden;
    }

    /**
     * Regresa el Estado cocinar del robot.
     * 
     * @return estado tomar orden.
     */
    public EstadoRobot getModoCocinar() {
        return this.modoCocinando;
    }

    /**
     * Regresa el Estado entregar orden del robot.
     * 
     * @return estado entregar orden.
     */
    public EstadoRobot getModoEntregarOrden() {
        return this.modoEntregarOrden;
    }

    /**
     * Regresa la descripción del estado actual en el que se encuentra el robot.
     * 
     * @return descripción estado actual del robot.
     */
    public String getDescripcionEstadoActual() {
        return estadoActual.toString();
    }

    /**
     * Regresa el estado actual del robot.
     * 
     * @return estado actual del robot.
     */
    public EstadoRobot getEstadoActual() {
        return this.estadoActual;
    }

    /**
     * Regresa la orden que el cliente pidió.
     * 
     * @return Hamburguesa que el cliente ordenó.
     */
    public Hamburguesa getOrden() {
        return this.hamburguesa;
    }

    /**
     * Asigna una orden nueva al robot.
     * 
     * @param orden platillo a asignar.
     */
    public void setOrden(Hamburguesa orden) {
        this.hamburguesa = orden;
    }
}
