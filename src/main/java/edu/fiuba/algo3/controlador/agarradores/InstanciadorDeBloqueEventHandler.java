package edu.fiuba.algo3.controlador.agarradores;

import edu.fiuba.algo3.modelo.Bloques.Bloque;
import edu.fiuba.algo3.modelo.Bloques.BloqueArriba;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;

public class InstanciadorDeBloqueEventHandler implements EventHandler<ActionEvent> {
    private Bloque bloque;

    public InstanciadorDeBloqueEventHandler(Bloque unBloque){
        this.bloque = unBloque;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        //this.sectorAlgoritmo.agregarBloque(this.bloque);
    }
}
