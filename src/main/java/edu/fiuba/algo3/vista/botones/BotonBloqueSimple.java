package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.controlador.arrastradores.BotonBloqueDragDetectedEventHandler;

public class BotonBloqueSimple extends BotonDePrograma {

    public BotonBloqueSimple(String bloqueID, String imgPath){

        super(bloqueID, imgPath);
        this.setOnDragDetected(new BotonBloqueDragDetectedEventHandler(this));
    }
}
