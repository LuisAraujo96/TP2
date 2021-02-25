package edu.fiuba.algo3.controlador.agarradores;

import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class SeccionAlgoritmoDragDroppedEventHandler implements EventHandler<DragEvent> {
    private HBox contenedorDeBloquesHorizontal;
    private boolean agregadoDesdeUnContenedorComplejo = false;

    public SeccionAlgoritmoDragDroppedEventHandler(HBox contenedorDeBloquesHorizontal){
        this.contenedorDeBloquesHorizontal = contenedorDeBloquesHorizontal;
    }

    @Override
    public void handle(DragEvent dragEvent) {
        /* data dropped */
        System.out.println("onDragDropped");
        /* if there is a string data on dragboard, read it and use it */
        Dragboard db = dragEvent.getDragboard();
        boolean success = false;
        if (db.hasString() && !this.agregadoDesdeUnContenedorComplejo) {

            ImageView imageView = new ImageView(db.getImage());

            if (db.getString() == "BotonBloqueInversor" || db.getString() == "BotonRepetidorDoble" || db.getString() == "BotonRepetidorTriple"){

                VBox contenedorDeBloquesVertical = new VBox(imageView);

                contenedorDeBloquesVertical.setOnDragOver(new BotonBloqueContenedorDragOverEventHandler(contenedorDeBloquesVertical));
                contenedorDeBloquesVertical.setOnDragDropped(new BotonBloqueContenedorDragDroppedEventHandler(contenedorDeBloquesVertical, this));

                this.contenedorDeBloquesHorizontal.getChildren().add(contenedorDeBloquesVertical);

            } else {
                this.contenedorDeBloquesHorizontal.getChildren().add(imageView);
            }

            success = true;
        }

        if (this.agregadoDesdeUnContenedorComplejo) { this.agregadoDesdeUnContenedorComplejo = false; }

        /* let the source know whether the string was successfully
         * transferred and used */
        dragEvent.setDropCompleted(success);

    }

    public void agregueDesdeUnContenedorComplejo(){ this.agregadoDesdeUnContenedorComplejo = true; }

    public void agregarBloqueAlSectorAlgoritmo(String bloque_id){

    }
}
