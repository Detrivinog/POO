package Clase21Reparacion;

import static Clase21Reparacion.StateFactory.*;

public class EnPresupuesto implements StateReparacion{
    private Reparacion reparacion;

    public EnPresupuesto(Reparacion reparacion) {
        this.reparacion = reparacion;
    }

    @Override
    public void cambiarDireccion(String direccion) throws StateException {
        throw new StateException("No es una función permitida");
    }

    @Override
    public void pasarSiguiente() {
        this.reparacion.setEstado(fabricarEstado(REPARACION, this.reparacion));
    }

    @Override
    public void agregarRepuestos(double costo) throws StateException {
        throw new StateException("No es una función permitida");
    }

    @Override
    public void darValorPresupuesto(double valor) {
        this.reparacion.setValorPresupuesto(valor);
        System.out.println("El valor del presupuesto es " + this.reparacion.getValorPresupuesto());
    }
}
