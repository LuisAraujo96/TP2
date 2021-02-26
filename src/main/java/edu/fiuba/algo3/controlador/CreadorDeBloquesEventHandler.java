package edu.fiuba.algo3.controlador;

import edu.fiuba.algo3.modelo.FabricasDeBloques.FabricaDeBloques;
import edu.fiuba.algo3.modelo.SectorAlgoritmo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

//

public class CreadorDeBloquesEventHandler implements EventHandler<ActionEvent> {
    SectorAlgoritmo sectorAlgoritmo;
    FabricaDeBloques fabrica;

    public CreadorDeBloquesEventHandler(SectorAlgoritmo unSector, FabricaDeBloques unaFabrica){
        this.sectorAlgoritmo = unSector;
        this.fabrica = unaFabrica;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.sectorAlgoritmo.agregarBloque( this.fabrica.crearBloque() );
    }
}
