package ParcialFinal;

public class Main {
    public static void main(String[] args) {
        HabildiadFactory factory = HabildiadFactory.getInstance();
        Habilidad saltar = factory.crearHabilidad(HabildiadFactory.SIMPLE, "Saltar");
        Habilidad disparar = factory.crearHabilidad(HabildiadFactory.SIMPLE, "Disparar");
        Habilidad dispararSaltar = factory.crearHabilidad(HabildiadFactory.COMBINADA, "Disparo-al-saltar");

        ((Simple) saltar).setPuntaje(7.5);
        ((Simple) disparar).setPuntaje(10);
        ((Combinada) dispararSaltar).setFactorMultiplicador(3);
        ((Combinada) dispararSaltar).agregarHabilidad(saltar);
        ((Combinada) dispararSaltar).agregarHabilidad(disparar);

        Personaje per1 = new Personaje();
        per1.agregarHabilidad(saltar);
        per1.agregarHabilidad(disparar);
        per1.agregarHabilidad(dispararSaltar);

        per1.mostrarHabilidades();
    }
}
