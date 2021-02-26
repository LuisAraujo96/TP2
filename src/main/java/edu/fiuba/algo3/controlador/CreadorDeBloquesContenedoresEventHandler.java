package edu.fiuba.algo3.controlador;

import edu.fiuba.algo3.modelo.Bloques.BloqueContenedor;
import edu.fiuba.algo3.modelo.FabricasDeBloques.FabricaDeBloques;
import edu.fiuba.algo3.modelo.SectorAlgoritmo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class CreadorDeBloquesContenedoresEventHandler implements EventHandler<ActionEvent> {
    SectorAlgoritmo sectorAlgoritmo;
    FabricaDeBloques fabrica;

    public CreadorDeBloquesContenedoresEventHandler(SectorAlgoritmo unSector, FabricaDeBloques unaFabrica){
        this.sectorAlgoritmo = unSector;
        this.fabrica = unaFabrica;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.sectorAlgoritmo.agregarBloqueContenedor( (BloqueContenedor) this.fabrica.crearBloque() );
    }
}
