package edu.fiuba.algo3.controlador;

import edu.fiuba.algo3.modelo.Bloques.BloqueContenedor;
import edu.fiuba.algo3.modelo.Bloques.BloqueRepetidor;
import edu.fiuba.algo3.modelo.SectorAlgoritmo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class CreadorDeBloquesRepetidoresTriplesEventHandler implements EventHandler<ActionEvent> {
    SectorAlgoritmo sectorAlgoritmo;

    public CreadorDeBloquesRepetidoresTriplesEventHandler(SectorAlgoritmo unSector){
        this.sectorAlgoritmo = unSector;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.sectorAlgoritmo.agregarBloqueContenedor(((BloqueContenedor)new BloqueRepetidor(3)));
    }
}
