/*
    Crea un programa que genere la secuencia de Fibonacci hasta el enésimo término (el valor de n debe ser ingresado por el usuario)
    utilizando un bucle. Muestra los resultados en la consola.
*/

import java.util.Scanner;

public class EstructurasDeControl {
    
    private static void fibonacci(int numero) {

        int[] predecesor = {0,1};
        int resultado = 0;

        for(int i=2; i<numero; i++) {

            resultado = predecesor[0] + predecesor[1];
            predecesor[0] = predecesor[1];
            predecesor[1] = resultado;
            
        }

        System.out.println("El número en la " + numero + "º posición es: " + resultado);

    }

    public static void main(String[] args) {

        int numero ;
        Scanner escaner;

        System.out.println("Introduzca un número");

        escaner = new Scanner(System.in);

        try {

            numero = escaner.nextInt();
            fibonacci(numero);

        } catch (Exception e) {
            System.out.println("No has introducido un número correctamente");
        }

        escaner.close();

    }
}
