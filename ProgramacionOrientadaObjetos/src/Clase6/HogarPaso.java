package Clase6;

public class HogarPaso {
    public static void main(String[] args) {
        Perro perro1 = new Perro(true, "Pepe", 2018);
        perro1.setTieneChip(true);
        perro1.setPeso((float) 4.9);
        perro1.setEstaLastimado(false);
        System.out.println("Edad perro "+perro1.edadPerro());
        System.out.println("Perderse: "+perro1.factiblePerderse());
        System.out.println("Peso perro "+perro1.getPeso());
        System.out.println("Adoptar "+perro1.posibleAdoptar());
    }
}
