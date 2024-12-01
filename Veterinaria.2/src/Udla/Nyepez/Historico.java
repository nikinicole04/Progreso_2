package Udla.Nyepez;
import java.util.ArrayList;
import java.util.List;

public class Historico {
    private String refHistorico;
    private List<ElementoHistorico> elementosHistoricos = new ArrayList<>();

    public Historico(String refHistorico) {
        this.refHistorico = refHistorico;
    }

    public void agregarElementoHistorico(ElementoHistorico elemento) {
        elementosHistoricos.add(elemento);
    }

    public void mostrarInformacion() {
        System.out.println("Referencia del Histórico: " + refHistorico);
        System.out.println("Elementos del Histórico:");
        for (ElementoHistorico elemento : elementosHistoricos) {
            elemento.mostrarInformacion();
        }
    }
}
