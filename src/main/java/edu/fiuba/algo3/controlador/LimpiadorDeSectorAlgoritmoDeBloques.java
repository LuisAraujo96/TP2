package edu.fiuba.algo3.controlador;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.SectorAlgoritmo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class LimpiadorDeSectorAlgoritmoDeBloques implements EventHandler<ActionEvent> {
    private SectorAlgoritmo sectorAlgoritmo;
    private Personaje personaje;

    public LimpiadorDeSectorAlgoritmoDeBloques(SectorAlgoritmo unSectorAlgoritmo, Personaje unPersonaje){
        this.sectorAlgoritmo = unSectorAlgoritmo;
        this.personaje = unPersonaje;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.sectorAlgoritmo.vaciarSector();
        this.personaje.resetPosicion();
    }
}
