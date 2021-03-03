package edu.fiuba.algo3.controlador;

import edu.fiuba.algo3.modelo.SectorDibujo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class LimpiadorDeSectorDibujoEventHandler implements EventHandler<ActionEvent> {
    SectorDibujo sectorDibujo;

    public LimpiadorDeSectorDibujoEventHandler (SectorDibujo unSectorDibujo){
        this.sectorDibujo = unSectorDibujo;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.sectorDibujo.reset();
    }
}
