package Udla.Nyepez;

//Subclase de Personal que representa a un Veterinario.

public class Veterinario extends Personal {

    // Constructor que inicializa los atributos del Veterinario.
    public Veterinario(String nombre, String apellidos, String fechaContratacion) {
        super(nombre, apellidos, fechaContratacion); // Llama al constructor de la clase base.
    }

    // Sobrescribe el métod toString para personalizarlo.
    @Override
    public String toString() {
        return "Veterinario: " + super.toString();
    }
}
