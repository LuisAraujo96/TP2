package edu.fiuba.algo3.controlador.agarradores;

import edu.fiuba.algo3.modelo.Bloques.*;
import edu.fiuba.algo3.modelo.ContenedorDeBloques;
import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class SeccionAlgoritmoDragDroppedEventHandler implements EventHandler<DragEvent> {
    private HBox contenedorDeBloquesHorizontal;
    private boolean agregadoDesdeUnContenedorComplejo = false;
    //private SectorAlgoritmo sectorAlgoritmo;

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

            Bloque bloqueCreado = this.agregarUnBloqueAlSectorAlgoritmo(db.getString());

            if (db.getString() == "BotonBloqueInversor" || db.getString() == "BotonRepetidorDoble" || db.getString() == "BotonRepetidorTriple"){

                VBox contenedorDeBloquesVertical = new VBox(imageView);

                contenedorDeBloquesVertical.setOnDragOver(new BotonBloqueContenedorDragOverEventHandler(contenedorDeBloquesVertical));
                contenedorDeBloquesVertical.setOnDragDropped(new BotonBloqueContenedorDragDroppedEventHandler(contenedorDeBloquesVertical, (ContenedorDeBloques)bloqueCreado, this));

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

    public Bloque agregarUnBloqueAlSectorAlgoritmo(String bloque_id){

        Bloque bloqueCreado = null;

        if (bloque_id == "BotonMoverArriba"){
            bloqueCreado = new BloqueArriba();
        } else if (bloque_id == "BotonMoverAbajo"){
            bloqueCreado = new BloqueAbajo();
        } else if (bloque_id == "BotonMoverIzquierda"){
            bloqueCreado = new BloqueIzquierda();
        } else if (bloque_id == "BotonMoverDerecha"){
            bloqueCreado = new BloqueDerecha();
        } else if (bloque_id == "BotonSubirLapiz"){
            bloqueCreado = new BloqueLapizArriba();
        } else if (bloque_id == "BotonBajarLapiz"){
            bloqueCreado = new BloqueLapizAbajo();
        } else if (bloque_id == "BotonBloqueInversor"){
            bloqueCreado = new BloqueInversor();
        } else if (bloque_id == "BotonRepetidorDoble"){
            bloqueCreado = new BloqueRepetidor(2);
        } else if (bloque_id == "BotonRepetidorTriple"){
            bloqueCreado = new BloqueRepetidor(3);
        }

        //this.sectorAlgoritmo.agregarBloque(bloqueCreado);
        return bloqueCreado;
    }
}
