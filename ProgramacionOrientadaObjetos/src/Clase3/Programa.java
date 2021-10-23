package Clase3;

import java.util.Scanner;

public class Programa {

    Scanner entrada = new Scanner(System.in);

    public void cuantosPaquetes(){
        System.out.println("Ingresa el nombre del perro");
        String nombre = this.entrada.nextLine();
        System.out.println("Cuantos kg come "+nombre);
        float cantComida = this.entrada.nextFloat();
        while (cantComida < 3) {
            System.out.println("Cuantos kg come "+nombre+ "(Recuerda que debe ser mayor a 3kg, " +
                    "porque puede llorar toda la noche)");
            cantComida = this.entrada.nextFloat();
        }
        System.out.println("Pesos de los paquetes: ");
        float total = 0;
        int contadorPaquetes = 0;
        while (total < cantComida){
            total += this.entrada.nextFloat();
            contadorPaquetes++;
        }
        System.out.println("Resultado: "+nombre+" precisa "+contadorPaquetes+" paquetes." );
    }
}
