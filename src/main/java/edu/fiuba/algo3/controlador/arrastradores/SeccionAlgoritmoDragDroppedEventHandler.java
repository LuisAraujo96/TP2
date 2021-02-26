package edu.fiuba.algo3.controlador.arrastradores;

import edu.fiuba.algo3.modelo.Bloques.*;
import edu.fiuba.algo3.modelo.SectorAlgoritmo;
import javafx.event.EventHandler;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;

public class SeccionAlgoritmoDragDroppedEventHandler implements EventHandler<DragEvent> {
    private SectorAlgoritmo sectorAlgoritmo;

    public SeccionAlgoritmoDragDroppedEventHandler(SectorAlgoritmo sectorAlgoritmo){
        this.sectorAlgoritmo = sectorAlgoritmo;
    }

    @Override
    public void handle(DragEvent dragEvent) {
        /* data dropped */
        System.out.println("onDragDropped");

        /* if there is a string data on dragboard, read it and use it */
        Dragboard db = dragEvent.getDragboard();
        boolean success = false;

        if (db.hasString()) {
            this.agregarUnBloqueAlSectorAlgoritmo(db.getString());

            success = true;
        }

        /* let the source know whether the string was successfully
         * transferred and used */
        dragEvent.setDropCompleted(success);
    }

    public void agregarUnBloqueAlSectorAlgoritmo(String bloque_id){

        if (bloque_id == "BotonMoverArriba"){
            this.sectorAlgoritmo.agregarBloque(new BloqueArriba());
        } else if (bloque_id == "BotonMoverAbajo"){
            this.sectorAlgoritmo.agregarBloque(new BloqueAbajo());
        } else if (bloque_id == "BotonMoverIzquierda"){
            this.sectorAlgoritmo.agregarBloque(new BloqueIzquierda());
        } else if (bloque_id == "BotonMoverDerecha"){
            this.sectorAlgoritmo.agregarBloque(new BloqueDerecha());
        } else if (bloque_id == "BotonSubirLapiz"){
            this.sectorAlgoritmo.agregarBloque(new BloqueLapizArriba());
        } else if (bloque_id == "BotonBajarLapiz"){
            this.sectorAlgoritmo.agregarBloque(new BloqueLapizAbajo());
        } else if (bloque_id == "BotonBloqueInversor"){
            this.sectorAlgoritmo.agregarBloque(new BloqueInversor());
        } else if (bloque_id == "BotonRepetidorDoble"){
            this.sectorAlgoritmo.agregarBloque(new BloqueRepetidor(2));
        } else if (bloque_id == "BotonRepetidorTriple"){
            this.sectorAlgoritmo.agregarBloque(new BloqueRepetidor(3));
        }
    }
}
