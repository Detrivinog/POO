package Clase21Reparacion;

import static Clase21Reparacion.StateFactory.REPARACION;

public class Main {
    public static void main(String[] args) throws StateException {
        Reparacion rep1 = new Reparacion("batidora", "Avenida siempre viva");
        StateFactory factory = StateFactory.getInstance();

        rep1.darValorPresupuesto(300.5);
        rep1.pasarSiguiente();
        rep1.agregarRepuestos(400.7);
        rep1.pasarSiguiente();
        rep1.getDireccionEntrega();
        rep1.cambiarDireccion("Calle 47");
        rep1.pasarSiguiente();
    }
}
