// Ejercicio 2 Practica 3
//  Bucle FOR  parte 2

import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int tabla, result;
        System.out.print("Que tabla desea mostrar?: ");
        tabla = scanner.nextInt();
        System.out.println("-------------------------");
        System.out.println("Imprimiendo la tabla del: " + tabla);
        System.out.println("-------------------------");
        for (int i=1; i<11; i++) {
            result= tabla*i;
            System.out.println(tabla + " x "+i+" = " +result);
            scanner.close();
        }

    }
}