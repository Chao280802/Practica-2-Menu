package robot;

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

    /**
     * Constructor de un McRobot, inicializa el robot en un estado suspendido.
     */
    public McRobot() {
        modoSuspendido = new ModoSuspendido(this);
        modoActivo = new ModoActivo(this);
        modoCaminar = new ModoCaminar(this);
        modoTomarOrden = new ModoTomarOrden(this);
        modoCocinando = new ModoCocinando(this);
        modoEntregarOrden = new ModoEntregarOrden(this);

        this.estadoActual = this.modoSuspendido;
    }

    public void suspender(){
        estadoActual.suspender();
    }

    public void activar(){
        estadoActual.activar();
    }

    public void caminar(){
        estadoActual.caminar();
    }

    public void tomarOrden(){
        estadoActual.tomarOrden();
    }

    public void cocinar(){
        estadoActual.cocinar();
    }

    public void entregarOrden(){
        estadoActual.entregarOrden();
    }

    public void asignaNuevoEstado(EstadoRobot nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    public EstadoRobot getModoSuspendido() {
        return this.modoSuspendido;
    }

    public EstadoRobot getModoActivo() {
        return this.modoActivo;
    }

    public EstadoRobot getModoCaminar() {
        return this.modoCaminar;
    }

    public EstadoRobot getModoTomarOrden() {
        return this.modoTomarOrden;
    }

    public EstadoRobot getModoCocinar() {
        return this.modoCocinando;
    }

    public EstadoRobot getModoEntregarOrden() {
        return this.modoEntregarOrden;
    }

    public String getEstadoActual() {
        return estadoActual.toString();
    }
}
