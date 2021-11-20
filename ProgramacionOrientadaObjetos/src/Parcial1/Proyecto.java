package Parcial1;

public abstract class Proyecto {
    private String fechaInicioPlanificada;
    private String fechaFinalPlanificada;
    private String fechaInicioReal;
    private String fechaFinalReal;
    private String status;
    private ProjectManager projectManager;

    public Proyecto(String fechaInicioPlanificada, String fechaFinalPlanificada, String status) {
        this.fechaInicioPlanificada = fechaInicioPlanificada;
        this.fechaFinalPlanificada = fechaFinalPlanificada;
        this.status = status;
    }

    public boolean estaFinalizado(){
        if(this.getStatus() == "FINALIZADO" && (this.getFechaFinalReal() == this.fechaFinalPlanificada)){
            return true;
        } else {
            return false;
        }
    }

    public ProjectManager getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(ProjectManager projectManager) {
        this.projectManager = projectManager;
    }

    public String getFechaInicioPlanificada() {
        return fechaInicioPlanificada;
    }

    public void setFechaInicioPlanificada(String fechaInicioPlanificada) {
        this.fechaInicioPlanificada = fechaInicioPlanificada;
    }

    public String getFechaFinalPlanificada() {
        return fechaFinalPlanificada;
    }

    public void setFechaFinalPlanificada(String fechaFinalPlanificada) {
        this.fechaFinalPlanificada = fechaFinalPlanificada;
    }

    public String getFechaInicioReal() {
        return fechaInicioReal;
    }

    public void setFechaInicioReal(String fechaInicioReal) {
        this.fechaInicioReal = fechaInicioReal;
    }

    public String getFechaFinalReal() {
        return fechaFinalReal;
    }

    public void setFechaFinalReal(String fechaFinalReal) {
        this.fechaFinalReal = fechaFinalReal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
