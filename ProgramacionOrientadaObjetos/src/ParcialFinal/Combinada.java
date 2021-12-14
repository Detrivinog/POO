package ParcialFinal;

import java.util.ArrayList;
import java.util.List;

public class Combinada extends Habilidad{
    private int factorMultiplicador;
    private List<Habilidad> habilidades = new ArrayList<>();

    public void agregarHabilidad(Habilidad habilidad){
        this.getHabilidades().add(habilidad);
    }

    @Override
    double calcularPuntaje() {
        double total = 0;
        for (Habilidad hab: this.getHabilidades()){
            total += hab.calcularPuntaje();
        }
        return total*this.getFactorMultiplicador();
    }

    public Combinada(String nombre) {
        super(nombre);
    }

    public int getFactorMultiplicador() {
        return factorMultiplicador;
    }

    public void setFactorMultiplicador(int factorMultiplicador) {
        this.factorMultiplicador = factorMultiplicador;
    }

    public List<Habilidad> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidad> habilidades) {
        this.habilidades = habilidades;
    }
}
