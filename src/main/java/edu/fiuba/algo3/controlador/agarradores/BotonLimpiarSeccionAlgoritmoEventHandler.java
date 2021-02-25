package edu.fiuba.algo3.controlador.agarradores;

import edu.fiuba.algo3.modelo.SectorAlgoritmo;
import edu.fiuba.algo3.vista.alertas.AlertBox;
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
        // Decirle a los chicos que agreguen un vaciarSectorAlgoritmo y decidir que pasa con el personaje

    }
}
