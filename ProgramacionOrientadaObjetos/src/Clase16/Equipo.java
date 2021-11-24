package Clase16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public boolean addJugador(Jugador jugador){
        return this.jugadores.add(jugador);
    }

    public void mostrarJugadoresTitulares(){
        System.out.println("Juagadores titulares: ");

        Collections.sort(jugadores);
        //jugadores.sort(Collections.reverseOrder());

        for (Jugador jugador: this.jugadores) {
            System.out.println(jugador.getNombre());
        }
    }

    public int getCantidadJugadoresLesionados(){
        int cantLesionados = 0;
        for (Jugador jugador: this.jugadores) {
            if (jugador.isLesionado() && jugador.isTitutlar()){
                cantLesionados ++;
            }
        }
        return cantLesionados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
