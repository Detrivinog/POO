package Clase14;

public class ExamenParcial extends Examen{
    private int unidad;
    private int reintentos;

    public ExamenParcial(String titulo, String enunciado, double nota) {
        super(titulo, enunciado, nota);
    }

    public boolean sePuedeRecuperar(){
        int intentosPosibles;
        if(getUnidad() <= 3){
            intentosPosibles = 3;
        }else{
            intentosPosibles = 2;
        }
        return getReintentos() < intentosPosibles;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public int getReintentos() {
        return reintentos;
    }

    public void setReintentos(int reintentos) {
        this.reintentos = reintentos;
    }
}
