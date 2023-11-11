/*
    Escribe un programa que lea un número decimal desde la entrada estándar y maneje la excepción en caso de que el usuario ingrese
    algo que no sea un número decimal. Imprime un mensaje de error en caso de excepción.
*/

import java.util.Scanner;

public class Excepciones {
    
    public static void main(String[] args) {

        double numero = 0;

        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduzca un número.");

        try {
            numero = escaner.nextDouble();
        } catch (Exception e) {
            System.out.println("No has introducido un número correctamente.");
        }

        System.out.println("Has introducido: " + numero);

        escaner.close();
    }
}
