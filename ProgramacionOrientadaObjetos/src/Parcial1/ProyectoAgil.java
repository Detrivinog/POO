package Parcial1;

import Clase14.ExamenFinal;

public class ProyectoAgil extends Proyecto implements Comparable{
    private int cantidadSprints;
    private int numeroSprints;
    private String descripcion;

    public ProyectoAgil(String fechaInicioPlanificada, String fechaFinalPlanificada, String status, int cantidadSprints) {
        super(fechaInicioPlanificada, fechaFinalPlanificada, status);
        this.cantidadSprints = cantidadSprints;
    }

    @Override
    public int compareTo(Object o) {
        ProyectoAgil proyectoAgil = (ProyectoAgil) o;
        if (this.getCantidadSprints() > proyectoAgil.getCantidadSprints()){
            return 1;
        } else if (this.getCantidadSprints() < proyectoAgil.getCantidadSprints()){
            return -1;
        }else {
            return 0;
        }
    }

    public int getCantidadSprints() {
        return cantidadSprints;
    }

    public void setCantidadSprints(int cantidadSprints) {
        this.cantidadSprints = cantidadSprints;
    }

    public int getNumeroSprints() {
        return numeroSprints;
    }

    public void setNumeroSprints(int numeroSprints) {
        this.numeroSprints = numeroSprints;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
