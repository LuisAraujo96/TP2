package edu.fiuba.algo3.controlador.agarradores;

import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ContenedorDeBloquesVerticalDragDroppedEventHandler implements EventHandler<DragEvent> {
    private VBox contenedorDeBloquesVertical;
    private ContenedorDeBloquesHorizontalDragDroppedEventHandler evento;

    public ContenedorDeBloquesVerticalDragDroppedEventHandler(VBox contenedorDeBloquesVertical, ContenedorDeBloquesHorizontalDragDroppedEventHandler evento){
        this.contenedorDeBloquesVertical = contenedorDeBloquesVertical;
        this.evento = evento;
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
            this.contenedorDeBloquesVertical.getChildren().add(imageView);

            this.evento.agregueDesdeUnContenedorComplejo();

            success = true;
        }
        /* let the source know whether the string was successfully
         * transferred and used */
        dragEvent.setDropCompleted(success);

    }
}
