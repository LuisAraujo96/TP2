package edu.fiuba.algo3.controlador.arrastradores;

import edu.fiuba.algo3.vista.botones.BotonDePrograma;
import javafx.event.EventHandler;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;

public class BotonBloqueDragDetectedEventHandler implements EventHandler<MouseEvent> {
    private BotonDePrograma boton;

    public BotonBloqueDragDetectedEventHandler(BotonDePrograma unBoton){
        this.boton = unBoton;
    }

    @Override
    public void handle(MouseEvent mouseEvent) {
        /* drag was detected, start drag-and-drop gesture*/
        System.out.println("onDragDetected");

        /* allow any transfer mode */
        Dragboard db = this.boton.startDragAndDrop(TransferMode.ANY);

        /* put a string on dragboard */
        ClipboardContent content = new ClipboardContent();
        content.putString(this.boton.obtenerIDdelBoton());
        content.putImage(this.boton.obtenerImagenDelBoton());   //en el clipboard guardo la imagen del boton
        db.setContent(content);

        mouseEvent.consume();
    }
}
