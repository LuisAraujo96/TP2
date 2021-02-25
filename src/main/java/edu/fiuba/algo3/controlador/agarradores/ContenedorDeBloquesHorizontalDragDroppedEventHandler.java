package edu.fiuba.algo3.controlador.agarradores;

import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ContenedorDeBloquesHorizontalDragDroppedEventHandler implements EventHandler<DragEvent> {
    private HBox contenedorDeBloquesHorizontal;
    private boolean agregadoDesdeUnContenedorComplejo = false;

    public ContenedorDeBloquesHorizontalDragDroppedEventHandler(HBox contenedorDeBloquesHorizontal){
        this.contenedorDeBloquesHorizontal = contenedorDeBloquesHorizontal;
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

                VBox contenedorDeBloquesVertical = new VBox(imageView);
                contenedorDeBloquesVertical.setStyle("-fx-background-color: green");

                contenedorDeBloquesVertical.setOnDragOver(new ContenedorDeBloquesVerticalDragOverEventHandler(contenedorDeBloquesVertical));
                contenedorDeBloquesVertical.setOnDragDropped(new ContenedorDeBloquesVerticalDragDroppedEventHandler(contenedorDeBloquesVertical, this));

                this.contenedorDeBloquesHorizontal.getChildren().add(contenedorDeBloquesVertical);

            } else {
                this.contenedorDeBloquesHorizontal.getChildren().add(imageView);
            }

            if (this.agregadoDesdeUnContenedorComplejo) {

                this.contenedorDeBloquesHorizontal.getChildren().remove(imageView);
                this.agregadoDesdeUnContenedorComplejo = false;
            }

            success = true;
        }
        /* let the source know whether the string was successfully
         * transferred and used */
        dragEvent.setDropCompleted(success);

    }

    public void agregueDesdeUnContenedorComplejo(){ this.agregadoDesdeUnContenedorComplejo = true; }

    public void agregarBloqueAlSectorAlgoritmo(String bloque_id){

    }
}
