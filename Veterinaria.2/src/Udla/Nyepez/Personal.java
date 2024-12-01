package Udla.Nyepez;



// Clase base abstracta para empleados del personal.
// Puede ser extendida por Veterinario o Auxiliar.

public abstract class Personal {
    private String nombre;
    private String apellidos;
    private String fechaContratacion;

    // Constructor para inicializar los atributos del personal.
    public Personal(String nombre, String apellidos, String fechaContratacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaContratacion = fechaContratacion;
    }

    // Métodos getter y setter para los atributos del personal.
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }
    public String getFechaContratacion() { return fechaContratacion; }
    public void setFechaContratacion(String fechaContratacion) { this.fechaContratacion = fechaContratacion; }

    // Métod toString para mostrar los datos del personal.
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellidos: " + apellidos + ", Fecha Contratación: " + fechaContratacion;
    }
}


