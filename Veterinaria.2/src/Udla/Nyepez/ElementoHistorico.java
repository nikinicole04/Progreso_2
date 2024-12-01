package Udla.Nyepez;

public class ElementoHistorico {
    private String descripcion;

    public ElementoHistorico(String descripcion) {
        this.descripcion = descripcion;
    }

    public void mostrarInformacion() {
        System.out.println("- Descripción: " + descripcion);
    }
}