package edu.fiuba.algo3.controlador.agarradores;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.SectorAlgoritmo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.DragEvent;
import javafx.scene.input.TransferMode;

public class BotonEjecutarAlgoritmoEventHandler implements EventHandler<ActionEvent> {

    private Personaje personaje;
    private SectorAlgoritmo sectorAlgoritmo;

    public BotonEjecutarAlgoritmoEventHandler(Personaje personaje, SectorAlgoritmo sectorAlgoritmo) {
        this.personaje = personaje;
        this.sectorAlgoritmo = sectorAlgoritmo;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        sectorAlgoritmo.ejecutarPrograma(this.personaje);
        
    }


}
