package Udla.Nyepez;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase principal para interactuar con el sistema.
 * Permite registrar personas y animales, y mostrar la información.
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Persona> personas = new ArrayList<>();
    private static List<Animal> animales = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;
        do {
            // Mostrar el menú principal.
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Crear Persona");
            System.out.println("2. Crear Animal");
            System.out.println("3. Ver Personas");
            System.out.println("4. Ver Animales");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea.

            // Procesar la opción seleccionada.
            switch (opcion) {
                case 1:
                    crearPersona();
                    break;
                case 2:
                    crearAnimal();
                    break;
                case 3:
                    verPersonas();
                    break;
                case 4:
                    verAnimales();
                    break;
                case 5:
                    System.out.println("¡Saliendo del sistema!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5); // Salir cuando la opción sea 5.
    }

    private static void crearPersona() {
        // Pedir tipo de persona.
        System.out.print("¿Es Persona Física (1) o Jurídica (2)? ");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea.

        // Pedir datos comunes.
        System.out.print("Introduce el email: ");
        String email = scanner.nextLine();
        System.out.print("Introduce la dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Introduce el teléfono: ");
        String telefono = scanner.nextLine();

        // Crear la persona según el tipo.
        if (tipo == 1) {
            System.out.print("Introduce el DNI: ");
            String dni = scanner.nextLine();
            personas.add(new Fisica(email, direccion, telefono, dni));
        } else if (tipo == 2) {
            System.out.print("Introduce el CIF: ");
            String cif = scanner.nextLine();
            personas.add(new Juridica(email, direccion, telefono, cif));
        } else {
            System.out.println("Tipo no válido.");
        }
    }

    private static void crearAnimal() {
        // Pedir datos del animal.
        System.out.print("Introduce el tipo del animal: ");
        String tipo = scanner.nextLine();
        System.out.print("Introduce el nombre del animal: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce la edad del animal: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea.

        // Mostrar la lista de propietarios disponibles.
        System.out.println("Selecciona el propietario:");
        for (int i = 0; i < personas.size(); i++) {
            System.out.println((i + 1) + ". " + personas.get(i));
        }

        // Seleccionar un propietario.
        int propietarioIndex = scanner.nextInt() - 1;
        scanner.nextLine(); // Consumir el salto de línea.

        // Validar el índice del propietario.
        if (propietarioIndex >= 0 && propietarioIndex < personas.size()) {
            Persona propietario = personas.get(propietarioIndex);
            animales.add(new Animal(tipo, nombre, edad, propietario)); // Crear y registrar el animal.
            System.out.println("Animal registrado correctamente.");
        } else {
            System.out.println("Propietario no válido.");
        }
    }

    private static void verPersonas() {
        // Mostrar la lista de personas registradas.
        System.out.println("\n--- Personas Registradas ---");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

    private static void verAnimales() {
        // Mostrar la lista de animales registrados.
        System.out.println("\n--- Animales Registrados ---");
        for (Animal animal : animales) {
            System.out.println(animal);
        }
    }
}
