package edu.fiuba.algo3.controlador;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.SectorDibujo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ReiniciadorDePantallaEventHandler implements EventHandler<ActionEvent> {
    SectorDibujo sectorDibujo;
    private Personaje personaje;

    public ReiniciadorDePantallaEventHandler(SectorDibujo unSectorDibujo, Personaje unPersonaje){
        this.sectorDibujo = unSectorDibujo;
        this.personaje = unPersonaje;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.sectorDibujo.restablecerDibujo();
        this.personaje.restablecerPersonaje();
    }
}
