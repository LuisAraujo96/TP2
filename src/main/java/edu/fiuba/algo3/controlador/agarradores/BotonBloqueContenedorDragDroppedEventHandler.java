package edu.fiuba.algo3.controlador.agarradores;

import edu.fiuba.algo3.modelo.Bloques.*;
import edu.fiuba.algo3.modelo.ContenedorDeBloques;
import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.layout.VBox;

public class BotonBloqueContenedorDragDroppedEventHandler implements EventHandler<DragEvent> {
    private VBox contenedorDeBloquesVertical;
    private ContenedorDeBloques bloqueContenedor;
    private SeccionAlgoritmoDragDroppedEventHandler eventoContenedorHorizontalDeBloques;

    public BotonBloqueContenedorDragDroppedEventHandler(VBox contenedorDeBloquesVertical, ContenedorDeBloques bloqueContenedor, SeccionAlgoritmoDragDroppedEventHandler eventoContenedorHorizontalDeBloques){
        this.contenedorDeBloquesVertical = contenedorDeBloquesVertical;
        this.bloqueContenedor = bloqueContenedor;
        this.eventoContenedorHorizontalDeBloques = eventoContenedorHorizontalDeBloques;
    }

    @Override
    public void handle(DragEvent dragEvent) {
        /* data dropped */
        System.out.println("onDragDropped");
        /* if there is a string data on dragboard, read it and use it */
        Dragboard db = dragEvent.getDragboard();
        boolean success = false;
        if (db.hasString() && db.getString() != "BotonBloqueInversor" && db.getString() != "BotonRepetidorDoble" && db.getString() != "BotonRepetidorTriple") {

            ImageView imageView = new ImageView(db.getImage());
            this.contenedorDeBloquesVertical.getChildren().add(imageView);

            this.agregarUnBloqueAlBloqueContenedor(db.getString());

            this.eventoContenedorHorizontalDeBloques.agregueDesdeUnContenedorComplejo();

            success = true;
        }
        /* let the source know whether the string was successfully
         * transferred and used */
        dragEvent.setDropCompleted(success);
    }

    public void agregarUnBloqueAlBloqueContenedor(String bloque_id){

        if (bloque_id == "BotonMoverArriba"){
            this.bloqueContenedor.agregarBloque(new BloqueArriba());
        } else if (bloque_id == "BotonMoverAbajo"){
            this.bloqueContenedor.agregarBloque(new BloqueAbajo());
        } else if (bloque_id == "BotonMoverIzquierda"){
            this.bloqueContenedor.agregarBloque(new BloqueIzquierda());
        } else if (bloque_id == "BotonMoverDerecha"){
            this.bloqueContenedor.agregarBloque(new BloqueDerecha());
        } else if (bloque_id == "BotonSubirLapiz"){
            this.bloqueContenedor.agregarBloque(new BloqueLapizArriba());
        } else if (bloque_id == "BotonBajarLapiz"){
            this.bloqueContenedor.agregarBloque(new BloqueLapizAbajo());
        } else if (bloque_id == "BotonBloqueInversor"){
            this.bloqueContenedor.agregarBloque(new BloqueInversor());
        } else if (bloque_id == "BotonRepetidorDoble"){
            this.bloqueContenedor.agregarBloque(new BloqueRepetidor(2));
        } else if (bloque_id == "BotonRepetidorTriple"){
            this.bloqueContenedor.agregarBloque(new BloqueRepetidor(3));
        }
    }
}
