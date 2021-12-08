package Clase22Composite;

import java.util.ArrayList;
import java.util.List;

public class Vagon implements Figura{
    private List<Figura> figuras;
    private String nombre;

    public Vagon(String nombre) {
        this.figuras = new ArrayList<>();
        this.nombre = nombre;
    }

    public void agregarFigura(Figura figura){
        this.getFiguras().add(figura);
    }

    @Override
    public double calcularArea() {
        double areaTotal = 0;
        for (Figura figura:this.getFiguras()) {
            areaTotal += figura.calcularArea();
        }
        return areaTotal;
    }

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<Figura> figuras) {
        this.figuras = figuras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
