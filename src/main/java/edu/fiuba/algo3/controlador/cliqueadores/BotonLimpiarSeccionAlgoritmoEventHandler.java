package edu.fiuba.algo3.controlador.cliqueadores;

import edu.fiuba.algo3.controlador.agarradores.SeccionAlgoritmoDragDroppedEventHandler;
import edu.fiuba.algo3.modelo.SectorAlgoritmo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class BotonLimpiarSeccionAlgoritmoEventHandler implements EventHandler<ActionEvent> {

    private SectorAlgoritmo sectorAlgoritmo;
    private SeccionAlgoritmoDragDroppedEventHandler seccionAlgoritmoDragDroppedEventHandler;

    public BotonLimpiarSeccionAlgoritmoEventHandler(SectorAlgoritmo sectorAlgoritmo, SeccionAlgoritmoDragDroppedEventHandler seccionAlgoritmoDragDroppedEventHandler) {
        this.sectorAlgoritmo = sectorAlgoritmo;
        this.seccionAlgoritmoDragDroppedEventHandler = seccionAlgoritmoDragDroppedEventHandler;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.seccionAlgoritmoDragDroppedEventHandler.limpiarContenedor();
        sectorAlgoritmo.vaciarSector();


    }
}
