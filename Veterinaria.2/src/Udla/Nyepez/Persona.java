package Udla.Nyepez;

// Clase base abstracta que representa a una Persona.
//Puede ser heredada por diferentes tipos de personas, como Persona Física o Jurídica.

public abstract class Persona {
    private String email;
    private String direccion;
    private String telefono;

    // Constructor para inicializar los atributos comunes de una persona.
    public Persona(String email, String direccion, String telefono) {
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Métodos getter y setter para los atributos (encapsulamiento).
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    // Métod de toString para mostrar los datos de la persona.
    @Override
    public String toString() {
        return "Email: " + email + ", Dirección: " + direccion + ", Teléfono: " + telefono;
    }
}

