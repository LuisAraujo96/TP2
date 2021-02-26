package edu.fiuba.algo3.controlador.arrastradores;

import javafx.event.EventHandler;
import javafx.scene.input.DragEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.HBox;

public class SeccionAlgoritmoDragOverEventHandler implements EventHandler<DragEvent> {
    private HBox contenedorDeBloquesHorizontal;

    public SeccionAlgoritmoDragOverEventHandler(HBox contenedorDeBloquesHorizontal){
        this.contenedorDeBloquesHorizontal = contenedorDeBloquesHorizontal;
    }

    @Override
    public void handle(DragEvent dragEvent) {
        /* data is dragged over the target */

        /* accept it only if it is  not dragged from the same node
         * and if it has a string data */
        if (dragEvent.getGestureSource() != this.contenedorDeBloquesHorizontal &&
                dragEvent.getDragboard().hasString()) {
            /* allow for both copying and moving, whatever user chooses */
            dragEvent.acceptTransferModes(TransferMode.COPY_OR_MOVE);
        }

        dragEvent.consume();
    }
}