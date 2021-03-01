package edu.fiuba.algo3.vista.contenedores;

import edu.fiuba.algo3.modelo.Bloques.Bloque;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class VistaDeBloquesAlgoritmo extends HBox{

    public VistaDeBloquesAlgoritmo(String unNombre, Bloque unBLoque) {
        super();

        this.setMaxWidth(215);
        this.setMinSize(215,88);
        this.setStyle("-fx-background-color: #a9aaaa");

        VistaDeBloque vistaDeBloque = new VistaDeBloque(unBLoque);
        Label nombre = new Label(unNombre);

        nombre.setFont(new Font(20));

        getChildren().add( vistaDeBloque );
        getChildren().add( nombre );
    }
}
