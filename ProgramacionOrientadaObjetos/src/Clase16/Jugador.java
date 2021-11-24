package Clase16;

public class Jugador implements  Comparable<Jugador>{
    private int nroCamiseta;
    private String nombre;
    private boolean lesionado;
    private boolean titutlar;

    public Jugador(int nroCamiseta, String nombre, boolean lesionado, boolean titutlar) {
        this.nroCamiseta = nroCamiseta;
        this.nombre = nombre;
        this.lesionado = lesionado;
        this.titutlar = titutlar;
    }

    @Override
    public int compareTo(Jugador o) {
        return this.getNroCamiseta() - o.getNroCamiseta();
    }

    public int getNroCamiseta() {
        return nroCamiseta;
    }

    public void setNroCamiseta(int nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    public boolean isTitutlar() {
        return titutlar;
    }

    public void setTitutlar(boolean titutlar) {
        this.titutlar = titutlar;
    }
}
