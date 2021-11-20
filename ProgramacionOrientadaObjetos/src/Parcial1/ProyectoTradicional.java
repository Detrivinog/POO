package Parcial1;

public class ProyectoTradicional extends Proyecto{
    private String fase;

    public ProyectoTradicional(String fechaInicioPlanificada, String fechaFinalPlanificada, String status, String fase) {
        super(fechaInicioPlanificada, fechaFinalPlanificada, status);
        this.fase = fase;
    }

    public boolean estaFaseDiseño(){
        return (this.getFase().equals("DISEÑO"));
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }
}
