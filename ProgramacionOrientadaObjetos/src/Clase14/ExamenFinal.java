package Clase14;

public class ExamenFinal extends Examen implements Comparable{
    private double notaOral;
    private String descripcionTema;

    public ExamenFinal(String titulo, String enunciado, double nota, double notaOral) {
        super(titulo, enunciado, nota);
        this.notaOral = notaOral;
    }
    @Override
    public boolean estaAprobado(){
        return (super.estaAprobado() && this.getNotaOral() >= 4);
    }

    @Override
    public int compareTo(Object o) {
        ExamenFinal examenFinal = (ExamenFinal) o;
        if (this.getPromedioNotas() > examenFinal.getPromedioNotas()){
            return 1;
        } else if (this.getPromedioNotas() < examenFinal.getPromedioNotas()){
            return -1;
        }else {
            return 0;
        }
    }
    private double getPromedioNotas(){
        return (super.getNota() + this.getNotaOral())/2;
    }

    public double getNotaOral() {
        return notaOral;
    }

    public void setNotaOral(double notaOral) {
        this.notaOral = notaOral;
    }

    public String getDescripcionTema() {
        return descripcionTema;
    }

    public void setDescripcionTema(String descripcionTema) {
        this.descripcionTema = descripcionTema;
    }
}
