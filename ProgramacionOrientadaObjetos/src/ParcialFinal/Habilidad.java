package ParcialFinal;

public abstract class Habilidad {
    private String nombre;
    private String descripcion;

    abstract double calcularPuntaje();

    public Habilidad(){}

    public Habilidad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
