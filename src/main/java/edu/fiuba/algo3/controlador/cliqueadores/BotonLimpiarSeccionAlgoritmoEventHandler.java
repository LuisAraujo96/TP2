package edu.fiuba.algo3.controlador.cliqueadores;

import edu.fiuba.algo3.modelo.SectorAlgoritmo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class BotonLimpiarSeccionAlgoritmoEventHandler implements EventHandler<ActionEvent> {

    private SectorAlgoritmo sectorAlgoritmo;

    public BotonLimpiarSeccionAlgoritmoEventHandler(SectorAlgoritmo sectorAlgoritmo) {
        this.sectorAlgoritmo = sectorAlgoritmo;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        sectorAlgoritmo.vaciarSector();
    }
}
