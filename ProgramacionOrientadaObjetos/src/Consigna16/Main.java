package Consigna16;

public class Main {
    public static void main(String[] args) {
        Contenedor cont1 = new Contenedor(1, "No se", "Colombia", false);
        Contenedor cont2 = new Contenedor(2, "No se", "Desconocido", true);
        Contenedor cont3 = new Contenedor(3, "No se", "Desconocido", true);
        Puerto puerto1 = new Puerto();

        puerto1.addContenedor(cont1);
        puerto1.addContenedor(cont2);
        puerto1.addContenedor(cont3);

        puerto1.mostrarConedores();
        System.out.println(puerto1.cantidadContenedoresPeligrosos());

    }
}
