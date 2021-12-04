package Clase21Reparacion;

public interface StateReparacion {
    void cambiarDireccion(String direccion) throws StateException;
    void pasarSiguiente() throws StateException;
    void agregarRepuestos(double costo) throws StateException;
    void darValorPresupuesto(double valor) throws StateException;
}
