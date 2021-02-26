package edu.fiuba.algo3.vista.botones;

import edu.fiuba.algo3.controlador.arrastradores.BotonBloqueDragDetectedEventHandler;

public class BotonBloqueContenedor extends BotonDePrograma {

    public BotonBloqueContenedor(String bloqueID, String imgPath){
        super(bloqueID,imgPath );

        this.setOnDragDetected(new BotonBloqueDragDetectedEventHandler(this));
    }
}
