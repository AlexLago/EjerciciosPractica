/*
    Crea una lista de objetos de tipo "Persona," donde cada objeto tiene atributos como nombre, edad y ciudad de residencia.
    Luego, implementa un método que filtre la lista de personas para mostrar solo aquellas que sean mayores de 30 años y
    vivan en una ciudad específica (que el usuario debe proporcionar).
 */


public class Colecciones {
    
    public static void main(String[] args) {

        Persona[] civil = new Persona[5];

        civil[0] = new Persona("Alejandro", 24, "Coruña");
        civil[1] = new Persona("Ruben", 51, "Coruña");
        civil[2] = new Persona("Sergio", 33, "Madrid");
        civil[3] = new Persona("Isaac", 24, "Portugal");
        civil[4] = new Persona("Victor", 37, "Valencia");
        
        
        Persona.filtroEdad(civil);
    }
}

class Persona {

    private String nombre;
    private int edad;
    private String ciudad_residencia;

    public Persona(String nombre, int edad, String ciudad_residencia) {

        this.nombre = nombre;
        this.edad = edad;
        this.ciudad_residencia = ciudad_residencia;

    }

    public static void filtroEdad(Persona civil[]) {
        for (Persona e : civil) {
            if(e.edad > 30) {
                System.out.println("Nombre: " + e.nombre + " | Edad: " + e.edad + " | Ciudad residencia: " + e.ciudad_residencia);
            }
        }
    }
}
