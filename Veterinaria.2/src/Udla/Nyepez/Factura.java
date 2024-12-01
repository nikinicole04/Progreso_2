package Udla.Nyepez;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    private String refFactura;
    private List<ElementoFactura> elementosFactura = new ArrayList<>();

    public Factura(String refFactura) {
        this.refFactura = refFactura;
    }

    public void agregarElementoFactura(ElementoFactura elemento) {
        elementosFactura.add(elemento);
    }

    public void mostrarInformacion() {
        System.out.println("Referencia de Factura: " + refFactura);
        System.out.println("Elementos de la Factura:");
        for (ElementoFactura elemento : elementosFactura) {
            elemento.mostrarInformacion();
        }
    }
}

