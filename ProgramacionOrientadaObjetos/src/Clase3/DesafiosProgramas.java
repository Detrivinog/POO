package Clase3;

import java.util.Scanner;

public class DesafiosProgramas {
    Scanner entrada = new Scanner(System.in);

    public void desafio1() {
        System.out.println("Bienvenido a Piedra, Papel y Tijera");
        System.out.println("Ingrese el nombre del jugador 1: ");
        String jugador1 = this.entrada.nextLine();
        System.out.println("Ingrese el nombre del jugador 2: ");
        String jugador2 = this.entrada.nextLine();
        setOpciones();
        System.out.println("Opción del jugador 1: ");
        int jugada1 = this.entrada.nextInt();

        while(jugada1 != 4){
            System.out.println("Opción del jugador 2: ");
            int jugada2 = this.entrada.nextInt();
            System.out.println("Gana el jugador "+this.cualGana(jugada1, jugada2));
            setOpciones();
            System.out.println("Opción del jugador 1: ");
            jugada1 = this.entrada.nextInt();
        }
        System.out.println("Fin del juego, gracias por jugar");

    }

    public void setOpciones() {
        System.out.println("Elije una opción: ");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        System.out.println("4. *(Fin del juego)");
    }

    public int cualGana(int jugada1, int jugada2){
        int resultado = 0;
        if (jugada1 == 1) {
            switch (jugada2) {
                case 1:
                    break;
                case 2:
                    resultado = 2;
                break;
                case 3:
                    resultado = 1;
                break;
            }
            ;
        } else if (jugada1 == 2) {
            switch (jugada2) {
                case 1:
                    resultado = 1;
                break;
                case 2:
                    break;
                case 3:
                    resultado = 2;
                break;
            }
            ;
        } else if (jugada1 == 3) {
                switch (jugada2){
                    case 1:
                        resultado = 2;
                    break;
                    case 2:
                        resultado = 1;
                    break;
                    case 3:
                        break;
                };
        }
        return resultado;
    }
    public void setOpcionesSpock() {
        System.out.println("Elije una opción: ");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        System.out.println("4. Spock");
        System.out.println("5. *(Fin del juego)");
    }

    public int cualGanaSpock(int jugada1, int jugada2){
        int resultado = 0;
        if (jugada1 == 1) {
            switch (jugada2) {
                case 1:
                    break;
                case 2:
                case 4:
                    resultado = 2;
                    break;
                case 3:
                    resultado = 1;
                    break;
            }
            ;
        } else if (jugada1 == 2) {
            switch (jugada2) {
                case 1:
                case 4:
                    resultado = 1;
                    break;
                case 2:
                    break;
                case 3:
                    resultado = 2;
                    break;
            }
            ;
        } else if (jugada1 == 3) {
            switch (jugada2){
                case 4:
                case 1:
                    resultado = 2;
                    break;
                case 2:
                    resultado = 1;
                    break;
                case 3:
                    break;
            };
        } else if (jugada1 == 4) {
            switch (jugada2){
                case 1:
                case 3:
                    resultado = 1;
                    break;
                case 2:
                    resultado = 2;
                    break;
                case 4:
                    break;
            };
        }
        return resultado;
    }
    public void desafio2() {
        System.out.println("Bienvenido a Piedra, Papel, Tijera y Spock");
        System.out.println("Ingrese el nombre del jugador 1: ");
        String jugador1 = this.entrada.nextLine();
        System.out.println("Ingrese el nombre del jugador 2: ");
        String jugador2 = this.entrada.nextLine();
        setOpcionesSpock();
        System.out.println("Opción del jugador 1: ");
        int jugada1 = this.entrada.nextInt();

        while(jugada1 != 5){
            System.out.println("Opción del jugador 2: ");
            int jugada2 = this.entrada.nextInt();
            System.out.println("Gana el jugador "+this.cualGanaSpock(jugada1, jugada2));
            setOpcionesSpock();
            System.out.println("Opción del jugador 1: ");
            jugada1 = this.entrada.nextInt();
        }
        System.out.println("Fin del juego, gracias por jugar");
    }
    public void desafio3() {
        System.out.println("¿Cuantos números primos quieres ver?");
        System.out.println("Ingresa la cantidad de numeros primos quires ver: ");
        int cantidadPrimos = this.entrada.nextInt();

    }

}
