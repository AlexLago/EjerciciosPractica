
/*  Escribe un programa en Java que solicite al usuario ingresar un número entero y luego determine si ese número
    es par o impar. Asegúrate de manejar la entrada incorrecta.
*/

import java.util.Scanner;

public class Fundamentos {
    
    private static void determinarPar(int numero) {

        if(numero % 2 == 0) {
            System.out.print("El número introducido es par");
        } else {
            System.out.print("El número introducido es impar");
        }

    }

    public static void main(String[] args) {

        Scanner escaner;
        int numero_recibido;

        System.out.println("Introduzca un número");

        escaner = new Scanner(System.in);

        numero_recibido = escaner.nextInt();

        determinarPar(numero_recibido);

        escaner.close();

    }
}
