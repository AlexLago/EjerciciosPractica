/*  
    Define una clase "Rectángulo" con atributos para el ancho y el alto. Crea métodos para calcular el área y el perímetro del rectángulo.
    Luego, crea un programa que cree instancias de esta clase y muestre los resultados.
*/

import java.util.Scanner;

class Rectangulo {
        private int ancho;
        private int alto;

        public Rectangulo(int ancho, int alto) {
            this.ancho = ancho;
            this.alto = alto;
        }
        
        protected int calcularPerimetro(int ancho, int alto) {
            int perimetro = 2*(ancho + alto);
            return perimetro;
        }
    }

class POO {
    
    public static void main(String[] args) {
        
        Rectangulo rectangulo;
        Scanner escaner;
        int ancho_recibido = 0;
        int alto_recibido = 0;

        System.out.println("Introduzca un número para el ancho.");

        escaner = new Scanner(System.in);

        try {
            ancho_recibido = escaner.nextInt();
        } catch (Exception e) {
            System.out.println("No has introducido un ancho correctamente.");
        }

        System.out.println("Introduzca un número para la altura.");

        try {
            alto_recibido = escaner.nextInt();
        } catch (Exception e) {
            System.out.println("No has introducido una altura correctamente.");
        }

        rectangulo = new Rectangulo(ancho_recibido, alto_recibido);

        System.out.println("El perimetro del rectángulo es: " + rectangulo.calcularPerimetro(ancho_recibido, alto_recibido) + "cm");

        escaner.close();

    }
}
