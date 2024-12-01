package Udla.Nyepez;

/**
 * Subclase de Persona que representa a una Persona Jurídica.
 */
public class Juridica extends Persona {
    private String cif; // CIF es único para una persona jurídica.

    // Constructor que inicializa los atributos de la Persona y el CIF.
    public Juridica(String email, String direccion, String telefono, String cif) {
        super(email, direccion, telefono); // Llama al constructor de la clase base Persona.
        this.cif = cif;
    }

    // Métodos getter y setter para el atributo CIF.
    public String getCif() { return cif; }
    public void setCif(String cif) { this.cif = cif; }

    // Sobrescribe el método toString para incluir el CIF.
    @Override
    public String toString() {
        return "Persona Jurídica: " + super.toString() + ", CIF: " + cif;
    }
}
