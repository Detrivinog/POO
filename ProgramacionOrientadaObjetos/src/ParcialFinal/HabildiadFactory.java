package ParcialFinal;

public class HabildiadFactory {
    private static HabildiadFactory instance;
    public static final String SIMPLE = "SIMPLE";
    public static final String COMBINADA = "COMBINADA";

    private HabildiadFactory(){}

    public static HabildiadFactory getInstance(){
        if (instance == null){
            instance = new HabildiadFactory();
        }
        return instance;
    }

    public Habilidad crearHabilidad(String cod, String nombre){
        switch (cod){
            case SIMPLE:
                return new Simple(nombre);
            case COMBINADA:
                return new Combinada(nombre);
            default:
                return null;
        }
    }
}
