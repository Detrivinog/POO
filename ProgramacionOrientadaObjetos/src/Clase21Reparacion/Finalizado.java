package Clase21Reparacion;

public class Finalizado implements StateReparacion{
    private Reparacion reparacion;

    public Finalizado(Reparacion reparacion) {
        this.reparacion = reparacion;
    }

    @Override
    public void cambiarDireccion(String direccion) throws StateException {
        throw new StateException("No es una función permitida");
    }

    @Override
    public void pasarSiguiente() {

    }

    @Override
    public void agregarRepuestos(double costo) throws StateException {
        throw new StateException("No es una función permitida");
    }

    @Override
    public void darValorPresupuesto(double valor) throws StateException {
        throw new StateException("No es una función permitida");
    }
}
