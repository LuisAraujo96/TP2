package edu.fiuba.algo3.controlador.cliqueadores;

import edu.fiuba.algo3.modelo.SectorAlgoritmo;
import edu.fiuba.algo3.modelo.SectorBloques;
import edu.fiuba.algo3.vista.alertas.VentanaGuardarAlgoritmoPersonalizado;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonGuardarAlgoritmoEventHandler implements EventHandler<ActionEvent> {


    private SectorAlgoritmo sectorAlgoritmo;
    private SectorBloques sectorBloques;

    public BotonGuardarAlgoritmoEventHandler(SectorAlgoritmo sectorAlgoritmo, SectorBloques sectorBloques) {
        this.sectorAlgoritmo = sectorAlgoritmo;
        this.sectorBloques = sectorBloques;

    }

    @Override
    public void handle(ActionEvent actionEvent) {
        VentanaGuardarAlgoritmoPersonalizado.display("Guardado de Algoritmo Personalizado", "Ingrese un nombre para su bloque personalizado", sectorAlgoritmo, sectorBloques);
    }
}
