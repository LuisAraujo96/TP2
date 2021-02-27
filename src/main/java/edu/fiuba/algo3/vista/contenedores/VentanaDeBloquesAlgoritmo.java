package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.modelo.Bloques.Bloque;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class VentanaDeBloquesAlgoritmo extends HBox{

    public VentanaDeBloquesAlgoritmo(String unNombre, Bloque unBLoque) {
        super();
        VistaDeBloque vistaDeBloque = new VistaDeBloque(unBLoque);
        Label nombre = new Label(unNombre);

        getChildren().add( vistaDeBloque );
        getChildren().add( nombre );
    }
}
