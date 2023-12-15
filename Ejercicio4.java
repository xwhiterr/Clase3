// Ejercicio 4 Practica 3
// Ciclos While
// @author Walter Aquino

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // variables
        Scanner scanner = new Scanner(System.in);
        String  usuario;
        String usuarioCorrecto="admin";
        int pin;
        int pinCorrecto= 1234567;
        int correcto= 0;
        System.out.println("Acceso al Sistema");
        while (correcto<=0) {
            // Entrada
            System.out.print("Ingrese usuario: ");
            usuario = scanner.nextLine();
            System.out.print("Ingrese Pin: ");
            pin = scanner.nextInt();
            // Verificacion
            if ((usuario.equals(usuarioCorrecto)) && (pin==pinCorrecto)) {
                correcto=1;
            }
            if (correcto<1){
            System.out.println("Usuario y/o incorrecto.");
            scanner.nextLine(); // Reset string scanner
            }
        }
        System.out.println("Bienvenido al sistema.");
        scanner.close();
    }
}