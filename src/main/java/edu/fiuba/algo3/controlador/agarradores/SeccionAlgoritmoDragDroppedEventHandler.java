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
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SeccionAlgoritmoDragDroppedEventHandler implements EventHandler<DragEvent> {
    private Pane seccionAlgoritmoContenedorDeBloques;

    public SeccionAlgoritmoDragDroppedEventHandler(Pane seccionAlgoritmoContenedorDeBloques){
        this.seccionAlgoritmoContenedorDeBloques = seccionAlgoritmoContenedorDeBloques;
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

            if (db.getString() == "BotonBloqueInversor" || db.getString() == "BotonRepetidorDoble" || db.getString() == "BotonRepetidorTriple"){

                VBox BloqueContenedorContenedorDeBloques = new VBox(imageView);
                BloqueContenedorContenedorDeBloques.setOnDragOver(new SeccionAlgoritmoDragOverEventHandler(BloqueContenedorContenedorDeBloques));
                BloqueContenedorContenedorDeBloques.setOnDragDropped(new SeccionAlgoritmoDragDroppedEventHandler(BloqueContenedorContenedorDeBloques));
                this.seccionAlgoritmoContenedorDeBloques.getChildren().add(BloqueContenedorContenedorDeBloques);

            } else {
                this.seccionAlgoritmoContenedorDeBloques.getChildren().add(imageView);
            }

            success = true;
        }
        /* let the source know whether the string was successfully
         * transferred and used */
        dragEvent.setDropCompleted(success);

    }

    public void agregarBloqueAlSectorAlgoritmo(String bloque_id){


    }
}
