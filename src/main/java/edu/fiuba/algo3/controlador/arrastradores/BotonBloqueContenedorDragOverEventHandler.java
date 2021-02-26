package edu.fiuba.algo3.controlador.arrastradores;

import javafx.event.EventHandler;
import javafx.scene.input.DragEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.VBox;

public class BotonBloqueContenedorDragOverEventHandler implements EventHandler<DragEvent> {
    private VBox contenedorDeBloquesVertical;

    public BotonBloqueContenedorDragOverEventHandler(VBox contenedorDeBloquesVertical){
        this.contenedorDeBloquesVertical = contenedorDeBloquesVertical;
    }

    @Override
    public void handle(DragEvent dragEvent) {
        /* data is dragged over the target */

        /* accept it only if it is  not dragged from the same node
         * and if it has a string data */
        if (dragEvent.getGestureSource() != this.contenedorDeBloquesVertical &&
                dragEvent.getDragboard().hasString()) {
            /* allow for both copying and moving, whatever user chooses */
            dragEvent.acceptTransferModes(TransferMode.COPY_OR_MOVE);
        }

        dragEvent.consume();
    }
}
