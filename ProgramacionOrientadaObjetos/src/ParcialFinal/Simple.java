package ParcialFinal;

public class Simple extends Habilidad{
    private double puntaje;

    public Simple(String nombre) {
        super(nombre);
    }

    @Override
    double calcularPuntaje() {
        if (this.getNombre().equals("Disparar")){
            return this.getPuntaje()*1.1;
        }
        return this.getPuntaje();
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }
}
