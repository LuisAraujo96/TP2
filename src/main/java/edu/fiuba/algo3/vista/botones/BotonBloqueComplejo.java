package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.controlador.agarradores.BotonBloqueDragDetectedEventHandler;
import javafx.scene.image.Image;

public class BotonBloqueComplejo extends BotonDePrograma {

    private Image imagenDelBoton;

    public BotonBloqueComplejo(String bloqueID, String imgPath){
        super(bloqueID,imgPath );

        this.setOnDragDetected(new BotonBloqueDragDetectedEventHandler(this));
        //this.setOnDragOver();
        //this.setOnDragDropped();

    }
}
