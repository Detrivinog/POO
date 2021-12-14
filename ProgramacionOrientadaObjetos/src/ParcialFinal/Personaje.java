package ParcialFinal;

import java.util.ArrayList;
import java.util.List;

public class Personaje {
    private String nombre;
    private List<Habilidad> habilidades = new ArrayList<>();

    public void agregarHabilidad(Habilidad hab){
        this.getHabilidades().add(hab);
    }

    public void mostrarHabilidades(){
        System.out.println("Lista de Habilidades");
        for (Habilidad hab: this.getHabilidades()){
            System.out.println("Nombre: "+ hab.getNombre()+". Puntaje: "+ hab.calcularPuntaje());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Habilidad> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidad> habilidades) {
        this.habilidades = habilidades;
    }
}
