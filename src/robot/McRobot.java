package robot;

import robot.estados.*;

/**
 * Clase que representa a un Robot del restaurante McHamburgesas.
 */
public class McRobot {

    private EstadoRobot estadoActual;

    private boolean hayCliente;
    private boolean robotEnMesaCliente;
    private boolean ordenTomada;
    private boolean platilloListo;
    private boolean ordenFilanizada;

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
        hayCliente = false;

        modoSuspendido = new ModoSuspendido(this);
        modoActivo = new ModoActivo(this);
        modoCaminar = new ModoCaminar(this);
        modoTomarOrden = new ModoTomarOrden(this);
        modoCocinando = new ModoCocinando(this);
        modoEntregarOrden = new ModoEntregarOrden(this);

        this.estadoActual = this.modoSuspendido;
        this.hayCliente = false;
        this.robotEnMesaCliente = false;
        this.ordenTomada = false;
        this.platilloListo  =  false;
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

    public boolean getHayCliente() {
        return this.hayCliente;
    }

    public boolean getRobotMesaCliente() {
        return this.robotEnMesaCliente;
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

    public boolean getOrdenTomada(){
        return this.ordenTomada;
    }

    public boolean getPlatilloListo(){
        return this.platilloListo;
    }

    public boolean getOrdenFinalizada(){
        return this.ordenFilanizada;
    }
}
