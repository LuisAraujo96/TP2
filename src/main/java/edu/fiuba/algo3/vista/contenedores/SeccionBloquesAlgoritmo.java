package edu.fiuba.algo3.vista.contenedores;

import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class SeccionBloquesAlgoritmo extends VBox {

    public SeccionBloquesAlgoritmo(){
        super();

        this.setStyle("-fx-background-color: #FF5C4E");

        VBox columnaDeBotones = new VBox();
        VBox columnaDeNombres = new VBox();

        ScrollPane ventana = new ScrollPane();

        ventana.setContent(new HBox(columnaDeBotones, columnaDeNombres));

        ventana.setMinSize(200,550);

        getChildren().add(ventana);

        setMinSize(200, 690);
    }
}
