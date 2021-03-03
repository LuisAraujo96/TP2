package edu.fiuba.algo3.controlador.cliqueadores;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.SectorAlgoritmo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

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
        //Debugger
        System.out.println("X = " + this.personaje.obtenerPosicion().obtenerX());
        System.out.println("Y = " + this.personaje.obtenerPosicion().obtenerY());
    }


}
