package edu.fiuba.algo3.controlador.cliqueadores;

import edu.fiuba.algo3.modelo.Bloques.Bloque;
import edu.fiuba.algo3.modelo.Excepciones.AlgoritmoSinBloquesException;
import edu.fiuba.algo3.modelo.SectorAlgoritmo;
import edu.fiuba.algo3.modelo.SectorBloques;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;

public class GuardarAlgoritmoPersonalizadoEventHandler implements EventHandler{

    SectorAlgoritmo sectorAlgoritmo;
    SectorBloques sectorBloques;
    TextField textfield;

    public GuardarAlgoritmoPersonalizadoEventHandler(TextField textfield, SectorAlgoritmo sectorAlgoritmo, SectorBloques sectorBloques){
        this.textfield = textfield;
        this.sectorAlgoritmo = sectorAlgoritmo;
        this.sectorBloques = sectorBloques;
    }

    @Override
    public void handle(Event event) {

        try {
            System.out.println("LLEGO PRUEBA");
            Bloque[] bloques = sectorAlgoritmo.obtenerBloques();
            sectorBloques.guardarBloqueAlgoritmoPersonalizado(textfield.getText(), bloques);
        } catch (AlgoritmoSinBloquesException e) {

        }
    }
}
