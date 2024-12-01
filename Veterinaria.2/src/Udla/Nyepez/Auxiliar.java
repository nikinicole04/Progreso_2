package Udla.Nyepez;

//Subclase de Personal que representa a un Auxiliar.

public class Auxiliar extends Personal {

    // Constructor que inicializa los atributos del Auxiliar.
    public Auxiliar(String nombre, String apellidos, String fechaContratacion) {
        super(nombre, apellidos, fechaContratacion); // Llama al constructor de la clase base.
    }

    // Sobrescribe el métod toString para personalizarlo.
    @Override
    public String toString() {
        return "Auxiliar: " + super.toString();
    }
}
