package edu.fiuba.algo3.controlador.agarradores;

import edu.fiuba.algo3.modelo.Bloques.BloqueArriba;
import edu.fiuba.algo3.vista.contenedores.SeccionAlgoritmo;
import javafx.event.EventHandler;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.layout.HBox;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DragDroppedEventHandler implements EventHandler<DragEvent> {
    private HBox seccionDeBloques;

    public DragDroppedEventHandler(HBox seccionDeBloques){
        this.seccionDeBloques = seccionDeBloques;
    }

    @Override
    public void handle(DragEvent dragEvent) {
        /* data dropped */
        System.out.println("onDragDropped");
        /* if there is a string data on dragboard, read it and use it */
        Dragboard db = dragEvent.getDragboard();
        boolean success = false;
        if (db.hasString()) {

            ImageView imageView = new ImageView(db.getImage());
            this.seccionDeBloques.getChildren().add(imageView);

            //String nombre_Bloque = db.getString();
            //if (nombre_Bloque == BotonMoverArriba){
            //    this.sectorAlgoritmo.agregarBloque(new BloqueArriba());
            //}

            //TEST
            //System.out.println(db.getString());   //SI FUNCIONA
            //this.agregarBloqueAlSectorAlgoritmo
            //TEST

            success = true;
        }
        /* let the source know whether the string was successfully
         * transferred and used */
        dragEvent.setDropCompleted(success);

    }

    public void agregarBloqueAlSectorAlgoritmo(String bloque_id){


    }
}
