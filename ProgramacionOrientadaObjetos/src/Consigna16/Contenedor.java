package Consigna16;

public class Contenedor implements Comparable<Contenedor>{
    private int id;
    private String descripcion;
    private String pais;
    private  boolean peligroso;

    public Contenedor(int id, String descripcion, String pais, boolean peligroso) {
        this.id = id;
        this.descripcion = descripcion;
        this.pais = pais;
        this.peligroso = peligroso;
    }
    @Override
    public int compareTo(Contenedor o) {
        return this.getId() - o.getId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isPeligroso() {
        return peligroso;
    }

    public void setPeligroso(boolean peligroso) {
        this.peligroso = peligroso;
    }
}
