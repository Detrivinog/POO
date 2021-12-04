package Clase21Reparacion;

public class StateFactory {
    // Atributo de instancia del patron Singleton
    private static StateFactory instance;

    // Constantes de los codigos para la función de fabricar
    public static final String PRESUPUESTO = "presupuesto";
    public static final String REPARACION = "reparacion";
    public static final String ENVIO = "envio";
    public static final String FINALIZADO = "finalizado";

    // Constructor privado para el patrón Singleton
    private StateFactory(){}

    // getInstance del patron Singleton
    public static StateFactory getInstance() {
        if (instance == null){
            instance = new StateFactory();
        }
        return instance;
    }

    // Switch de la función de fabricar
    public static StateReparacion fabricarEstado(String codigo, Reparacion reparacion){
        switch (codigo) {
            case "presupuesto":
                mostrarDetalle(reparacion);
                return new EnPresupuesto(reparacion);
            case "reparacion":
                mostrarDetalle(reparacion);
                return new EnReparacion(reparacion);
            case "envio":
                mostrarDetalle(reparacion);
                return new ParaEnvio(reparacion);
            case "finalizado":
                mostrarDetalle(reparacion);
                return new Finalizado(reparacion);
            default:
                return  null;
        }
    }

    private static void mostrarDetalle(Reparacion reparacion) {
        System.out.println("El producto "+reparacion.getNombreArticulo()+
                " con estado "+ reparacion.getEstado()+" ,cambió"+". Su dirección de entrega es "+
                reparacion.getDireccionEntrega()+". El presupuesto es "+reparacion.getValorPresupuesto());
    }

}
