package edu.fiuba.algo3.controlador.agarradores;

import edu.fiuba.algo3.modelo.SectorAlgoritmo;
import edu.fiuba.algo3.vista.alertas.AlertBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonGuardarAlgoritmoEventHandler implements EventHandler<ActionEvent> {


    private SectorAlgoritmo sectorAlgoritmo;

    public BotonGuardarAlgoritmoEventHandler(SectorAlgoritmo sectorAlgoritmo) {
        this.sectorAlgoritmo = sectorAlgoritmo;

    }

    @Override
    public void handle(ActionEvent actionEvent) {
        AlertBox.display("Guardado de Algoritmo Personalizado", "Ingrese un nombre para su bloque personalizado");

    }
}
