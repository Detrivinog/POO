package Clase2;

import java.util.Scanner;

public class Sintaxis {
    public static void main(String[] args) {
        String nombre;
        String apellido;
        char inicial;

        //Scanner - Instanciar
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingresa tu apellido: ");
        apellido = entrada.nextLine();
        inicial = nombre.charAt(0);

        // Terminar el ejercicio

        //https://drive.google.com/file/d/1hV5Dj0-f0ZPryE4rvzWy6Q1pGV85BSRi/view
    }
}
