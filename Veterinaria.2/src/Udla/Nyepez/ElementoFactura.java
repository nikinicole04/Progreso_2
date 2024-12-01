package Udla.Nyepez;

public class ElementoFactura {
    private String elemento;
    private float precio;

    public ElementoFactura(String elemento, float precio) {
        this.elemento = elemento;
        this.precio = precio;
    }

    public void mostrarInformacion() {
        System.out.println("- Elemento: " + elemento + ", Precio: " + precio);
    }
}
