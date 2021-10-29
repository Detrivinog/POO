package Clase5;

public class Juego {
    public static void main(String[] args) {
        UsuarioJuego user1 = new UsuarioJuego("David", "CTD");
        user1.aumentarPuntaje();
        user1.subirNivel();
        user1.bonus(4);
    }
}
