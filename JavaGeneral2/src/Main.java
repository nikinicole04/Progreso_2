import java.util.Scanner;

// Clase base (Padre)
class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

// Clase derivada (Hija) - Ejemplo de herencia
class Perro extends Animal {
    private String raza;

    public Perro(String nombre, String raza) {
        super(nombre); // Llamada al constructor de la clase base
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau, guau!");
    }

    public void mostrarRaza() {
        System.out.println("La raza de " + nombre + " es " + raza + ".");
    }
}

// Clase adicional para composición
class Dueño {
    private String nombre;

    public Dueño(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

// Clase principal
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos para crear un objeto Perro
        System.out.print("Ingresa el nombre del perro: ");
        String nombrePerro = scanner.nextLine();

        System.out.print("Ingresa la raza del perro: ");
        String razaPerro = scanner.nextLine();

        System.out.print("Ingresa el nombre del dueño: ");
        String nombreDueño = scanner.nextLine();

        // Creación de objetos
        Perro miPerro = new Perro(nombrePerro, razaPerro);
        Dueño miDueño = new Dueño(nombreDueño);

        // Uso de métodos y relaciones
        System.out.println("El dueño es: " + miDueño.getNombre());
        miPerro.hacerSonido();
        miPerro.mostrarRaza();

        scanner.close(); // Cierra el escáner
    }
}
