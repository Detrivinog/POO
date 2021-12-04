package Clase21Reparacion;

import static Clase21Reparacion.StateFactory.*;

public class EnReparacion implements StateReparacion{
    private Reparacion reparacion;

    public EnReparacion(Reparacion reparacion) {
        this.reparacion = reparacion;
    }

    @Override
    public void cambiarDireccion(String direccion) throws StateException {
        throw new StateException("No es una función permitida");
    }

    @Override
    public void pasarSiguiente() {
        this.reparacion.setEstado(fabricarEstado(ENVIO, this.reparacion));
    }

    @Override
    public void agregarRepuestos(double costo) {
        double presupuesto = this.reparacion.getValorPresupuesto() + costo;
        this.reparacion.setValorPresupuesto(presupuesto);
    }

    @Override
    public void darValorPresupuesto(double valor) throws StateException{
        throw new StateException("No es una función permitida");
    }
}
