package Udla.Nyepez;

import java.util.Date;

/**
 * Clase que representa un diagnóstico médico realizado a un animal.
 */
public class Diagnostico {
    private Date fecha; // Fecha del diagnóstico.
    private String descripcion; // Descripción del diagnóstico.
    private Animal animal; // Relación: el diagnóstico pertenece a un animal.
    private Personal personal; // Relación: un miembro del personal realiza el diagnóstico.

    // Constructor para inicializar un diagnóstico.
    public Diagnostico(Date fecha, String descripcion, Animal animal, Personal personal) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.animal = animal;
        this.personal = personal;
    }

    // Métodos getter y setter para los atributos.
    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public Animal getAnimal() { return animal; }
    public void setAnimal(Animal animal) { this.animal = animal; }
    public Personal getPersonal() { return personal; }
    public void setPersonal(Personal personal) { this.personal = personal; }

    // Métod toString para mostrar los datos del diagnóstico.
    @Override
    public String toString() {
        return "Diagnóstico: Fecha=" + fecha + ", Descripción=" + descripcion +
                ", Animal=[" + animal + "], Personal=[" + personal + "]";
    }
}
