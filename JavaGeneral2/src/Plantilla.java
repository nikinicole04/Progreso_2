import java.util.Scanner;

// Clase base
class BaseClass {
    protected String attribute;

    public BaseClass(String attribute) {
        this.attribute = attribute;
    }

    public void baseMethod() {
        System.out.println("Método de la clase base.");
    }
}

// Clase derivada - Herencia
class DerivedClass extends BaseClass {
    private String derivedAttribute;

    public DerivedClass(String attribute, String derivedAttribute) {
        super(attribute); // Llamada al constructor de la clase base
        this.derivedAttribute = derivedAttribute;
    }

    @Override
    public void baseMethod() {
        System.out.println("Método sobrescrito en la clase derivada.");
    }

    public void derivedMethod() {
        System.out.println("Atributo base: " + attribute + ", Atributo derivado: " + derivedAttribute);
    }
}

// Clase adicional para composición
class ComposedClass {
    private String composedAttribute;

    public ComposedClass(String composedAttribute) {
        this.composedAttribute = composedAttribute;
    }

    public String getComposedAttribute() {
        return composedAttribute;
    }
}

// Clase principal
public class MainTemplate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos para la clase base
        System.out.print("Ingresa el atributo de la clase base: ");
        String baseAttribute = scanner.nextLine();

        // Entrada de datos para la clase derivada
        System.out.print("Ingresa el atributo de la clase derivada: ");
        String derivedAttribute = scanner.nextLine();

        // Entrada de datos para la clase de composición
        System.out.print("Ingresa el atributo de la clase compuesta: ");
        String composedAttribute = scanner.nextLine();

        // Creación de objetos
        DerivedClass derivedObject = new DerivedClass(baseAttribute, derivedAttribute);
        ComposedClass composedObject = new ComposedClass(composedAttribute);

        // Uso de métodos
        System.out.println("\nUsando la clase derivada:");
        derivedObject.baseMethod(); // Método sobrescrito
        derivedObject.derivedMethod();

        System.out.println("\nUsando la clase compuesta:");
        System.out.println("Atributo de la clase compuesta: " + composedObject.getComposedAttribute());

        // Cerrar el escáner
        scanner.close();
    }
}
