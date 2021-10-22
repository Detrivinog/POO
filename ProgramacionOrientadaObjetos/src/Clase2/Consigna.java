package Clase2;

import java.util.Scanner;

public class Consigna {
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un número para saber si es primo: ");
        numero = entrada.nextInt();
        System.out.println("el número "+numero+ " es "+esPrimo(numero)+ " a primo.");

        System.out.println("******************************");
        System.out.println("Valor máximo de tres números");
        System.out.println("Ingresa el primer numero: ");
        Integer numeroA = entrada.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        Integer numeroB = entrada.nextInt();
        System.out.println("Ingresa el tercer numero: ");
        Integer numeroC = entrada.nextInt();
        System.out.println("El valor máximo de los ingresados es: "+maximoEntreTresNumeros(numeroA, numeroB, numeroC));

        System.out.println("******************************");
        System.out.println("Cadenas de texto distintas");
        System.out.println("Ingresa el primer texto:");
        String textA = entrada.nextLine();
        System.out.println("Ingresa el segundo texto: ");
        String textB = entrada.nextLine();
        System.out.println(textA + " *** " + textB);
        System.out.println("Los dos textos son "+cadenasDeTextoDistintas(textA, textB)+ " a distintos");

    }
    // Primo
    public static boolean esPrimo(int numero) {
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            if (esDivisible(numero, x))
                return false;
        }
        return true;
    }
    public static boolean esDivisible(int n, int divisor){
       if (n % divisor == 0){
           return true;
       }else {
           return false;
       }
    }

    // Maximo valor
    public static Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC){
        Integer max1 = Math.max(unNumeroA, unNumeroB);
        return Math.max(max1, unNumeroC);
    }

    // Cadenas de texto
    public static boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB){
        return !unTextoA.contentEquals(unTextoB);
    }
}
