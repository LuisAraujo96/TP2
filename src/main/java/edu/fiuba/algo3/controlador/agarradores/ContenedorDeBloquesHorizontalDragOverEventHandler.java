package edu.fiuba.algo3.controlador.agarradores;

import edu.fiuba.algo3.vista.contenedores.SeccionAlgoritmo;
import javafx.event.EventHandler;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.DragEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class ContenedorDeBloquesHorizontalDragOverEventHandler implements EventHandler<DragEvent> {
    private HBox contenedorDeBloquesHorizontal;

    public ContenedorDeBloquesHorizontalDragOverEventHandler(HBox seccionDeBloques){
        this.contenedorDeBloquesHorizontal = contenedorDeBloquesHorizontal;
    }

    @Override
    public void handle(DragEvent dragEvent) {
        /* data is dragged over the target */
        System.out.println("onDragOver");

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
