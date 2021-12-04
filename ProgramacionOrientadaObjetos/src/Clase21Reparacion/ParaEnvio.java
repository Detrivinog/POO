package Clase21Reparacion;

import static Clase21Reparacion.StateFactory.*;

public class ParaEnvio implements StateReparacion{
    private Reparacion reparacion;

    public ParaEnvio(Reparacion reparacion) {
        this.reparacion = reparacion;
    }

    @Override
    public void cambiarDireccion(String direccion){
        this.reparacion.setDireccionEntrega(direccion);
    }

    @Override
    public void pasarSiguiente() {
        this.reparacion.setEstado(fabricarEstado(FINALIZADO, this.reparacion));
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
