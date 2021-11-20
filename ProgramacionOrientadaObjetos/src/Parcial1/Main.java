package Parcial1;

public class Main {

    public static void main(String[] args) {
        ProjectManager manager1 = new ProjectManager("David", "Triviño", "120", 678);
        ProyectoAgil proyecto1 = new ProyectoAgil("11-01-2021", "11-20-2021", "FINALIZADO", 4);
        proyecto1.setFechaFinalReal("11-20-2021");
        Proyecto proyecto2 = new ProyectoAgil("11-01-2021", "11-30-2021", "EN EJECUCIÓN", 7);
        ProyectoTradicional proyecto3 = new ProyectoTradicional("11-01-2021", "11-30-2021", "EN EJECUCION", "DISEÑO");

        System.out.println("CompareTo: "+proyecto1.compareTo(proyecto2));
        System.out.println("Esta finalizado: "+proyecto1.estaFinalizado());
        System.out.println("Fase diseño: "+proyecto3.estaFaseDiseño());

    }
}
