package Clase21Reparacion;

public class Reparacion {
    private StateReparacion estado;
    private String nombreArticulo;
    private String direccionEntrega;
    private double valorPresupuesto;

    public Reparacion(String nombreArticulo, String direccionEntrega) {
        this.estado = new EnPresupuesto(this);
        this.nombreArticulo = nombreArticulo;
        this.direccionEntrega = direccionEntrega;
        this.valorPresupuesto = 0.0;
    }

    // Funciones implementadas
    public void darValorPresupuesto(double valor) throws StateException {
        this.estado.darValorPresupuesto(valor);
    }

    public void agregarRepuestos(double costo) throws StateException{
        this.estado.agregarRepuestos(costo);
    }

    public void pasarSiguiente() throws StateException{
        this.estado.pasarSiguiente();
    }

    public void cambiarDireccion(String direccion) throws StateException{
        this.estado.pasarSiguiente();
    }

    public StateReparacion getEstado() {
        return estado;
    }

    //Getters and Setters
    public void setEstado(StateReparacion estado) {
        this.estado = estado;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public double getValorPresupuesto() {
        return valorPresupuesto;
    }

    public void setValorPresupuesto(double valorPresupuesto) {
        this.valorPresupuesto = valorPresupuesto;
    }

}
